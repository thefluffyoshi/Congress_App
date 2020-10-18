package com.example.congressapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

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

    public void onClickStep1(View view)
    {
        TextView step1 = (TextView) findViewById(R.id.StepsTV);
        step1.setText("Buy a candle making kit, small jars, essential oils for the scent, small candle dye cubes, a thermometer, disposable spoons, an ounces scale");
    }

    public void onClickStep2(View view)
    {
        TextView step2 = (TextView) findViewById(R.id.StepsTV);
        step2.setText("From the candle making kit, peel off the sticker off the given packet and place it underneath the metal part of the candle wick and place it in the middle of your chosen jar. Then using a wooden chopstick, place it on top of the jar and gently wrap the excess wick around it.");
    }

    public void onClickStep3(View view)
    {
        TextView step3 = (TextView) findViewById(R.id.StepsTV);
        step3.setText("Add a small amount water to a pot where your metal melting pot can sit in without floating and boil it.");
    }

    public void onClickStep4(View view)
    {
        TextView step4 = (TextView) findViewById(R.id.StepsTV);
        step4.setText("1 pound of wax is 20 ounces. While the water boils, measure out how many ounces or pounds of wax you will need using this equation: Number of candles you want to make (multiplied by) volume of one container (all divided by) Volume ounces (in this case 20). Then put it in your metal melting pot and place the pot in the boiled water.");
    }
}