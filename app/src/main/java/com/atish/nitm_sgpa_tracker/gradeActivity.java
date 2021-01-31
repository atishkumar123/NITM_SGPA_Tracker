package com.atish.nitm_sgpa_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class gradeActivity extends AppCompatActivity {
    String theo[] = {"Ex", "A", "B", "C", "D", "P", "F"};
    String pract[] = {"Ex", "A", "B", "C", "D", "F"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade);

        final int[] marks = {0};
        final int[] thismarks = {0};

        TextView linkage = (TextView) findViewById(R.id.linkage);
        linkage.setMovementMethod(LinkMovementMethod.getInstance());

        Intent intent = getIntent();
        int branch = intent.getIntExtra("final", 0);
        final Button button = (Button) findViewById(R.id.button);
        final Spinner spinn = (Spinner) findViewById(R.id.spinner);
        TextView hint = (TextView) findViewById(R.id.textView);
        final TextView subject = (TextView) findViewById(R.id.question);
        final ArrayAdapter<String> th = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, theo);
        final ArrayAdapter<String> pr = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, pract);
        th.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        pr.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        hint.setText("Select your grades");
        button.setText("Done");

        /*************************
         ******First Year*********
         *************************/

        if (branch == 11)            //First sem section A
        {
            subject.setText("Chemistry");       // Chemistry
            spinn.setAdapter(th);
            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 6)
                        thismarks[0] = 0;
                    else
                        thismarks[0] = 10 - position;
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    marks[0] += (6 * thismarks[0]);
                    subject.setText("Mechanics");       //Mechanics
                    spinn.setAdapter(th);
                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if (position == 6)
                                thismarks[0] = 0;
                            else
                                thismarks[0] = 10 - position;
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            marks[0] += (8 * thismarks[0]);
                            subject.setText("Mathematics");     //Maths
                            spinn.setAdapter(th);
                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                    if (position == 6)
                                        thismarks[0] = 0;
                                    else
                                        thismarks[0] = 10 - position;
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] += (6 * thismarks[0]);
                                    subject.setText("Physics");     //Physics
                                    spinn.setAdapter(th);
                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                            if (position == 6)
                                                thismarks[0] = 0;
                                            else
                                                thismarks[0] = 10 - position;
                                        }

                                        @Override
                                        public void onNothingSelected(AdapterView<?> parent) {

                                        }
                                    });
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] += (6 * thismarks[0]);
                                            subject.setText("Communication Skills");     //CS
                                            spinn.setAdapter(th);
                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                    if (position == 6)
                                                        thismarks[0] = 0;
                                                    else
                                                        thismarks[0] = 10 - position;
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] += (4 * thismarks[0]);
                                                    subject.setText("Chemistry LAB");     //chem lab
                                                    spinn.setAdapter(pr);
                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                        @Override
                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                            if (position == 5)
                                                                thismarks[0] = 0;
                                                            else
                                                                thismarks[0] = 10 - position;
                                                        }

                                                        @Override
                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                        }
                                                    });
                                                    button.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] += (2 * thismarks[0]);
                                                            subject.setText("Workshop");     //Workshop
                                                            spinn.setAdapter(pr);
                                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                @Override
                                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                    if (position == 5)
                                                                        thismarks[0] = 0;
                                                                    else
                                                                        thismarks[0] = 10 - position;
                                                                }

                                                                @Override
                                                                public void onNothingSelected(AdapterView<?> parent) {

                                                                }
                                                            });
                                                            button.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] += (3 * thismarks[0]);
                                                                    subject.setText("Engineering Drawing");     //ed
                                                                    spinn.setAdapter(pr);
                                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                        @Override
                                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                            if (position == 5)
                                                                                thismarks[0] = 0;
                                                                            else
                                                                                thismarks[0] = 10 - position;
                                                                        }

                                                                        @Override
                                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                                        }
                                                                    });
                                                                    button.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] += (5 * thismarks[0]);
                                                                            double total = marks[0];
                                                                            total /= 40.0;
                                                                            Intent intent = new Intent(gradeActivity.this, Marks.class);
                                                                            intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                            startActivity(intent);
                                                                            finish();
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });

        }

        if (branch == 12)            //First sem section B
        {
            subject.setText("Introduction to Computing");       // IC
            spinn.setAdapter(th);
            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 6)
                        thismarks[0] = 0;
                    else
                        thismarks[0] = 10 - position;
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    marks[0] += (6 * thismarks[0]);
                    subject.setText("BEES");       //BEES
                    spinn.setAdapter(th);
                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if (position == 6)
                                thismarks[0] = 0;
                            else
                                thismarks[0] = 10 - position;
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            marks[0] += (8 * thismarks[0]);
                            subject.setText("Mathematics");     //Maths
                            spinn.setAdapter(th);
                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                    if (position == 6)
                                        thismarks[0] = 0;
                                    else
                                        thismarks[0] = 10 - position;
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] += (6 * thismarks[0]);
                                    subject.setText("Physics");     //Physics
                                    spinn.setAdapter(th);
                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                            if (position == 6)
                                                thismarks[0] = 0;
                                            else
                                                thismarks[0] = 10 - position;
                                        }

                                        @Override
                                        public void onNothingSelected(AdapterView<?> parent) {

                                        }
                                    });
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] += (6 * thismarks[0]);
                                            subject.setText("Environmental Studies");     //EVS
                                            spinn.setAdapter(th);
                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                    if (position == 6)
                                                        thismarks[0] = 0;
                                                    else
                                                        thismarks[0] = 10 - position;
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] += (4 * thismarks[0]);
                                                    subject.setText("Computing LAB");     //IC lab
                                                    spinn.setAdapter(pr);
                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                        @Override
                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                            if (position == 5)
                                                                thismarks[0] = 0;
                                                            else
                                                                thismarks[0] = 10 - position;
                                                        }

                                                        @Override
                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                        }
                                                    });
                                                    button.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] += (4 * thismarks[0]);
                                                            subject.setText("BEES LAB");     //BEES LAB
                                                            spinn.setAdapter(pr);
                                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                @Override
                                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                    if (position == 5)
                                                                        thismarks[0] = 0;
                                                                    else
                                                                        thismarks[0] = 10 - position;
                                                                }

                                                                @Override
                                                                public void onNothingSelected(AdapterView<?> parent) {

                                                                }
                                                            });
                                                            button.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] += (3 * thismarks[0]);
                                                                    subject.setText("Physics Lab");     //Physics Lab
                                                                    spinn.setAdapter(pr);
                                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                        @Override
                                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                            if (position == 5)
                                                                                thismarks[0] = 0;
                                                                            else
                                                                                thismarks[0] = 10 - position;
                                                                        }

                                                                        @Override
                                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                                        }
                                                                    });
                                                                    button.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] += (3 * thismarks[0]);
                                                                            double total = marks[0];
                                                                            total /= 40.0;
                                                                            Intent intent = new Intent(gradeActivity.this, Marks.class);
                                                                            intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                            startActivity(intent);
                                                                            finish();
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });

        }

        if (branch == 21)            //Second sem section A
        {
            subject.setText("Introduction to Computing");       // IC
            spinn.setAdapter(th);
            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 6)
                        thismarks[0] = 0;
                    else
                        thismarks[0] = 10 - position;
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    marks[0] += (6 * thismarks[0]);
                    subject.setText("BEES");       //BEES
                    spinn.setAdapter(th);
                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if (position == 6)
                                thismarks[0] = 0;
                            else
                                thismarks[0] = 10 - position;
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            marks[0] += (8 * thismarks[0]);
                            subject.setText("Mathematics");     //Maths
                            spinn.setAdapter(th);
                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                    if (position == 6)
                                        thismarks[0] = 0;
                                    else
                                        thismarks[0] = 10 - position;
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] += (6 * thismarks[0]);
                                    subject.setText("Basic Electrical Eng");     //Physics
                                    spinn.setAdapter(th);
                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                            if (position == 6)
                                                thismarks[0] = 0;
                                            else
                                                thismarks[0] = 10 - position;
                                        }

                                        @Override
                                        public void onNothingSelected(AdapterView<?> parent) {

                                        }
                                    });
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] += (6 * thismarks[0]);
                                            subject.setText("Environmental Studies");     //EVS
                                            spinn.setAdapter(th);
                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                    if (position == 6)
                                                        thismarks[0] = 0;
                                                    else
                                                        thismarks[0] = 10 - position;
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] += (4 * thismarks[0]);
                                                    subject.setText("Computing LAB");     //IC lab
                                                    spinn.setAdapter(pr);
                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                        @Override
                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                            if (position == 5)
                                                                thismarks[0] = 0;
                                                            else
                                                                thismarks[0] = 10 - position;
                                                        }

                                                        @Override
                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                        }
                                                    });
                                                    button.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] += (4 * thismarks[0]);
                                                            subject.setText("Basic Electrical LAB");     //BEES LAB
                                                            spinn.setAdapter(pr);
                                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                @Override
                                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                    if (position == 5)
                                                                        thismarks[0] = 0;
                                                                    else
                                                                        thismarks[0] = 10 - position;
                                                                }

                                                                @Override
                                                                public void onNothingSelected(AdapterView<?> parent) {

                                                                }
                                                            });
                                                            button.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] += (3 * thismarks[0]);
                                                                    subject.setText("Physics Lab");     //Physics Lab
                                                                    spinn.setAdapter(pr);
                                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                        @Override
                                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                            if (position == 5)
                                                                                thismarks[0] = 0;
                                                                            else
                                                                                thismarks[0] = 10 - position;
                                                                        }

                                                                        @Override
                                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                                        }
                                                                    });
                                                                    button.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] += (3 * thismarks[0]);
                                                                            double total = marks[0];
                                                                            total /= 40.0;
                                                                            Intent intent = new Intent(gradeActivity.this, Marks.class);
                                                                            intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                            startActivity(intent);
                                                                            finish();
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });

        }


        if (branch == 22)            //Second sem section B
        {
            subject.setText("Chemistry");       // Chemistry
            spinn.setAdapter(th);
            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 6)
                        thismarks[0] = 0;
                    else
                        thismarks[0] = 10 - position;
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    marks[0] += (6 * thismarks[0]);
                    subject.setText("Mechanics");       //Mechanics
                    spinn.setAdapter(th);
                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if (position == 6)
                                thismarks[0] = 0;
                            else
                                thismarks[0] = 10 - position;
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            marks[0] += (8 * thismarks[0]);
                            subject.setText("Mathematics");     //Maths
                            spinn.setAdapter(th);
                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                    if (position == 6)
                                        thismarks[0] = 0;
                                    else
                                        thismarks[0] = 10 - position;
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] += (6 * thismarks[0]);
                                    subject.setText("Basic Electronics Eng");     //Physics
                                    spinn.setAdapter(th);
                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                            if (position == 6)
                                                thismarks[0] = 0;
                                            else
                                                thismarks[0] = 10 - position;
                                        }

                                        @Override
                                        public void onNothingSelected(AdapterView<?> parent) {

                                        }
                                    });
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] += (6 * thismarks[0]);
                                            subject.setText("Communication Skills");     //CS
                                            spinn.setAdapter(th);
                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                    if (position == 6)
                                                        thismarks[0] = 0;
                                                    else
                                                        thismarks[0] = 10 - position;
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] += (4 * thismarks[0]);
                                                    subject.setText("Chemistry LAB");     //chem lab
                                                    spinn.setAdapter(pr);
                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                        @Override
                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                            if (position == 5)
                                                                thismarks[0] = 0;
                                                            else
                                                                thismarks[0] = 10 - position;
                                                        }

                                                        @Override
                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                        }
                                                    });
                                                    button.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] += (2 * thismarks[0]);
                                                            subject.setText(" ME Workshop");     //Workshop
                                                            spinn.setAdapter(pr);
                                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                @Override
                                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                    if (position == 5)
                                                                        thismarks[0] = 0;
                                                                    else
                                                                        thismarks[0] = 10 - position;
                                                                }

                                                                @Override
                                                                public void onNothingSelected(AdapterView<?> parent) {

                                                                }
                                                            });
                                                            button.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] += (3 * thismarks[0]);
                                                                    subject.setText("Engineering Drawing");     //ed
                                                                    spinn.setAdapter(pr);
                                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                        @Override
                                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                            if (position == 5)
                                                                                thismarks[0] = 0;
                                                                            else
                                                                                thismarks[0] = 10 - position;
                                                                        }

                                                                        @Override
                                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                                        }
                                                                    });
                                                                    button.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] += (5 * thismarks[0]);
                                                                            double total = marks[0];
                                                                            total /= 40.0;
                                                                            Intent intent = new Intent(gradeActivity.this, Marks.class);
                                                                            intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                            startActivity(intent);
                                                                            finish();
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });

        }

        /*
         **********************************
         *******Computer Science and Engineering branch*****************
         **********************************
         */

        if (branch == 31)            //CSE 3rd semester
        {
            subject.setText("Maths");       // Maths
            spinn.setAdapter(th);
            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 6)
                        thismarks[0] = 0;
                    else
                        thismarks[0] = 10 - position;
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    marks[0] += (6 * thismarks[0]);
                    subject.setText("Data Structures");       //Data Structures
                    spinn.setAdapter(th);
                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if (position == 6)
                                thismarks[0] = 0;
                            else
                                thismarks[0] = 10 - position;
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            marks[0] += (6 * thismarks[0]);
                            subject.setText("Discrete Mathematics");     //Discrete Maths
                            spinn.setAdapter(th);
                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                    if (position == 6)
                                        thismarks[0] = 0;
                                    else
                                        thismarks[0] = 10 - position;
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] += (8 * thismarks[0]);
                                    subject.setText("Digital Design");     //Digital Design
                                    spinn.setAdapter(th);
                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                            if (position == 6)
                                                thismarks[0] = 0;
                                            else
                                                thismarks[0] = 10 - position;
                                        }

                                        @Override
                                        public void onNothingSelected(AdapterView<?> parent) {

                                        }
                                    });
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] += (6 * thismarks[0]);
                                            subject.setText("Engineering Economics");     //Engineering Economics
                                            spinn.setAdapter(th);
                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                    if (position == 6)
                                                        thismarks[0] = 0;
                                                    else
                                                        thismarks[0] = 10 - position;
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] += (4 * thismarks[0]);
                                                    subject.setText("Data Structures LAB");     //Data Structures lab
                                                    spinn.setAdapter(pr);
                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                        @Override
                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                            if (position == 5)
                                                                thismarks[0] = 0;
                                                            else
                                                                thismarks[0] = 10 - position;
                                                        }

                                                        @Override
                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                        }
                                                    });
                                                    button.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] += (3 * thismarks[0]);
                                                            subject.setText("Digital Design LAB");     //Digital Design LAB
                                                            spinn.setAdapter(pr);
                                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                @Override
                                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                    if (position == 5)
                                                                        thismarks[0] = 0;
                                                                    else
                                                                        thismarks[0] = 10 - position;
                                                                }

                                                                @Override
                                                                public void onNothingSelected(AdapterView<?> parent) {

                                                                }
                                                            });
                                                            button.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] += (3 * thismarks[0]);
                                                                    double total = marks[0];
                                                                    total /= 36.0;
                                                                    Intent intent = new Intent(gradeActivity.this, Marks.class);
                                                                    intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                    startActivity(intent);
                                                                    finish();
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });

        }
        if (branch == 41)            //CSE 4th semester
        {
            subject.setText("Formal Languages");       // Formal Languages
            spinn.setAdapter(th);
            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 6)
                        thismarks[0] = 0;
                    else
                        thismarks[0] = 10 - position;
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    marks[0] += (8 * thismarks[0]);
                    subject.setText("Algorithms");       //Algorithms
                    spinn.setAdapter(th);
                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if (position == 6)
                                thismarks[0] = 0;
                            else
                                thismarks[0] = 10 - position;
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            marks[0] += (6 * thismarks[0]);
                            subject.setText("Computer Architecture");     //Computer Architecture
                            spinn.setAdapter(th);
                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                    if (position == 6)
                                        thismarks[0] = 0;
                                    else
                                        thismarks[0] = 10 - position;
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] += (6 * thismarks[0]);
                                    subject.setText("Object Oriented Programming");     //Object Oriented Programming
                                    spinn.setAdapter(th);
                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                            if (position == 6)
                                                thismarks[0] = 0;
                                            else
                                                thismarks[0] = 10 - position;
                                        }

                                        @Override
                                        public void onNothingSelected(AdapterView<?> parent) {

                                        }
                                    });
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] += (6 * thismarks[0]);
                                            subject.setText("Probability and Random Process");     //Probability and Random Process
                                            spinn.setAdapter(th);
                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                    if (position == 6)
                                                        thismarks[0] = 0;
                                                    else
                                                        thismarks[0] = 10 - position;
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] += (6 * thismarks[0]);
                                                    subject.setText("Algorithms LAB");     //Algorithms lab
                                                    spinn.setAdapter(pr);
                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                        @Override
                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                            if (position == 5)
                                                                thismarks[0] = 0;
                                                            else
                                                                thismarks[0] = 10 - position;
                                                        }

                                                        @Override
                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                        }
                                                    });
                                                    button.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] += (3 * thismarks[0]);
                                                            subject.setText("Object Oriented Programming LAB");     //Object Oriented Programming LAB
                                                            spinn.setAdapter(pr);
                                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                @Override
                                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                    if (position == 5)
                                                                        thismarks[0] = 0;
                                                                    else
                                                                        thismarks[0] = 10 - position;
                                                                }

                                                                @Override
                                                                public void onNothingSelected(AdapterView<?> parent) {

                                                                }
                                                            });
                                                            button.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] += (3 * thismarks[0]);
                                                                    subject.setText("Peripherals and Accessories LAB");     //Peripherals and Accessories LAB
                                                                    spinn.setAdapter(pr);
                                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                        @Override
                                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                            if (position == 5)
                                                                                thismarks[0] = 0;
                                                                            else
                                                                                thismarks[0] = 10 - position;
                                                                        }

                                                                        @Override
                                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                                        }
                                                                    });
                                                                    button.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] += (3 * thismarks[0]);
                                                                            double total = marks[0];
                                                                            total /= 41.0;
                                                                            Intent intent = new Intent(gradeActivity.this, Marks.class);
                                                                            intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                            startActivity(intent);
                                                                            finish();
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });

        }
        if (branch == 51)            //CSE 5th semester
        {
            subject.setText("Optimization");       //Optimization
            spinn.setAdapter(th);
            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 6)
                        thismarks[0] = 0;
                    else
                        thismarks[0] = 10 - position;
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    marks[0] += (6 * thismarks[0]);
                    subject.setText("Software Engineering");       //Software Engineering
                    spinn.setAdapter(th);
                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if (position == 6)
                                thismarks[0] = 0;
                            else
                                thismarks[0] = 10 - position;
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            marks[0] += (6 * thismarks[0]);
                            subject.setText("Operating System");     //Operating System
                            spinn.setAdapter(th);
                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                    if (position == 6)
                                        thismarks[0] = 0;
                                    else
                                        thismarks[0] = 10 - position;
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] += (6 * thismarks[0]);
                                    subject.setText("Data Communication");     //"Data Communication"
                                    spinn.setAdapter(th);
                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                            if (position == 6)
                                                thismarks[0] = 0;
                                            else
                                                thismarks[0] = 10 - position;
                                        }

                                        @Override
                                        public void onNothingSelected(AdapterView<?> parent) {

                                        }
                                    });
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] += (8 * thismarks[0]);
                                            subject.setText("Numerical Methods");     //Numerical Methods
                                            spinn.setAdapter(th);
                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                    if (position == 6)
                                                        thismarks[0] = 0;
                                                    else
                                                        thismarks[0] = 10 - position;
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] += (6 * thismarks[0]);
                                                    subject.setText("Software Engineering LAB");     //Software Engineering LAB
                                                    spinn.setAdapter(pr);
                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                        @Override
                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                            if (position == 5)
                                                                thismarks[0] = 0;
                                                            else
                                                                thismarks[0] = 10 - position;
                                                        }

                                                        @Override
                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                        }
                                                    });
                                                    button.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] += (3 * thismarks[0]);
                                                            subject.setText("Operating Systems LAB");     //Object Oriented Programming LAB
                                                            spinn.setAdapter(pr);
                                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                @Override
                                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                    if (position == 5)
                                                                        thismarks[0] = 0;
                                                                    else
                                                                        thismarks[0] = 10 - position;
                                                                }

                                                                @Override
                                                                public void onNothingSelected(AdapterView<?> parent) {

                                                                }
                                                            });


                                                            button.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] += (3 * thismarks[0]);
                                                                    double total = marks[0];
                                                                    total /= 38.0;
                                                                    Intent intent = new Intent(gradeActivity.this, Marks.class);
                                                                    intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                    startActivity(intent);
                                                                    finish();
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });


        }


        if (branch == 61)            //CSE 6th semester
        {
            subject.setText("Management and Economics");       //Management and Economics
            spinn.setAdapter(th);
            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 6)
                        thismarks[0] = 0;
                    else
                        thismarks[0] = 10 - position;
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    marks[0] += (4 * thismarks[0]);
                    subject.setText("Databases");       //Databases
                    spinn.setAdapter(th);
                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if (position == 6)
                                thismarks[0] = 0;
                            else
                                thismarks[0] = 10 - position;
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            marks[0] += (6 * thismarks[0]);
                            subject.setText("Compilers");     //Compilers
                            spinn.setAdapter(th);
                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                    if (position == 6)
                                        thismarks[0] = 0;
                                    else
                                        thismarks[0] = 10 - position;
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] += (6 * thismarks[0]);
                                    subject.setText("Computer Networks");     //Computer Networks
                                    spinn.setAdapter(th);
                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                            if (position == 6)
                                                thismarks[0] = 0;
                                            else
                                                thismarks[0] = 10 - position;
                                        }

                                        @Override
                                        public void onNothingSelected(AdapterView<?> parent) {

                                        }
                                    });
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] += (6 * thismarks[0]);
                                            subject.setText("Information Storage and Retrieval");     //Information Storage and Retrieval
                                            spinn.setAdapter(th);
                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                    if (position == 6)
                                                        thismarks[0] = 0;
                                                    else
                                                        thismarks[0] = 10 - position;
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] += (8 * thismarks[0]);
                                                    subject.setText("Databases LAB");     //Databases lab
                                                    spinn.setAdapter(pr);
                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                        @Override
                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                            if (position == 5)
                                                                thismarks[0] = 0;
                                                            else
                                                                thismarks[0] = 10 - position;
                                                        }

                                                        @Override
                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                        }
                                                    });
                                                    button.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] += (3 * thismarks[0]);
                                                            subject.setText("Compilers LAB");     //System Programming LAB
                                                            spinn.setAdapter(pr);
                                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                @Override
                                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                    if (position == 5)
                                                                        thismarks[0] = 0;
                                                                    else
                                                                        thismarks[0] = 10 - position;
                                                                }

                                                                @Override
                                                                public void onNothingSelected(AdapterView<?> parent) {

                                                                }
                                                            });
                                                            button.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] += (3 * thismarks[0]);
                                                                    subject.setText("Computer Networks LAB");     //Computer Networks LAB
                                                                    spinn.setAdapter(pr);
                                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                        @Override
                                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                            if (position == 5)
                                                                                thismarks[0] = 0;
                                                                            else
                                                                                thismarks[0] = 10 - position;
                                                                        }

                                                                        @Override
                                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                                        }
                                                                    });
                                                                    button.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] += (3 * thismarks[0]);
                                                                            double total = marks[0];
                                                                            total /= 39.0;
                                                                            Intent intent = new Intent(gradeActivity.this, Marks.class);
                                                                            intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                            startActivity(intent);
                                                                            finish();
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });

        }
        if (branch == 71)            //CSE 7th semester
        {
            subject.setText("Computer Graphics");       //Computer Graphics
            spinn.setAdapter(th);
            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 6)
                        thismarks[0] = 0;
                    else
                        thismarks[0] = 10 - position;
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    marks[0] += (6 * thismarks[0]);
                    subject.setText("Machine Learning");       //Machine Learning
                    spinn.setAdapter(th);
                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if (position == 6)
                                thismarks[0] = 0;
                            else
                                thismarks[0] = 10 - position;
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            marks[0] += (6 * thismarks[0]);
                            subject.setText("Department Elective - I");     //Department Elective - I
                            spinn.setAdapter(th);
                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                    if (position == 6)
                                        thismarks[0] = 0;
                                    else
                                        thismarks[0] = 10 - position;
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] += (6 * thismarks[0]);
                                    subject.setText("Department Elective - II");     //Department Elective - II
                                    spinn.setAdapter(th);
                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                            if (position == 6)
                                                thismarks[0] = 0;
                                            else
                                                thismarks[0] = 10 - position;
                                        }

                                        @Override
                                        public void onNothingSelected(AdapterView<?> parent) {

                                        }
                                    });
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] += (6 * thismarks[0]);
                                            subject.setText("Department Elective - III");     //Department Elective - III
                                            spinn.setAdapter(th);
                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                    if (position == 6)
                                                        thismarks[0] = 0;
                                                    else
                                                        thismarks[0] = 10 - position;
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] += (6 * thismarks[0]);
                                                    subject.setText("Computer Graphics LAB");     //Computer Graphics LAB
                                                    spinn.setAdapter(pr);
                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                        @Override
                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                            if (position == 5)
                                                                thismarks[0] = 0;
                                                            else
                                                                thismarks[0] = 10 - position;
                                                        }

                                                        @Override
                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                        }
                                                    });



                                                            button.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] += (3 * thismarks[0]);
                                                                    subject.setText("Project - I");     //Project - I
                                                                    spinn.setAdapter(pr);
                                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                        @Override
                                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                            if (position == 5)
                                                                                thismarks[0] = 0;
                                                                            else
                                                                                thismarks[0] = 10 - position;
                                                                        }

                                                                        @Override
                                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                                        }
                                                                    });
                                                                    button.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] += (6 * thismarks[0]);
                                                                            subject.setText("Machine Learning Lab ");     //Machine Learning Lab
                                                                            spinn.setAdapter(pr);
                                                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                                @Override
                                                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                                    if (position == 5)
                                                                                        thismarks[0] = 0;
                                                                                    else
                                                                                        thismarks[0] = 10 - position;
                                                                                }

                                                                                @Override
                                                                                public void onNothingSelected(AdapterView<?> parent) {

                                                                                }
                                                                            });
                                                                    button.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] += (3 * thismarks[0]);
                                                                            double total = marks[0];
                                                                            total /= 42.0;
                                                                            Intent intent = new Intent(gradeActivity.this, Marks.class);
                                                                            intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                            startActivity(intent);
                                                                            finish();
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });

                }


            });
        }
        if (branch == 81)            //CSE 8th semester
        {
            subject.setText("Department Elective - IV");             //de4
            spinn.setAdapter(th);
            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 6)
                        thismarks[0] = 0;
                    else
                        thismarks[0] = 10 - position;
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    marks[0] += (6 * thismarks[0]);
                    subject.setText("Department Elective - V");                         //de5
                    spinn.setAdapter(th);
                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if (position == 6)
                                thismarks[0] = 0;
                            else
                                thismarks[0] = 10 - position;
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            marks[0] += (6 * thismarks[0]);
                            subject.setText("Department Elective - VI");               //de6
                            spinn.setAdapter(th);
                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                    if (position == 6)
                                        thismarks[0] = 0;
                                    else
                                        thismarks[0] = 10 - position;
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] += (6 * thismarks[0]);
                                    subject.setText("Project - II");               //project2
                                    spinn.setAdapter(th);
                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                            if (position == 6)
                                                thismarks[0] = 0;
                                            else
                                                thismarks[0] = 10 - position;
                                        }

                                        @Override
                                        public void onNothingSelected(AdapterView<?> parent) {

                                        }
                                    });
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] += (9 * thismarks[0]);
                                            double total = marks[0];
                                            total /= 27.0;
                                            Intent intent = new Intent(gradeActivity.this, Marks.class);
                                            intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                            startActivity(intent);
                                            finish();
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });

        }

        /*
         **********************************
         *******Electronics and Communication branch*****************
         **********************************
         */

        if (branch == 32)            //ECE 3rd semester
        {
            subject.setText("Network Analysis");             //na
            spinn.setAdapter(th);
            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 6)
                        thismarks[0] = 0;
                    else
                        thismarks[0] = 10 - position;
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    marks[0] += (6 * thismarks[0]);
                    subject.setText("Semiconductor Device and Circuits");                         //sdc
                    spinn.setAdapter(th);
                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if (position == 6)
                                thismarks[0] = 0;
                            else
                                thismarks[0] = 10 - position;
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            marks[0] += (6 * thismarks[0]);
                            subject.setText("Analog Circuits");               //AC
                            spinn.setAdapter(th);
                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                    if (position == 6)
                                        thismarks[0] = 0;
                                    else
                                        thismarks[0] = 10 - position;
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] += (6 * thismarks[0]);
                                    subject.setText("Maths");               //math
                                    spinn.setAdapter(th);
                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                            if (position == 6)
                                                thismarks[0] = 0;
                                            else
                                                thismarks[0] = 10 - position;
                                        }

                                        @Override
                                        public void onNothingSelected(AdapterView<?> parent) {

                                        }
                                    });
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] += (6 * thismarks[0]);
                                            subject.setText("HSS Elective");               //hss
                                            spinn.setAdapter(th);
                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                    if (position == 6)
                                                        thismarks[0] = 0;
                                                    else
                                                        thismarks[0] = 10 - position;
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] += (4 * thismarks[0]);
                                                    subject.setText("Network Analysis LAB");               //na lab
                                                    spinn.setAdapter(pr);
                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                        @Override
                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                            if (position == 5)
                                                                thismarks[0] = 0;
                                                            else
                                                                thismarks[0] = 10 - position;
                                                        }

                                                        @Override
                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                        }
                                                    });
                                                    button.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] += (3 * thismarks[0]);
                                                            subject.setText("Semiconductor Device LAB");               //sdc lab
                                                            spinn.setAdapter(pr);
                                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                @Override
                                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                    if (position == 5)
                                                                        thismarks[0] = 0;
                                                                    else
                                                                        thismarks[0] = 10 - position;
                                                                }

                                                                @Override
                                                                public void onNothingSelected(AdapterView<?> parent) {

                                                                }
                                                            });
                                                            button.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] += (3 * thismarks[0]);
                                                                    subject.setText("Analog Circuits LAB");        //ac lab
                                                                    spinn.setAdapter(pr);
                                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                        @Override
                                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                            if (position == 5)
                                                                                thismarks[0] = 0;
                                                                            else
                                                                                thismarks[0] = 10 - position;
                                                                        }

                                                                        @Override
                                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                                        }
                                                                    });
                                                                    button.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] += (3 * thismarks[0]);
                                                                            double total = marks[0];
                                                                            total /= 37.0;
                                                                            Intent intent = new Intent(gradeActivity.this, Marks.class);
                                                                            intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                            startActivity(intent);
                                                                            finish();
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });

        }
        if (branch == 42)            //ECE 4th semester
        {
            subject.setText("Digital Electronics");             //de
            spinn.setAdapter(th);
            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 6)
                        thismarks[0] = 0;
                    else
                        thismarks[0] = 10 - position;
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    marks[0] += (6 * thismarks[0]);
                    subject.setText("Analog Communication");                         //ac
                    spinn.setAdapter(th);
                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if (position == 6)
                                thismarks[0] = 0;
                            else
                                thismarks[0] = 10 - position;
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            marks[0] += (6 * thismarks[0]);
                            subject.setText("Electronics and Electrical Measurements");               //ee
                            spinn.setAdapter(th);
                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                    if (position == 6)
                                        thismarks[0] = 0;
                                    else
                                        thismarks[0] = 10 - position;
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] += (6 * thismarks[0]);
                                    subject.setText("Signals and System");               //signals
                                    spinn.setAdapter(th);
                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                            if (position == 6)
                                                thismarks[0] = 0;
                                            else
                                                thismarks[0] = 10 - position;
                                        }

                                        @Override
                                        public void onNothingSelected(AdapterView<?> parent) {

                                        }
                                    });
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] += (6 * thismarks[0]);
                                            subject.setText("Probability and Random Process");               //prob
                                            spinn.setAdapter(th);
                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                    if (position == 6)
                                                        thismarks[0] = 0;
                                                    else
                                                        thismarks[0] = 10 - position;
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] += (6 * thismarks[0]);
                                                    subject.setText("Digital Electronics LAB");               //de lab
                                                    spinn.setAdapter(pr);
                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                        @Override
                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                            if (position == 5)
                                                                thismarks[0] = 0;
                                                            else
                                                                thismarks[0] = 10 - position;
                                                        }

                                                        @Override
                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                        }
                                                    });
                                                    button.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] += (3 * thismarks[0]);
                                                            subject.setText("Analog Communication LAB");               //ac lab
                                                            spinn.setAdapter(pr);
                                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                @Override
                                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                    if (position == 5)
                                                                        thismarks[0] = 0;
                                                                    else
                                                                        thismarks[0] = 10 - position;
                                                                }

                                                                @Override
                                                                public void onNothingSelected(AdapterView<?> parent) {

                                                                }
                                                            });
                                                            button.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] += (3 * thismarks[0]);
                                                                    subject.setText("Electronics and Electrical Measurement LAB");        //ee lab
                                                                    spinn.setAdapter(pr);
                                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                        @Override
                                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                            if (position == 5)
                                                                                thismarks[0] = 0;
                                                                            else
                                                                                thismarks[0] = 10 - position;
                                                                        }

                                                                        @Override
                                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                                        }
                                                                    });
                                                                    button.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] += (3 * thismarks[0]);
                                                                            double total = marks[0];
                                                                            total /= 39.0;
                                                                            Intent intent = new Intent(gradeActivity.this, Marks.class);
                                                                            intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                            startActivity(intent);
                                                                            finish();
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });

        }
        if (branch == 52)            //ECE 5th semester
        {
            subject.setText("Microprocessors");             //micro
            spinn.setAdapter(th);
            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 6)
                        thismarks[0] = 0;
                    else
                        thismarks[0] = 10 - position;
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    marks[0] += (6 * thismarks[0]);
                    subject.setText("Digital Communication");                         //dc
                    spinn.setAdapter(th);
                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if (position == 6)
                                thismarks[0] = 0;
                            else
                                thismarks[0] = 10 - position;
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            marks[0] += (6 * thismarks[0]);
                            subject.setText("Electromagnetic  Theory");               //em
                            spinn.setAdapter(th);
                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                    if (position == 6)
                                        thismarks[0] = 0;
                                    else
                                        thismarks[0] = 10 - position;
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] += (6 * thismarks[0]);
                                    subject.setText("Digital Signal Processing");               //digital signals
                                    spinn.setAdapter(th);
                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                            if (position == 6)
                                                thismarks[0] = 0;
                                            else
                                                thismarks[0] = 10 - position;
                                        }

                                        @Override
                                        public void onNothingSelected(AdapterView<?> parent) {

                                        }
                                    });
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] += (6 * thismarks[0]);
                                            subject.setText("Control System");               //cs
                                            spinn.setAdapter(th);
                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                    if (position == 6)
                                                        thismarks[0] = 0;
                                                    else
                                                        thismarks[0] = 10 - position;
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] += (6 * thismarks[0]);
                                                    subject.setText("Microprocessors LAB");     //Microprocessors lab
                                                    spinn.setAdapter(pr);
                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                        @Override
                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                            if (position == 5)
                                                                thismarks[0] = 0;
                                                            else
                                                                thismarks[0] = 10 - position;
                                                        }

                                                        @Override
                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                        }
                                                    });
                                                    button.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] += (3 * thismarks[0]);
                                                            subject.setText("Digital Communication LAB");               //dc lab
                                                            spinn.setAdapter(pr);
                                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                @Override
                                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                    if (position == 5)
                                                                        thismarks[0] = 0;
                                                                    else
                                                                        thismarks[0] = 10 - position;
                                                                }

                                                                @Override
                                                                public void onNothingSelected(AdapterView<?> parent) {

                                                                }
                                                            });
                                                            button.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] += (3 * thismarks[0]);
                                                                    subject.setText("Digital Signal Processing LAB");        //digital signals lab
                                                                    spinn.setAdapter(pr);
                                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                        @Override
                                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                            if (position == 5)
                                                                                thismarks[0] = 0;
                                                                            else
                                                                                thismarks[0] = 10 - position;
                                                                        }

                                                                        @Override
                                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                                        }
                                                                    });
                                                                    button.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] += (3 * thismarks[0]);
                                                                            subject.setText("Control Systems LAB");           //cs LAB
                                                                            spinn.setAdapter(pr);
                                                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                                @Override
                                                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                                    if (position == 5)
                                                                                        thismarks[0] = 0;
                                                                                    else
                                                                                        thismarks[0] = 10 - position;
                                                                                }

                                                                                @Override
                                                                                public void onNothingSelected(AdapterView<?> parent) {

                                                                                }
                                                                            });
                                                                            button.setOnClickListener(new View.OnClickListener() {
                                                                                @Override
                                                                                public void onClick(View v) {
                                                                                    marks[0] += (3 * thismarks[0]);
                                                                                    double total = marks[0];
                                                                                    total /= 42.0;
                                                                                    Intent intent = new Intent(gradeActivity.this, Marks.class);
                                                                                    intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                                    startActivity(intent);
                                                                                    finish();
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });

        }
        if (branch == 62)            //ECE 6th semester
        {
            subject.setText("VLSI Design");             //vlsi
            spinn.setAdapter(th);
            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 6)
                        thismarks[0] = 0;
                    else
                        thismarks[0] = 10 - position;
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    marks[0] += (6 * thismarks[0]);
                    subject.setText("Embedded System");                         //embedded systems
                    spinn.setAdapter(th);
                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if (position == 6)
                                thismarks[0] = 0;
                            else
                                thismarks[0] = 10 - position;
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            marks[0] += (6 * thismarks[0]);
                            subject.setText("Industrial Electronics");               //industrial
                            spinn.setAdapter(th);
                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                    if (position == 6)
                                        thismarks[0] = 0;
                                    else
                                        thismarks[0] = 10 - position;
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] += (6 * thismarks[0]);
                                    subject.setText("Antenna Design");               //antenna
                                    spinn.setAdapter(th);
                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                            if (position == 6)
                                                thismarks[0] = 0;
                                            else
                                                thismarks[0] = 10 - position;
                                        }

                                        @Override
                                        public void onNothingSelected(AdapterView<?> parent) {

                                        }
                                    });
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] += (6 * thismarks[0]);
                                            subject.setText("VHDL");               //vhdl
                                            spinn.setAdapter(th);
                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                    if (position == 6)
                                                        thismarks[0] = 0;
                                                    else
                                                        thismarks[0] = 10 - position;
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] += (6 * thismarks[0]);
                                                    subject.setText("VLSI and VHDL LAB");               //VLSI lab
                                                    spinn.setAdapter(pr);
                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                        @Override
                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                            if (position == 5)
                                                                thismarks[0] = 0;
                                                            else
                                                                thismarks[0] = 10 - position;
                                                        }

                                                        @Override
                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                        }
                                                    });
                                                    button.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] += (3 * thismarks[0]);
                                                            subject.setText("Embedded System LAB");               //embedded lab
                                                            spinn.setAdapter(pr);
                                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                @Override
                                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                    if (position == 5)
                                                                        thismarks[0] = 0;
                                                                    else
                                                                        thismarks[0] = 10 - position;
                                                                }

                                                                @Override
                                                                public void onNothingSelected(AdapterView<?> parent) {

                                                                }
                                                            });
                                                            button.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] += (3 * thismarks[0]);
                                                                    subject.setText("Industrial Electronics LAB");        //industrial signals lab
                                                                    spinn.setAdapter(pr);
                                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                        @Override
                                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                            if (position == 5)
                                                                                thismarks[0] = 0;
                                                                            else
                                                                                thismarks[0] = 10 - position;
                                                                        }

                                                                        @Override
                                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                                        }
                                                                    });
                                                                    button.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] += (3 * thismarks[0]);
                                                                            subject.setText("Antenna Design LAB");           //antenna LAB
                                                                            spinn.setAdapter(pr);
                                                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                                @Override
                                                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                                    if (position == 5)
                                                                                        thismarks[0] = 0;
                                                                                    else
                                                                                        thismarks[0] = 10 - position;
                                                                                }

                                                                                @Override
                                                                                public void onNothingSelected(AdapterView<?> parent) {

                                                                                }
                                                                            });
                                                                            button.setOnClickListener(new View.OnClickListener() {
                                                                                @Override
                                                                                public void onClick(View v) {
                                                                                    marks[0] += (3 * thismarks[0]);
                                                                                    double total = marks[0];
                                                                                    total /= 42.0;
                                                                                    Intent intent = new Intent(gradeActivity.this, Marks.class);
                                                                                    intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                                    startActivity(intent);
                                                                                    finish();
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });

        }
        if (branch == 72)            //ECE 7th semester
        {
            subject.setText("Industrial Management");             //industrial
            spinn.setAdapter(th);
            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 6)
                        thismarks[0] = 0;
                    else
                        thismarks[0] = 10 - position;
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    marks[0] += (4 * thismarks[0]);
                    subject.setText("Microwave Engineering");                         //me
                    spinn.setAdapter(th);
                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if (position == 6)
                                thismarks[0] = 0;
                            else
                                thismarks[0] = 10 - position;
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            marks[0] += (6 * thismarks[0]);
                            subject.setText("Computer Networks");               //computer
                            spinn.setAdapter(th);
                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                    if (position == 6)
                                        thismarks[0] = 0;
                                    else
                                        thismarks[0] = 10 - position;
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] += (6 * thismarks[0]);
                                    subject.setText("Department Elective - I");     //Department Elective - I
                                    spinn.setAdapter(th);
                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                            if (position == 6)
                                                thismarks[0] = 0;
                                            else
                                                thismarks[0] = 10 - position;
                                        }

                                        @Override
                                        public void onNothingSelected(AdapterView<?> parent) {

                                        }
                                    });
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] += (6 * thismarks[0]);
                                            subject.setText("Department Elective - II");     //Department Elective - II
                                            spinn.setAdapter(th);
                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                    if (position == 6)
                                                        thismarks[0] = 0;
                                                    else
                                                        thismarks[0] = 10 - position;
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] += (6 * thismarks[0]);
                                                    subject.setText("Microwave Engineering LAB");               //mw lab
                                                    spinn.setAdapter(pr);
                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                        @Override
                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                            if (position == 5)
                                                                thismarks[0] = 0;
                                                            else
                                                                thismarks[0] = 10 - position;
                                                        }

                                                        @Override
                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                        }
                                                    });
                                                    button.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] += (3 * thismarks[0]);
                                                            subject.setText("Computer Networks LAB");        //networks lab
                                                            spinn.setAdapter(pr);
                                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                @Override
                                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                    if (position == 5)
                                                                        thismarks[0] = 0;
                                                                    else
                                                                        thismarks[0] = 10 - position;
                                                                }

                                                                @Override
                                                                public void onNothingSelected(AdapterView<?> parent) {

                                                                }
                                                            });
                                                            button.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] += (3 * thismarks[0]);
                                                                    subject.setText("Project - I");     //Project - I
                                                                    spinn.setAdapter(th);
                                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                        @Override
                                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                            if (position == 5)
                                                                                thismarks[0] = 0;
                                                                            else
                                                                                thismarks[0] = 10 - position;
                                                                        }

                                                                        @Override
                                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                                        }
                                                                    });
                                                                    button.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] += (3 * thismarks[0]);
                                                                            double total = marks[0];
                                                                            total /= 37.0;
                                                                            Intent intent = new Intent(gradeActivity.this, Marks.class);
                                                                            intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                            startActivity(intent);
                                                                            finish();
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });

        }
        if (branch == 82)            //ECE 8th semester
        {
            subject.setText("Department Elective - III");             //de3
            spinn.setAdapter(th);
            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 6)
                        thismarks[0] = 0;
                    else
                        thismarks[0] = 10 - position;
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    marks[0] += (6 * thismarks[0]);
                    subject.setText("Department Elective - IV");                         //de4
                    spinn.setAdapter(th);
                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if (position == 6)
                                thismarks[0] = 0;
                            else
                                thismarks[0] = 10 - position;
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            marks[0] += (6 * thismarks[0]);
                            subject.setText("Open Elective");               //oe
                            spinn.setAdapter(th);
                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                    if (position == 6)
                                        thismarks[0] = 0;
                                    else
                                        thismarks[0] = 10 - position;
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] += (6 * thismarks[0]);
                                    subject.setText("Soft Skills");               //soft skills
                                    spinn.setAdapter(th);
                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                            if (position == 6)
                                                thismarks[0] = 0;
                                            else
                                                thismarks[0] = 10 - position;
                                        }

                                        @Override
                                        public void onNothingSelected(AdapterView<?> parent) {

                                        }
                                    });
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] += (4 * thismarks[0]);
                                            subject.setText("Project - II");               //project2
                                            spinn.setAdapter(th);
                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                    if (position == 6)
                                                        thismarks[0] = 0;
                                                    else
                                                        thismarks[0] = 10 - position;
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] += (9 * thismarks[0]);
                                                    double total = marks[0];
                                                    total /= 31.0;
                                                    Intent intent = new Intent(gradeActivity.this, Marks.class);
                                                    intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                    startActivity(intent);
                                                    finish();
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });

        }
        /*
         **********************************
         *******Mechanical branch*****************
         **********************************
         */

        if (branch == 33)            //ME 3rd semester
        {
            subject.setText("Mathematics");             //maths
            spinn.setAdapter(th);
            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 6)
                        thismarks[0] = 0;
                    else
                        thismarks[0] = 10 - position;
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    marks[0] += (6 * thismarks[0]);
                    subject.setText("Engineering Thermodynamics");                         //thermo
                    spinn.setAdapter(th);
                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if (position == 6)
                                thismarks[0] = 0;
                            else
                                thismarks[0] = 10 - position;
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            marks[0] += (8 * thismarks[0]);
                            subject.setText("Strength of Materials");               //strength
                            spinn.setAdapter(th);
                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                    if (position == 6)
                                        thismarks[0] = 0;
                                    else
                                        thismarks[0] = 10 - position;
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] += (6 * thismarks[0]);
                                    subject.setText("Engineering Materials");               //eng. materials
                                    spinn.setAdapter(th);
                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                            if (position == 6)
                                                thismarks[0] = 0;
                                            else
                                                thismarks[0] = 10 - position;
                                        }

                                        @Override
                                        public void onNothingSelected(AdapterView<?> parent) {

                                        }
                                    });
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] += (6 * thismarks[0]);
                                            subject.setText("Manufacturing Technology");               //manufacturing
                                            spinn.setAdapter(th);
                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                    if (position == 6)
                                                        thismarks[0] = 0;
                                                    else
                                                        thismarks[0] = 10 - position;
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] += (6 * thismarks[0]);
                                                    subject.setText("Machine Drawing");               //machine drawing
                                                    spinn.setAdapter(pr);
                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                        @Override
                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                            if (position == 5)
                                                                thismarks[0] = 0;
                                                            else
                                                                thismarks[0] = 10 - position;
                                                        }

                                                        @Override
                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                        }
                                                    });
                                                    button.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] += (5 * thismarks[0]);
                                                            subject.setText("Strength of Materials LAB");               //stength lab
                                                            spinn.setAdapter(pr);
                                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                @Override
                                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                    if (position == 5)
                                                                        thismarks[0] = 0;
                                                                    else
                                                                        thismarks[0] = 10 - position;
                                                                }

                                                                @Override
                                                                public void onNothingSelected(AdapterView<?> parent) {

                                                                }
                                                            });
                                                            button.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] += (3 * thismarks[0]);
                                                                    double total = marks[0];
                                                                    total /= 40.0;
                                                                    Intent intent = new Intent(gradeActivity.this, Marks.class);
                                                                    intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                    startActivity(intent);
                                                                    finish();
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });

        }
        if (branch == 43)            //ME 4th semester
        {
            subject.setText("Numerical Methods");             //numerical methods
            spinn.setAdapter(th);
            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 6)
                        thismarks[0] = 0;
                    else
                        thismarks[0] = 10 - position;
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    marks[0] += (6 * thismarks[0]);
                    subject.setText("Fluid Mechanics");                         //fluid
                    spinn.setAdapter(th);
                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if (position == 6)
                                thismarks[0] = 0;
                            else
                                thismarks[0] = 10 - position;
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            marks[0] += (8 * thismarks[0]);
                            subject.setText("Kinematics of Machinery");               //kinematics
                            spinn.setAdapter(th);
                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                    if (position == 6)
                                        thismarks[0] = 0;
                                    else
                                        thismarks[0] = 10 - position;
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] += (6 * thismarks[0]);
                                    subject.setText("Heat and Mass Transfer");               //heat
                                    spinn.setAdapter(th);
                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                            if (position == 6)
                                                thismarks[0] = 0;
                                            else
                                                thismarks[0] = 10 - position;
                                        }

                                        @Override
                                        public void onNothingSelected(AdapterView<?> parent) {

                                        }
                                    });
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] += (8 * thismarks[0]);
                                            subject.setText("Manufacturing Technology - II");               //manufacturing
                                            spinn.setAdapter(th);
                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                    if (position == 6)
                                                        thismarks[0] = 0;
                                                    else
                                                        thismarks[0] = 10 - position;
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] += (6 * thismarks[0]);
                                                    subject.setText("Heat Transfer LAB");               //heat transfer
                                                    spinn.setAdapter(pr);
                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                        @Override
                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                            if (position == 5)
                                                                thismarks[0] = 0;
                                                            else
                                                                thismarks[0] = 10 - position;
                                                        }

                                                        @Override
                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                        }
                                                    });
                                                    button.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] += (3 * thismarks[0]);
                                                            subject.setText("Manufacturing Technology LAB");               //manufacturing technology lab
                                                            spinn.setAdapter(pr);
                                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                @Override
                                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                    if (position == 5)
                                                                        thismarks[0] = 0;
                                                                    else
                                                                        thismarks[0] = 10 - position;
                                                                }

                                                                @Override
                                                                public void onNothingSelected(AdapterView<?> parent) {

                                                                }
                                                            });
                                                            button.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] += (3 * thismarks[0]);
                                                                    double total = marks[0];
                                                                    total /= 40.0;
                                                                    Intent intent = new Intent(gradeActivity.this, Marks.class);
                                                                    intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                    startActivity(intent);
                                                                    finish();
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });

        }
        if (branch == 53)            //ME 5th semester
        {
            subject.setText("Mechanical Measurements and Metrology");             //measurements
            spinn.setAdapter(th);
            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 6)
                        thismarks[0] = 0;
                    else
                        thismarks[0] = 10 - position;
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    marks[0] += (6 * thismarks[0]);
                    subject.setText("Turbomachines");                         //turbo
                    spinn.setAdapter(th);
                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if (position == 6)
                                thismarks[0] = 0;
                            else
                                thismarks[0] = 10 - position;
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            marks[0] += (6 * thismarks[0]);
                            subject.setText("Dynamics of Machinery");               //machinery
                            spinn.setAdapter(th);
                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                    if (position == 6)
                                        thismarks[0] = 0;
                                    else
                                        thismarks[0] = 10 - position;
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] += (8 * thismarks[0]);
                                    subject.setText("Thermal Engineering - I");               //Thermal Eng1
                                    spinn.setAdapter(th);
                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                            if (position == 6)
                                                thismarks[0] = 0;
                                            else
                                                thismarks[0] = 10 - position;
                                        }

                                        @Override
                                        public void onNothingSelected(AdapterView<?> parent) {

                                        }
                                    });
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] += (6 * thismarks[0]);
                                            subject.setText("Design of Machine Elements - I");               //machine elements
                                            spinn.setAdapter(th);
                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                    if (position == 6)
                                                        thismarks[0] = 0;
                                                    else
                                                        thismarks[0] = 10 - position;
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] += (6 * thismarks[0]);
                                                    subject.setText("Measurements and Metrology LAB");               //Measurements lab
                                                    spinn.setAdapter(pr);
                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                        @Override
                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                            if (position == 5)
                                                                thismarks[0] = 0;
                                                            else
                                                                thismarks[0] = 10 - position;
                                                        }

                                                        @Override
                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                        }
                                                    });
                                                    button.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] += (3 * thismarks[0]);
                                                            subject.setText("Fluid Mechanics and Turbomachinery LAB");               //fluid lab
                                                            spinn.setAdapter(pr);
                                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                @Override
                                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                    if (position == 5)
                                                                        thismarks[0] = 0;
                                                                    else
                                                                        thismarks[0] = 10 - position;
                                                                }

                                                                @Override
                                                                public void onNothingSelected(AdapterView<?> parent) {

                                                                }
                                                            });
                                                            button.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] += (3 * thismarks[0]);
                                                                    subject.setText("Dynamics of Machine LAB");       //dynamics LAB
                                                                    spinn.setAdapter(pr);
                                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                        @Override
                                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                            if (position == 5)
                                                                                thismarks[0] = 0;
                                                                            else
                                                                                thismarks[0] = 10 - position;
                                                                        }

                                                                        @Override
                                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                                        }
                                                                    });
                                                                    button.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] += (3 * thismarks[0]);
                                                                            double total = marks[0];
                                                                            total /= 41.0;
                                                                            Intent intent = new Intent(gradeActivity.this, Marks.class);
                                                                            intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                            startActivity(intent);
                                                                            finish();
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });

        }
        if (branch == 63)            //ME 6th semester
        {
            subject.setText("Mechatronics");             //mechatronics
            spinn.setAdapter(th);
            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 6)
                        thismarks[0] = 0;
                    else
                        thismarks[0] = 10 - position;
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    marks[0] += (6 * thismarks[0]);
                    subject.setText("Automobile Engineering");                         //automobile
                    spinn.setAdapter(th);
                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if (position == 6)
                                thismarks[0] = 0;
                            else
                                thismarks[0] = 10 - position;
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            marks[0] += (6 * thismarks[0]);
                            subject.setText("Refrigeration");               //refrigeration
                            spinn.setAdapter(th);
                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                    if (position == 6)
                                        thismarks[0] = 0;
                                    else
                                        thismarks[0] = 10 - position;
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] += (6 * thismarks[0]);
                                    subject.setText("Thermal Engineering - II");               //Thermal Eng2
                                    spinn.setAdapter(th);
                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                            if (position == 6)
                                                thismarks[0] = 0;
                                            else
                                                thismarks[0] = 10 - position;
                                        }

                                        @Override
                                        public void onNothingSelected(AdapterView<?> parent) {

                                        }
                                    });
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] += (6 * thismarks[0]);
                                            subject.setText("Design of Machine Elements - II");               //machine elements2
                                            spinn.setAdapter(th);
                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                    if (position == 6)
                                                        thismarks[0] = 0;
                                                    else
                                                        thismarks[0] = 10 - position;
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] += (8 * thismarks[0]);
                                                    subject.setText("Mechatronics LAB");               //Mechatronics lab
                                                    spinn.setAdapter(pr);
                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                        @Override
                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                            if (position == 5)
                                                                thismarks[0] = 0;
                                                            else
                                                                thismarks[0] = 10 - position;
                                                        }

                                                        @Override
                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                        }
                                                    });
                                                    button.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] += (3 * thismarks[0]);
                                                            subject.setText("Automobile Engineering LAB");               //automobile lab
                                                            spinn.setAdapter(pr);
                                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                @Override
                                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                    if (position == 5)
                                                                        thismarks[0] = 0;
                                                                    else
                                                                        thismarks[0] = 10 - position;
                                                                }

                                                                @Override
                                                                public void onNothingSelected(AdapterView<?> parent) {

                                                                }
                                                            });
                                                            button.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] += (3 * thismarks[0]);
                                                                    subject.setText("Thermal Engineering LAB");       //thermal LAB
                                                                    spinn.setAdapter(pr);
                                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                        @Override
                                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                            if (position == 5)
                                                                                thismarks[0] = 0;
                                                                            else
                                                                                thismarks[0] = 10 - position;
                                                                        }

                                                                        @Override
                                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                                        }
                                                                    });
                                                                    button.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] += (3 * thismarks[0]);
                                                                            double total = marks[0];
                                                                            total /= 41.0;
                                                                            Intent intent = new Intent(gradeActivity.this, Marks.class);
                                                                            intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                            startActivity(intent);
                                                                            finish();
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });

        }
        if (branch == 73)            //ME 7th semester
        {
            subject.setText("HSS Elective");             //hss
            spinn.setAdapter(th);
            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 6)
                        thismarks[0] = 0;
                    else
                        thismarks[0] = 10 - position;
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    marks[0] += (4 * thismarks[0]);
                    subject.setText("Industrial Engineering and Operations Research");                         //insudtrial
                    spinn.setAdapter(th);
                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if (position == 6)
                                thismarks[0] = 0;
                            else
                                thismarks[0] = 10 - position;
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            marks[0] += (6 * thismarks[0]);
                            subject.setText("CAD/CAM");               //cad
                            spinn.setAdapter(th);
                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                    if (position == 6)
                                        thismarks[0] = 0;
                                    else
                                        thismarks[0] = 10 - position;
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] += (6 * thismarks[0]);
                                    subject.setText("Departmental Elective - I");               //de1
                                    spinn.setAdapter(th);
                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                            if (position == 6)
                                                thismarks[0] = 0;
                                            else
                                                thismarks[0] = 10 - position;
                                        }

                                        @Override
                                        public void onNothingSelected(AdapterView<?> parent) {

                                        }
                                    });
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] += (6 * thismarks[0]);
                                            subject.setText("Department Elective - II");     //Department Elective - II
                                            spinn.setAdapter(th);
                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                    if (position == 6)
                                                        thismarks[0] = 0;
                                                    else
                                                        thismarks[0] = 10 - position;
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] += (6 * thismarks[0]);
                                                    subject.setText("CAD/CAM LAB");               //cad lab
                                                    spinn.setAdapter(pr);
                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                        @Override
                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                            if (position == 5)
                                                                thismarks[0] = 0;
                                                            else
                                                                thismarks[0] = 10 - position;
                                                        }

                                                        @Override
                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                        }
                                                    });
                                                    button.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] += (3 * thismarks[0]);
                                                            subject.setText("Project - I");     //Project - I
                                                            spinn.setAdapter(th);
                                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                @Override
                                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                    if (position == 5)
                                                                        thismarks[0] = 0;
                                                                    else
                                                                        thismarks[0] = 10 - position;
                                                                }

                                                                @Override
                                                                public void onNothingSelected(AdapterView<?> parent) {

                                                                }
                                                            });
                                                            button.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] += (3 * thismarks[0]);
                                                                    double total = marks[0];
                                                                    total /= 34.0;
                                                                    Intent intent = new Intent(gradeActivity.this, Marks.class);
                                                                    intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                    startActivity(intent);
                                                                    finish();
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });

        }
        if (branch == 83)            //ME 8th semester
        {
            subject.setText("HSS Elective");             //hss
            spinn.setAdapter(th);
            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 6)
                        thismarks[0] = 0;
                    else
                        thismarks[0] = 10 - position;
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    marks[0] += (4 * thismarks[0]);
                    subject.setText("Department Elective - III");                         //de4
                    spinn.setAdapter(th);
                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if (position == 6)
                                thismarks[0] = 0;
                            else
                                thismarks[0] = 10 - position;
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            marks[0] += (6 * thismarks[0]);
                            subject.setText("Department Elective - IV");               //de4
                            spinn.setAdapter(th);
                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                    if (position == 6)
                                        thismarks[0] = 0;
                                    else
                                        thismarks[0] = 10 - position;
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] += (6 * thismarks[0]);
                                    subject.setText("Open Elective");               //oe
                                    spinn.setAdapter(th);
                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                            if (position == 6)
                                                thismarks[0] = 0;
                                            else
                                                thismarks[0] = 10 - position;
                                        }

                                        @Override
                                        public void onNothingSelected(AdapterView<?> parent) {

                                        }
                                    });
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] += (6 * thismarks[0]);
                                            subject.setText("Project - II");               //project2
                                            spinn.setAdapter(th);
                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                    if (position == 6)
                                                        thismarks[0] = 0;
                                                    else
                                                        thismarks[0] = 10 - position;
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] += (9 * thismarks[0]);
                                                    double total = marks[0];
                                                    total /= 31.0;
                                                    Intent intent = new Intent(gradeActivity.this, Marks.class);
                                                    intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                    startActivity(intent);
                                                    finish();
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });

        }

        /*
         **********************************
         *******Electrical branch*****************
         **********************************
         */

        if (branch == 34)            //EE 3rd semester
        {
            subject.setText("Network Analysis");             //na
            spinn.setAdapter(th);
            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 6)
                        thismarks[0] = 0;
                    else
                        thismarks[0] = 10 - position;
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    marks[0] += (6 * thismarks[0]);
                    subject.setText("Semiconductor Device and Circuits");                         //sdc
                    spinn.setAdapter(th);
                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if (position == 6)
                                thismarks[0] = 0;
                            else
                                thismarks[0] = 10 - position;
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            marks[0] += (6 * thismarks[0]);
                            subject.setText("Analog Circuits");               //AC
                            spinn.setAdapter(th);
                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                    if (position == 6)
                                        thismarks[0] = 0;
                                    else
                                        thismarks[0] = 10 - position;
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] += (6 * thismarks[0]);
                                    subject.setText("Maths");               //math
                                    spinn.setAdapter(th);
                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                            if (position == 6)
                                                thismarks[0] = 0;
                                            else
                                                thismarks[0] = 10 - position;
                                        }

                                        @Override
                                        public void onNothingSelected(AdapterView<?> parent) {

                                        }
                                    });
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] += (6 * thismarks[0]);
                                            subject.setText("HSS Elective");               //hss
                                            spinn.setAdapter(th);
                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                    if (position == 6)
                                                        thismarks[0] = 0;
                                                    else
                                                        thismarks[0] = 10 - position;
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] += (4 * thismarks[0]);
                                                    subject.setText("Network Analysis LAB");               //na lab
                                                    spinn.setAdapter(pr);
                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                        @Override
                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                            if (position == 5)
                                                                thismarks[0] = 0;
                                                            else
                                                                thismarks[0] = 10 - position;
                                                        }

                                                        @Override
                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                        }
                                                    });
                                                    button.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] += (3 * thismarks[0]);
                                                            subject.setText("Semiconductor Device LAB");               //sdc lab
                                                            spinn.setAdapter(pr);
                                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                @Override
                                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                    if (position == 5)
                                                                        thismarks[0] = 0;
                                                                    else
                                                                        thismarks[0] = 10 - position;
                                                                }

                                                                @Override
                                                                public void onNothingSelected(AdapterView<?> parent) {

                                                                }
                                                            });
                                                            button.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] += (3 * thismarks[0]);
                                                                    subject.setText("Analog Circuits LAB");        //ac lab
                                                                    spinn.setAdapter(pr);
                                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                        @Override
                                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                            if (position == 5)
                                                                                thismarks[0] = 0;
                                                                            else
                                                                                thismarks[0] = 10 - position;
                                                                        }

                                                                        @Override
                                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                                        }
                                                                    });
                                                                    button.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] += (3 * thismarks[0]);
                                                                            double total = marks[0];
                                                                            total /= 37.0;
                                                                            Intent intent = new Intent(gradeActivity.this, Marks.class);
                                                                            intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                            startActivity(intent);
                                                                            finish();
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });

        }
        if (branch == 44)            //ECE 4th semester
        {
            subject.setText("Numerical Methods");             //numerical
            spinn.setAdapter(th);
            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 6)
                        thismarks[0] = 0;
                    else
                        thismarks[0] = 10 - position;
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    marks[0] += (6 * thismarks[0]);
                    subject.setText("Digital Electronics");                         //ac
                    spinn.setAdapter(th);
                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if (position == 6)
                                thismarks[0] = 0;
                            else
                                thismarks[0] = 10 - position;
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            marks[0] += (6 * thismarks[0]);
                            subject.setText("Measurements and Instrumentation");               //ee
                            spinn.setAdapter(th);
                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                    if (position == 6)
                                        thismarks[0] = 0;
                                    else
                                        thismarks[0] = 10 - position;
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] += (6 * thismarks[0]);
                                    subject.setText("Signals and System");               //signals
                                    spinn.setAdapter(th);
                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                            if (position == 6)
                                                thismarks[0] = 0;
                                            else
                                                thismarks[0] = 10 - position;
                                        }

                                        @Override
                                        public void onNothingSelected(AdapterView<?> parent) {

                                        }
                                    });
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] += (6 * thismarks[0]);
                                            subject.setText("Electrical Machines - I");               //machines
                                            spinn.setAdapter(th);
                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                    if (position == 6)
                                                        thismarks[0] = 0;
                                                    else
                                                        thismarks[0] = 10 - position;
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] += (6 * thismarks[0]);
                                                    subject.setText("Digital Electronics LAB");               //de lab
                                                    spinn.setAdapter(pr);
                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                        @Override
                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                            if (position == 5)
                                                                thismarks[0] = 0;
                                                            else
                                                                thismarks[0] = 10 - position;
                                                        }

                                                        @Override
                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                        }
                                                    });
                                                    button.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] += (3 * thismarks[0]);
                                                            subject.setText("Electrical Machines LAB");               //machines lab
                                                            spinn.setAdapter(pr);
                                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                @Override
                                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                    if (position == 5)
                                                                        thismarks[0] = 0;
                                                                    else
                                                                        thismarks[0] = 10 - position;
                                                                }

                                                                @Override
                                                                public void onNothingSelected(AdapterView<?> parent) {

                                                                }
                                                            });
                                                            button.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] += (3 * thismarks[0]);
                                                                    subject.setText("Measurement and Instrumentation LAB");        //instrumentation lab
                                                                    spinn.setAdapter(pr);
                                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                        @Override
                                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                            if (position == 5)
                                                                                thismarks[0] = 0;
                                                                            else
                                                                                thismarks[0] = 10 - position;
                                                                        }

                                                                        @Override
                                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                                        }
                                                                    });
                                                                    button.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] += (3 * thismarks[0]);
                                                                            double total = marks[0];
                                                                            total /= 41.0;
                                                                            Intent intent = new Intent(gradeActivity.this, Marks.class);
                                                                            intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                            startActivity(intent);
                                                                            finish();
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });

        }
        if (branch == 54)            //EE 5th semester
        {
            subject.setText("Power Electronics");             //power
            spinn.setAdapter(th);
            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 6)
                        thismarks[0] = 0;
                    else
                        thismarks[0] = 10 - position;
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    marks[0] += (6 * thismarks[0]);
                    subject.setText("Electrical Machines - II");                         //machines
                    spinn.setAdapter(th);
                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if (position == 6)
                                thismarks[0] = 0;
                            else
                                thismarks[0] = 10 - position;
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            marks[0] += (6 * thismarks[0]);
                            subject.setText("Transmission and Distribution");               //transmission
                            spinn.setAdapter(th);
                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                    if (position == 6)
                                        thismarks[0] = 0;
                                    else
                                        thismarks[0] = 10 - position;
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] += (6 * thismarks[0]);
                                    subject.setText("Control System");               //systems
                                    spinn.setAdapter(th);
                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                            if (position == 6)
                                                thismarks[0] = 0;
                                            else
                                                thismarks[0] = 10 - position;
                                        }

                                        @Override
                                        public void onNothingSelected(AdapterView<?> parent) {

                                        }
                                    });
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] += (6 * thismarks[0]);
                                            subject.setText("Electromagnetic Field");               //electromagnetic feild
                                            spinn.setAdapter(th);
                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                    if (position == 6)
                                                        thismarks[0] = 0;
                                                    else
                                                        thismarks[0] = 10 - position;
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] += (6 * thismarks[0]);
                                                    subject.setText("Electrical Machines - II LAB");               //machines lab
                                                    spinn.setAdapter(pr);
                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                        @Override
                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                            if (position == 5)
                                                                thismarks[0] = 0;
                                                            else
                                                                thismarks[0] = 10 - position;
                                                        }

                                                        @Override
                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                        }
                                                    });
                                                    button.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] += (3 * thismarks[0]);
                                                            subject.setText("Power Electronics LAB");               //power lab
                                                            spinn.setAdapter(pr);
                                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                @Override
                                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                    if (position == 5)
                                                                        thismarks[0] = 0;
                                                                    else
                                                                        thismarks[0] = 10 - position;
                                                                }

                                                                @Override
                                                                public void onNothingSelected(AdapterView<?> parent) {

                                                                }
                                                            });
                                                            button.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] += (3 * thismarks[0]);
                                                                    subject.setText("Numerical Methods LAB");        //numericals lab
                                                                    spinn.setAdapter(pr);
                                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                        @Override
                                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                            if (position == 5)
                                                                                thismarks[0] = 0;
                                                                            else
                                                                                thismarks[0] = 10 - position;
                                                                        }

                                                                        @Override
                                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                                        }
                                                                    });
                                                                    button.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] += (3 * thismarks[0]);
                                                                            double total = marks[0];
                                                                            total /= 39.0;
                                                                            Intent intent = new Intent(gradeActivity.this, Marks.class);
                                                                            intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                            startActivity(intent);
                                                                            finish();
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });

        }
        if (branch == 64)            //EE 6th semester
        {
            subject.setText("Microprocessors and Applications");             //microprocessors
            spinn.setAdapter(th);
            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 6)
                        thismarks[0] = 0;
                    else
                        thismarks[0] = 10 - position;
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    marks[0] += (6 * thismarks[0]);
                    subject.setText("Power System Protection");                         //power system
                    spinn.setAdapter(th);
                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if (position == 6)
                                thismarks[0] = 0;
                            else
                                thismarks[0] = 10 - position;
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            marks[0] += (6 * thismarks[0]);
                            subject.setText("Advanced Control System");               //advanced control
                            spinn.setAdapter(th);
                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                    if (position == 6)
                                        thismarks[0] = 0;
                                    else
                                        thismarks[0] = 10 - position;
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] += (6 * thismarks[0]);
                                    subject.setText("Renewable Energy Resources");               //Resources
                                    spinn.setAdapter(th);
                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                            if (position == 6)
                                                thismarks[0] = 0;
                                            else
                                                thismarks[0] = 10 - position;
                                        }

                                        @Override
                                        public void onNothingSelected(AdapterView<?> parent) {

                                        }
                                    });
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] += (6 * thismarks[0]);
                                            subject.setText("Communication System");               //communication
                                            spinn.setAdapter(th);
                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                    if (position == 6)
                                                        thismarks[0] = 0;
                                                    else
                                                        thismarks[0] = 10 - position;
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] += (6 * thismarks[0]);
                                                    subject.setText("Microprocessor LAB");               //microprocessors lab
                                                    spinn.setAdapter(pr);
                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                        @Override
                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                            if (position == 5)
                                                                thismarks[0] = 0;
                                                            else
                                                                thismarks[0] = 10 - position;
                                                        }

                                                        @Override
                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                        }
                                                    });
                                                    button.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] += (3 * thismarks[0]);
                                                            subject.setText("Power System LAB");               //power lab
                                                            spinn.setAdapter(pr);
                                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                @Override
                                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                    if (position == 5)
                                                                        thismarks[0] = 0;
                                                                    else
                                                                        thismarks[0] = 10 - position;
                                                                }

                                                                @Override
                                                                public void onNothingSelected(AdapterView<?> parent) {

                                                                }
                                                            });
                                                            button.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] += (3 * thismarks[0]);
                                                                    subject.setText("Control System LAB");        //control lab
                                                                    spinn.setAdapter(pr);
                                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                        @Override
                                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                            if (position == 5)
                                                                                thismarks[0] = 0;
                                                                            else
                                                                                thismarks[0] = 10 - position;
                                                                        }

                                                                        @Override
                                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                                        }
                                                                    });
                                                                    button.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] += (3 * thismarks[0]);
                                                                            double total = marks[0];
                                                                            total /= 39.0;
                                                                            Intent intent = new Intent(gradeActivity.this, Marks.class);
                                                                            intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                            startActivity(intent);
                                                                            finish();
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });

        }
        if (branch == 74)            //EE 7th semester
        {
            subject.setText("High Voltage Engineering");             //voltage
            spinn.setAdapter(th);
            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 6)
                        thismarks[0] = 0;
                    else
                        thismarks[0] = 10 - position;
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    marks[0] += (6 * thismarks[0]);
                    subject.setText("Power System Analysis");                         //power system
                    spinn.setAdapter(th);
                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if (position == 6)
                                thismarks[0] = 0;
                            else
                                thismarks[0] = 10 - position;
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            marks[0] += (6 * thismarks[0]);
                            subject.setText("Elective - I");               //elective1
                            spinn.setAdapter(th);
                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                    if (position == 6)
                                        thismarks[0] = 0;
                                    else
                                        thismarks[0] = 10 - position;
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] += (6 * thismarks[0]);
                                    subject.setText("Elective - II");               //elective2
                                    spinn.setAdapter(th);
                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                            if (position == 6)
                                                thismarks[0] = 0;
                                            else
                                                thismarks[0] = 10 - position;
                                        }

                                        @Override
                                        public void onNothingSelected(AdapterView<?> parent) {

                                        }
                                    });
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] += (6 * thismarks[0]);
                                            subject.setText("Renewable Energy LAB");               //renewable lab
                                            spinn.setAdapter(pr);
                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                    if (position == 6)
                                                        thismarks[0] = 0;
                                                    else
                                                        thismarks[0] = 10 - position;
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] += (3 * thismarks[0]);
                                                    subject.setText("Project - I");               //project
                                                    spinn.setAdapter(th);
                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                        @Override
                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                            if (position == 5)
                                                                thismarks[0] = 0;
                                                            else
                                                                thismarks[0] = 10 - position;
                                                        }

                                                        @Override
                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                        }
                                                    });
                                                    button.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] += (6 * thismarks[0]);
                                                            double total = marks[0];
                                                            total /= 33.0;
                                                            Intent intent = new Intent(gradeActivity.this, Marks.class);
                                                            intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                            startActivity(intent);
                                                            finish();
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });

        }
        if (branch == 84)            //EE 8th semester
        {
            subject.setText("Power System Operation and Control");             //power
            spinn.setAdapter(th);
            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 6)
                        thismarks[0] = 0;
                    else
                        thismarks[0] = 10 - position;
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    marks[0] += (6 * thismarks[0]);
                    subject.setText("Elective - III");                         //elective3
                    spinn.setAdapter(th);
                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if (position == 6)
                                thismarks[0] = 0;
                            else
                                thismarks[0] = 10 - position;
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            marks[0] += (6 * thismarks[0]);
                            subject.setText("Open Elective");               //oe
                            spinn.setAdapter(th);
                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                    if (position == 6)
                                        thismarks[0] = 0;
                                    else
                                        thismarks[0] = 10 - position;
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] += (6 * thismarks[0]);
                                    subject.setText("HSS Elective - IV");               //hss4
                                    spinn.setAdapter(th);
                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                            if (position == 6)
                                                thismarks[0] = 0;
                                            else
                                                thismarks[0] = 10 - position;
                                        }

                                        @Override
                                        public void onNothingSelected(AdapterView<?> parent) {

                                        }
                                    });
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] += (6 * thismarks[0]);
                                            subject.setText("Project - II");               //project2
                                            spinn.setAdapter(th);
                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                    if (position == 6)
                                                        thismarks[0] = 0;
                                                    else
                                                        thismarks[0] = 10 - position;
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] += (8 * thismarks[0]);
                                                    double total = marks[0];
                                                    total /= 32.0;
                                                    Intent intent = new Intent(gradeActivity.this, Marks.class);
                                                    intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                    startActivity(intent);
                                                    finish();
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });

        }


        /*
         **********************************
         *******Civil branch*****************
         **********************************
         */

        if (branch == 35)            //CE 3rd semester
        {
            subject.setText("Mathematics");             //maths
            spinn.setAdapter(th);
            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 6)
                        thismarks[0] = 0;
                    else
                        thismarks[0] = 10 - position;
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    marks[0] += (6 * thismarks[0]);
                    subject.setText("Solid Mechanics");                         //sm
                    spinn.setAdapter(th);
                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if (position == 6)
                                thismarks[0] = 0;
                            else
                                thismarks[0] = 10 - position;
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            marks[0] += (8 * thismarks[0]);
                            subject.setText("Engineering Geology");               //geology
                            spinn.setAdapter(th);
                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                    if (position == 6)
                                        thismarks[0] = 0;
                                    else
                                        thismarks[0] = 10 - position;
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] += (6 * thismarks[0]);
                                    subject.setText("Civil Engineering Materials");               //materials
                                    spinn.setAdapter(th);
                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                            if (position == 6)
                                                thismarks[0] = 0;
                                            else
                                                thismarks[0] = 10 - position;
                                        }

                                        @Override
                                        public void onNothingSelected(AdapterView<?> parent) {

                                        }
                                    });
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] += (6 * thismarks[0]);
                                            subject.setText("Surveying");               //survey
                                            spinn.setAdapter(th);
                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                    if (position == 6)
                                                        thismarks[0] = 0;
                                                    else
                                                        thismarks[0] = 10 - position;
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] += (6 * thismarks[0]);
                                                    subject.setText("Civil Engineering Materials LAB");               //Civil Engineering Materials lab
                                                    spinn.setAdapter(pr);
                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                        @Override
                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                            if (position == 5)
                                                                thismarks[0] = 0;
                                                            else
                                                                thismarks[0] = 10 - position;
                                                        }

                                                        @Override
                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                        }
                                                    });
                                                    button.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] += (3 * thismarks[0]);
                                                            subject.setText("Surveying LAB");               //Surveying lab
                                                            spinn.setAdapter(pr);
                                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                @Override
                                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                    if (position == 5)
                                                                        thismarks[0] = 0;
                                                                    else
                                                                        thismarks[0] = 10 - position;
                                                                }

                                                                @Override
                                                                public void onNothingSelected(AdapterView<?> parent) {

                                                                }
                                                            });
                                                            button.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] += (3 * thismarks[0]);
                                                                    subject.setText("Building Drawing and CAD LAB");        //Building Drawing and CAD lab
                                                                    spinn.setAdapter(pr);
                                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                        @Override
                                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                            if (position == 5)
                                                                                thismarks[0] = 0;
                                                                            else
                                                                                thismarks[0] = 10 - position;
                                                                        }

                                                                        @Override
                                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                                        }
                                                                    });
                                                                    button.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] += (4 * thismarks[0]);
                                                                            double total = marks[0];
                                                                            total /= 42.0;
                                                                            Intent intent = new Intent(gradeActivity.this, Marks.class);
                                                                            intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                            startActivity(intent);
                                                                            finish();
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });

        }
        if (branch == 45)            //CE 4th semester
        {
            subject.setText("Numerical Methods");             //numerical
            spinn.setAdapter(th);
            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 6)
                        thismarks[0] = 0;
                    else
                        thismarks[0] = 10 - position;
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    marks[0] += (6 * thismarks[0]);
                    subject.setText("Structural Analysis - I");                         //Structural Analysis I
                    spinn.setAdapter(th);
                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if (position == 6)
                                thismarks[0] = 0;
                            else
                                thismarks[0] = 10 - position;
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            marks[0] += (8 * thismarks[0]);
                            subject.setText("Environmental Engineering - I");               //Environmental Engineering I
                            spinn.setAdapter(th);
                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                    if (position == 6)
                                        thismarks[0] = 0;
                                    else
                                        thismarks[0] = 10 - position;
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] += (6 * thismarks[0]);
                                    subject.setText("Geotechnical Engineering - I");               //Geotechnical Engineering I
                                    spinn.setAdapter(th);
                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                            if (position == 6)
                                                thismarks[0] = 0;
                                            else
                                                thismarks[0] = 10 - position;
                                        }

                                        @Override
                                        public void onNothingSelected(AdapterView<?> parent) {

                                        }
                                    });
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] += (6 * thismarks[0]);
                                            subject.setText("Hydrology and Water Resources Engineering");               //Hydrology and Water Resources Engineering
                                            spinn.setAdapter(th);
                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                    if (position == 6)
                                                        thismarks[0] = 0;
                                                    else
                                                        thismarks[0] = 10 - position;
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] += (6 * thismarks[0]);
                                                    subject.setText("Environmental Engineering LAB");               //Environmental Engineering lab
                                                    spinn.setAdapter(pr);
                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                        @Override
                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                            if (position == 5)
                                                                thismarks[0] = 0;
                                                            else
                                                                thismarks[0] = 10 - position;
                                                        }

                                                        @Override
                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                        }
                                                    });
                                                    button.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] += (3 * thismarks[0]);
                                                            subject.setText("Geotechnical Engineering - I LAB");               //Geotechnical Engineering lab
                                                            spinn.setAdapter(pr);
                                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                @Override
                                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                    if (position == 5)
                                                                        thismarks[0] = 0;
                                                                    else
                                                                        thismarks[0] = 10 - position;
                                                                }

                                                                @Override
                                                                public void onNothingSelected(AdapterView<?> parent) {

                                                                }
                                                            });
                                                            button.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] += (3 * thismarks[0]);
                                                                    double total = marks[0];
                                                                    total /= 38.0;
                                                                    Intent intent = new Intent(gradeActivity.this, Marks.class);
                                                                    intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                    startActivity(intent);
                                                                    finish();
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });

        }
        if (branch == 55)            //CE 5th semester
        {
            subject.setText("Structural Analysis II");             //power
            spinn.setAdapter(th);
            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 6)
                        thismarks[0] = 0;
                    else
                        thismarks[0] = 10 - position;
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    marks[0] += (8 * thismarks[0]);
                    subject.setText("Environmental Engineering II");                         //machines
                    spinn.setAdapter(th);
                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if (position == 6)
                                thismarks[0] = 0;
                            else
                                thismarks[0] = 10 - position;
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            marks[0] += (6 * thismarks[0]);
                            subject.setText("Geotechnical Engineering II");               //transmission
                            spinn.setAdapter(th);
                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                    if (position == 6)
                                        thismarks[0] = 0;
                                    else
                                        thismarks[0] = 10 - position;
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] += (6 * thismarks[0]);
                                    subject.setText("Fluid Mechanics");               //systems
                                    spinn.setAdapter(th);
                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                            if (position == 6)
                                                thismarks[0] = 0;
                                            else
                                                thismarks[0] = 10 - position;
                                        }

                                        @Override
                                        public void onNothingSelected(AdapterView<?> parent) {

                                        }
                                    });
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] += (6 * thismarks[0]);
                                            subject.setText("Reinforced Concrete Design");               //electromagnetic feild
                                            spinn.setAdapter(th);
                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                    if (position == 6)
                                                        thismarks[0] = 0;
                                                    else
                                                        thismarks[0] = 10 - position;
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] += (6 * thismarks[0]);
                                                    subject.setText("Geotechnical Engineering - II LAB");               //machines lab
                                                    spinn.setAdapter(pr);
                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                        @Override
                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                            if (position == 5)
                                                                thismarks[0] = 0;
                                                            else
                                                                thismarks[0] = 10 - position;
                                                        }

                                                        @Override
                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                        }
                                                    });
                                                    button.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] += (3 * thismarks[0]);
                                                            subject.setText("Fluid Mechanics LAB");               //power lab
                                                            spinn.setAdapter(pr);
                                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                @Override
                                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                    if (position == 5)
                                                                        thismarks[0] = 0;
                                                                    else
                                                                        thismarks[0] = 10 - position;
                                                                }

                                                                @Override
                                                                public void onNothingSelected(AdapterView<?> parent) {

                                                                }
                                                            });
                                                            button.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] += (3 * thismarks[0]);
                                                                    double total = marks[0];
                                                                    total /= 38.0;
                                                                    Intent intent = new Intent(gradeActivity.this, Marks.class);
                                                                    intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                    startActivity(intent);
                                                                    finish();
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });

        }
        if (branch == 65)            //CE 6th semester
        {
            subject.setText("HSS - II");             //microprocessors
            spinn.setAdapter(th);
            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 6)
                        thismarks[0] = 0;
                    else
                        thismarks[0] = 10 - position;
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    marks[0] += (4 * thismarks[0]);
                    subject.setText("Transportation Engineering - I");                         //power system
                    spinn.setAdapter(th);
                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if (position == 6)
                                thismarks[0] = 0;
                            else
                                thismarks[0] = 10 - position;
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            marks[0] += (6 * thismarks[0]);
                            subject.setText("Construction Technology and Management");               //advanced control
                            spinn.setAdapter(th);
                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                    if (position == 6)
                                        thismarks[0] = 0;
                                    else
                                        thismarks[0] = 10 - position;
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] += (6 * thismarks[0]);
                                    subject.setText("Design of Steel Structures");               //Resources
                                    spinn.setAdapter(th);
                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                            if (position == 6)
                                                thismarks[0] = 0;
                                            else
                                                thismarks[0] = 10 - position;
                                        }

                                        @Override
                                        public void onNothingSelected(AdapterView<?> parent) {

                                        }
                                    });
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] += (8 * thismarks[0]);
                                            subject.setText("Hydraulics and Hydraulic Structures");               //communication
                                            spinn.setAdapter(th);
                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                    if (position == 6)
                                                        thismarks[0] = 0;
                                                    else
                                                        thismarks[0] = 10 - position;
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] += (6 * thismarks[0]);
                                                    subject.setText("Transportation Engineering - I LAB");               //microprocessors lab
                                                    spinn.setAdapter(pr);
                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                        @Override
                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                            if (position == 5)
                                                                thismarks[0] = 0;
                                                            else
                                                                thismarks[0] = 10 - position;
                                                        }

                                                        @Override
                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                        }
                                                    });
                                                    button.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] += (3 * thismarks[0]);
                                                            subject.setText("Hydraulics and Hydraulic Structures LAB");               //power lab
                                                            spinn.setAdapter(pr);
                                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                                @Override
                                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                    if (position == 5)
                                                                        thismarks[0] = 0;
                                                                    else
                                                                        thismarks[0] = 10 - position;
                                                                }

                                                                @Override
                                                                public void onNothingSelected(AdapterView<?> parent) {

                                                                }
                                                            });
                                                            button.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] += (3 * thismarks[0]);
                                                                    double total = marks[0];
                                                                    total /= 36.0;
                                                                    Intent intent = new Intent(gradeActivity.this, Marks.class);
                                                                    intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                    startActivity(intent);
                                                                    finish();
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });

        }
        if (branch == 75)            //EE 7th semester
        {
            subject.setText("HSS - III");             //voltage
            spinn.setAdapter(th);
            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 6)
                        thismarks[0] = 0;
                    else
                        thismarks[0] = 10 - position;
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    marks[0] += (4 * thismarks[0]);
                    subject.setText("Transportation Engineering - II");                         //power system
                    spinn.setAdapter(th);
                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if (position == 6)
                                thismarks[0] = 0;
                            else
                                thismarks[0] = 10 - position;
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            marks[0] += (6 * thismarks[0]);
                            subject.setText("Elective - I");               //elective1
                            spinn.setAdapter(th);
                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                    if (position == 6)
                                        thismarks[0] = 0;
                                    else
                                        thismarks[0] = 10 - position;
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] += (6 * thismarks[0]);
                                    subject.setText("Elective - II");               //elective2
                                    spinn.setAdapter(th);
                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                            if (position == 6)
                                                thismarks[0] = 0;
                                            else
                                                thismarks[0] = 10 - position;
                                        }

                                        @Override
                                        public void onNothingSelected(AdapterView<?> parent) {

                                        }
                                    });
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] += (6 * thismarks[0]);
                                            subject.setText("Open Elective - I");               //renewable lab
                                            spinn.setAdapter(th);
                                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                    if (position == 6)
                                                        thismarks[0] = 0;
                                                    else
                                                        thismarks[0] = 10 - position;
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> parent) {

                                                }
                                            });
                                            button.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] += (6 * thismarks[0]);
                                                    subject.setText("Computational LAB");               //project
                                                    spinn.setAdapter(th);
                                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                        @Override
                                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                            if (position == 5)
                                                                thismarks[0] = 0;
                                                            else
                                                                thismarks[0] = 10 - position;
                                                        }

                                                        @Override
                                                        public void onNothingSelected(AdapterView<?> parent) {

                                                        }
                                                    });
                                                    button.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] += (3 * thismarks[0]);
                                                            double total = marks[0];
                                                            total /= 31.0;
                                                            Intent intent = new Intent(gradeActivity.this, Marks.class);
                                                            intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                            startActivity(intent);
                                                            finish();
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });

        }
        if (branch == 85)            //CE 8th semester
        {
            subject.setText("Departmental Elective - III");             //power
            spinn.setAdapter(th);
            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 6)
                        thismarks[0] = 0;
                    else
                        thismarks[0] = 10 - position;
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    marks[0] += (6 * thismarks[0]);
                    subject.setText("Departmental Elective IV");                         //elective3
                    spinn.setAdapter(th);
                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if (position == 6)
                                thismarks[0] = 0;
                            else
                                thismarks[0] = 10 - position;
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            marks[0] += (6 * thismarks[0]);
                            subject.setText("Open Elective - II");               //op
                            spinn.setAdapter(th);
                            spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                    if (position == 6)
                                        thismarks[0] = 0;
                                    else
                                        thismarks[0] = 10 - position;
                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> parent) {

                                }
                            });
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] += (6 * thismarks[0]);
                                    subject.setText("Project");               //hss4
                                    spinn.setAdapter(th);
                                    spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                            if (position == 6)
                                                thismarks[0] = 0;
                                            else
                                                thismarks[0] = 10 - position;
                                        }

                                        @Override
                                        public void onNothingSelected(AdapterView<?> parent) {

                                        }
                                    });
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] += (9 * thismarks[0]);
                                            double total = marks[0];
                                            total /= 27.0;
                                            Intent intent = new Intent(gradeActivity.this, Marks.class);
                                            intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                            startActivity(intent);
                                            finish();
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });

        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(gradeActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}

