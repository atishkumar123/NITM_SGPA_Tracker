package com.atish.nitm_sgpa_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class BranchActivity extends AppCompatActivity {

    String a[] = {"CSE", "ECE","ME","EE","CE"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branch);
        Button button = (Button)findViewById(R.id.next);
        Spinner spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, a);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(aa);
        Intent intent = getIntent();
        final int[] s = {intent.getIntExtra("sem", 0)};
        final int[] pos = {0};
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                pos[0] = position+1;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s[0] = s[0]*10 + pos[0];
                Intent i = new Intent(BranchActivity.this, gradeActivity.class);
                i.putExtra("final", s[0]);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(BranchActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}