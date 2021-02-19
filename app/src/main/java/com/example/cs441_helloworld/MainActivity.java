package com.example.cs441_helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.graphics.Color;
import java.lang.Math;

public class MainActivity extends AppCompatActivity {


    TextView text;
    Button but1, but2, but3;
    Switch sw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        text = (TextView) findViewById(R.id.testing);
        but1 = (Button) findViewById(R.id.button1);
        but2 = (Button) findViewById(R.id.button2);
        but3 = (Button) findViewById(R.id.button3);
        sw = (Switch) findViewById(R.id.switch3);
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    View root = text.getRootView();
                    root.setBackgroundColor(Color.BLACK);
                }else{
                    View root = text.getRootView();
                    root.setBackgroundColor(Color.WHITE);
                }
            }
        });
    }


    public void on1click(View view){
        text.setTextSize(TypedValue.COMPLEX_UNIT_PX, text.getTextSize()-10);
    }

    public void on2click(View view){
        text.setTextSize(TypedValue.COMPLEX_UNIT_PX, text.getTextSize()+10);
    }

    public void on3click(View view){
        //text.setTextSize(text.getTextSize()+1);
        int x = (int)(Math.random() * (255 -  1));
        int y = (int)(Math.random() * (255 -  1));
        int z = (int)(Math.random() * (255 -  1));
        text.setTextColor(Color.rgb(x,y,z));
    }
}