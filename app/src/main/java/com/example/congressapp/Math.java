package com.example.congressapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

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
        TextView trig = (TextView)findViewById(R.id.MathTV);
        trig.setText("Opp = Opposite   Hyp = Hypotenuse   Adj = Adjacent \n sinθ = opp/hyp   cscθ = hyp/opp \n cosθ = adj/hyp   secθ = hyp/adj \n tanθ = opp/adj   cotθ = adj/opp");
    }

    //coterminal angles

    public void onClickLimits(View view)
    {
        //how to find limits
    }

    //

    //Calculus!!
}