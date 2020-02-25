package com.example.ex3matala1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b;
    int x=0;
    boolean y=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = findViewById(R.id.but);
    }

    public void ho(View view) {
            x++;
            b.setText("This is a click number:"+x);

            if(x==6){
                b.setText("Enough to click. Go to new start!");
                x=0;

            }
        }

    }

