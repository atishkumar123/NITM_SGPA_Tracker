package com.atish.nitm_sgpa_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Marks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marks);
        Intent intent = getIntent();
        TextView marks = (TextView) findViewById(R.id.message);
        marks.setText(Double.toString(intent.getDoubleExtra("Marks", 0.0)));
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(Marks.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}