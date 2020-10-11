package com.example.congressapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Candle_Making extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candle__making);
    }

    public void onClickHome(View view)
    {
        startActivity(new Intent(Candle_Making.this, MainActivity.class));
    }
}