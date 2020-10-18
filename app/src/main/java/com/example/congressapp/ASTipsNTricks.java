package com.example.congressapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

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

    public void onClickTip3(View view)
    {
        TextView tip3 = (TextView) findViewById(R.id.TipsTV);
        tip3.setText("You can set an image to be invisible through the .xml file by putting an Image View in the design, then in the .xml code put in android:visibility=\"invisible\". Then in the .java file make an OnClick method put ImageView (var name) = (ImageView)findViewById(R.id.(ID)); Underneath that, you would use the var name to set visibility by (var name).setVisibility(View.VISIBLE);");
    }

    public void onClickTip4(View view)
    {
        TextView tip4 = (TextView) findViewById(R.id.TipsTV);
        tip4.setText("When you're in Android Studio and you want to commit to Github, go to the top of the bar while in an Android Studio project and click VCS. Click Enable Version Control Integration then click Ok for Git. Make a commit for your project after making small parts of your app to work. Make sure to maintain good commit hygiene by using commas instead of the word \"and\"!");
    }

    public void onClickTip5(View view)
    {
        TextView tip5 = (TextView) findViewById(R.id.TipsTV);
        tip5.setText("In the .xml file add buttons, remove their text and rename their IDs to be unique. Then create methods called onCreate and onClick. Add Button buttonObject1 = (Button)findViewById(R.id.button1);. You can change the variable buttonObject1 to something else and connect button1 to the ID of your button. Make onCreate and onClick methods. Then add these into onCreate buttonObject1.setText(\"\");, buttonObject1.setBackgroundColor(#(hex));, buttonObject1.setOnClickListener;. In the onClick, you can either add a toast, make it display a text or change screens.");
    }

    //Add information
}