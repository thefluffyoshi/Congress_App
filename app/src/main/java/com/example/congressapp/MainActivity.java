package com.example.congressapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickASTipsNTricks(View view)
    {
        startActivity(new Intent(MainActivity.this, ASTipsNTricks.class));
    }

    public void onClickMath(View view)
    {
        startActivity(new Intent(MainActivity.this, Math.class));
    }

//    public void onClickAstro(View view)
//    {
//        startActivity(new Intent(MainActivity.this, Astronomy.class));
//    }

    public void onClickCandle(View view)
    {
        startActivity(new Intent(MainActivity.this, Candle_Making.class));
    }
}

/*
Ideas:
 - AT LEAST PUT ANDROID STUDIO CODE/TIPS AND TRICKS
 - Things I learned in all Com Sci
 - Math definitely
 - Physics maybe
 - Recipes????
 - English tips??
 - Trivia on random facts or a class subject?
 - Maybe if I knew more about Discord Bot programming
 - Cybersecurity as I learn on my own
 - SPACE/ASTRONOMY
 - Candle making??
 */