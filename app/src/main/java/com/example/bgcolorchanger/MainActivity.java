package com.example.bgcolorchanger;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout bgElements = (ConstraintLayout) findViewById(R.id.activity_main);
        bgElements.setBackgroundColor(Color.RED);
        Button button = (Button) findViewById(R.id.button);
        button.setText("Change to BLUE");

        myButtonListener();
    }
    public void myButtonListener(){
        Button button = (Button) findViewById(R.id.button);
        TextView tbox = (TextView) findViewById(R.id.tbox);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConstraintLayout bgElements = (ConstraintLayout) findViewById(R.id.activity_main);
                int color = ((ColorDrawable) bgElements.getBackground()).getColor();

                if(color== Color.RED){
                    bgElements.setBackgroundColor(Color.BLUE);
                    button.setText("Change to RED");
                    tbox.setText("BLUE");

                }
                else{
                    bgElements.setBackgroundColor(Color.RED);
                    button.setText("Change to BLUE");
                    tbox.setText("RED");
                }
            }
        });
    }
}