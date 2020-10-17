package com.example.congressapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Math extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
    }

    public void onClickBackHome(View view)
    {
        startActivity(new Intent(Math.this, MainActivity.class));
    }

    public void onClickFFC(View view)
    {
        ImageView chart = (ImageView)findViewById(R.id.flowChartIV);
        chart.setVisibility(View.VISIBLE);
    }

    public void onClickTrig(View view)
    {
        ImageView chart = (ImageView)findViewById(R.id.flowChartIV);
        chart.setVisibility(View.INVISIBLE);
    }

    //coterminal angles

    public void onClickLimits(View view)
    {
        //how to find limits
    }

    //

    //Calculus!!
}