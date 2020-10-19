package com.example.congressapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Psychology extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psychology);
    }

    public void onClickBckHome(View view)
    {
        startActivity(new Intent(Psychology.this, MainActivity.class));
    }

    public void onClickBodyLang(View view)
    {
        TextView bodylang = (TextView) findViewById(R.id.psychTV);
        bodylang.setText("When a person retells a story, they will recount the details of a story instead of only the main thing that happened. Generally, liars are nervous and may look around to try and find an escape or to avoid answering. Usually people will fidget when lying because they are nervous about getting caught. Focus on emotions or lack of emotions and incongruent movements/facial expressions.");
    }
}