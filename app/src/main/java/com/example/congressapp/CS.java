package com.example.congressapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_s);
    }

    public void onClickBTH(View view)
    {
        startActivity(new Intent(CS.this, MainActivity.class));
    }

    public void onClickForLoop(View view)
    {
        TextView forloop = (TextView) findViewById(R.id.csTV);
        forloop.setText("A for loop consists of:" +
                        "\nfor (int i = 0; i < 5; i++)" +
                        "\n{" +
                        "\n\t(the brain method)" +
                        "\n}");
    }

    public void onClickArray(View view)
    {
        TextView array = (TextView) findViewById(R.id.csTV);
        array.setText("You can use a for loop for an array. You can change the values at the end of each intArray[]. You would use a for loop to do calculations without copy and pasting code over and over, to print out all of the values or to change values." +
                      "\nint [] intArray = new int[100];" +
                      "\nintArray[0] = 110;" +
                      "\nintArray[1] = 100" +
                      "\nintArray[2] = 99" +
                      "\nintArray[3] = 89" +
                      "\n for (int i = 100; i > 0; i--)" +
                      "\n{" +
                      "\n  System.out.println(intArray[i]);" +
                      "\n}");
    }


}