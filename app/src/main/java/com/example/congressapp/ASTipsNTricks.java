package com.example.congressapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

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

    public void onClickTip1(View view)
    {
        TextView tip1 = (TextView) findViewById(R.id.TipsTV);
        tip1.setText("You can make Toasts! Inside an OnClick Method, put in: Toast.makeText(this, \"You clicked the second button\", Toast.LENGTH_LONG).show(); You can change the text and whether it show up for a long time or a short time.");
    }

    public void onClickTip2(View view)
    {
        TextView tip2 = (TextView) findViewById(R.id.TipsTV);
        tip2.setText("If you notice the same code being copied and pasted into multiple different methods within a class, make a private class using private void. Then copy the code into the private class and call it when it's needed.");
    }

    //Add information on
}