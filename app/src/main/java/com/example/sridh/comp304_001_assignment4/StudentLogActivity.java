package com.example.sridh.comp304_001_assignment4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StudentLogActivity extends AppCompatActivity {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_log);
    }

    public void registerLinkOnClick(View v){
        intent = new Intent(StudentLogActivity.this, StudentRegActivity.class);
        startActivity(intent);
    }
}
