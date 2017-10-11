package com.example.a15657_000.listviewtest;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by 15657_000 on 2017/6/5 0005.
 */

public class TitleClass extends LinearLayout {
    private Button button,button2;
    public TitleClass(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title,this);
        button = (Button) findViewById(R.id.b1);
        button2 = (Button) findViewById(R.id.b2);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)getContext()).finish();
            }
        });
        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"You Checked Edit.",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
