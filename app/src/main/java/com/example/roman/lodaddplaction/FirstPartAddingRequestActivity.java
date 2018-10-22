package com.example.roman.lodaddplaction;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class FirstPartAddingRequestActivity extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_part_of_adding_request);
    }
    public void onClickReadyButton1part(View view) {
        Intent intent = new Intent(FirstPartAddingRequestActivity.this, SecondPartAddingRequestActivity.class);
        startActivity(intent);
    }
    public void onClickBackButton1part(View view) {
        Intent intent = new Intent(FirstPartAddingRequestActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
