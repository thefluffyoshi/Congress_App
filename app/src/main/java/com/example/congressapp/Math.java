package com.example.congressapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

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
        ImageView chart = (ImageView) findViewById(R.id.flowChartIV);
        chart.setVisibility(View.VISIBLE);
        TextView mathTV = (TextView) findViewById(R.id.MathTV);
        mathTV.setText("");
    }

    public void onClickTrig(View view)
    {
        updateIVFFC();
        TextView trig = (TextView) findViewById(R.id.MathTV);
        trig.setText("Opp = Opposite   Hyp = Hypotenuse   Adj = Adjacent \n sinθ = opp/hyp   cscθ = hyp/opp \n cosθ = adj/hyp   secθ = hyp/adj \n tanθ = opp/adj   cotθ = adj/opp");
    }

    public void onClickTrigIdentities(View view)
    {
        updateIVFFC();
        TextView trigIdentities = (TextView) findViewById(R.id.MathTV);
        trigIdentities.setText("sin²θ + cos²θ = 1 \n 1 + tan²θ = sec²θ \n 1 + cot²θ = csc²θ \nsin2θ = 2sinθcosθ \ncos2θ = cos²θ - sin²θ");
    }

    //coterminal angles
    public void onClickCoterminalAngles()
    {
        updateIVFFC();
        TextView CA = (TextView) findViewById(R.id.MathTV);
        CA.setText("To find a coterminal angle, you add 360 twice to the given angle. Then subtract 360 from the given angle.");
    }

    public void onClickLimits(View view)
    {
        updateIVFFC();
        TextView limits = (TextView) findViewById(R.id.MathTV);
        limits.setText("lim x→(value) f(x). To find a limit, you input the value that x is approaching. Without graphing, you can find what f(x) is approaching from the left and right of the x value. If the denominator is 0 or the value on top is being divided by 0 then you would factor to cancel out terms. Then reinput the x value into the factored out form.");
    }

    private void updateIVFFC()
    {
        ImageView chart = (ImageView)findViewById(R.id.flowChartIV);
        chart.setVisibility(View.INVISIBLE);
    }

    //

    //Calculus!!
}