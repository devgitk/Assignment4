package com.example.sridh.comp304_001_assignment4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void studentBtnOnClick(View v){

        intent = new Intent(MainActivity.this, StudentLogActivity.class);
        startActivity(intent);
    }

    public void adminBtnOnClick(View v){
        intent = new Intent(MainActivity.this, AdminLogActivity.class);
        startActivity(intent);
    }


}
