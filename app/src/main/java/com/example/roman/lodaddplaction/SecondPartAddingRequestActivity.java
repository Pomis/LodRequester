package com.example.roman.lodaddplaction;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SecondPartAddingRequestActivity extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_part_of_adding_request);
    }
    public void onClickReadyButton2part(View view) {
        Intent intent = new Intent(SecondPartAddingRequestActivity.this, MainActivity.class);
        startActivity(intent);
    }
    public void onClickBackButton2part(View view) {
        Intent intent = new Intent(SecondPartAddingRequestActivity.this, FirstPartAddingRequestActivity.class);
        startActivity(intent);
    }
}

