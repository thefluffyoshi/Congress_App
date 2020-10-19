package com.example.congressapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Japanese extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_japanese);
    }

    public void onClickbth(View view)
    {
        startActivity(new Intent(Japanese.this, MainActivity.class));
    }

    public void onClickHiragana(View view)
    {
        TextView hiragana = (TextView) findViewById(R.id.JapTV);
        hiragana.setText(
                        "  a = あ         ki = き         so = そ         ni = に" +
                        "\n   i = い        ku = く          ta = た       nu = ぬ" +
                        "\n  u = う        ke = け         chi = ち       ne = ね" +
                        "\n  e = え        ko = こ        tsu = つ       no = の" +
                        "\n  o = お        sa = さ          te = て       ha = は" +
                        "\nka = か       shi = し          to = と         hi = ひ" +
                        "\nsu = す        se = せ          na = な   　 fu = ふ" +
                        "\nhe = へ       ho = ほ         ma = ま       mi = み");
    }
}