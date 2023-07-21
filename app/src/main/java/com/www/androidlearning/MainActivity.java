package com.www.androidlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button inc,dec;
    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.counterView);
        dec = findViewById(R.id.decButton);
        inc = findViewById(R.id.incButton);

        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter = Integer.parseInt(textView.getText().toString());
                counter--;
                textView.setText(Integer.toString(counter));
            }
        });

        inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter = Integer.parseInt(textView.getText().toString());
                counter++;
                textView.setText(Integer.toString(counter));
            }
        });
    }
}