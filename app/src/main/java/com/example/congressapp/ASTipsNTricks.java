package com.example.congressapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ASTipsNTricks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_s_tips_n_tricks);
    }

    public void onClickBckHome(View view)
    {
        startActivity(new Intent(ASTipsNTricks.this, MainActivity.class));
    }

    //Add information on
}