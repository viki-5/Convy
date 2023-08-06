package com.example.myre1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button buttone;
    private TextView textview2;
    private EditText editText;
    private TextView textview2e;
    private EditText editTexte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textview2 = findViewById(R.id.textView2);
        editText = findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String s = editText.getText().toString();
                double pounds = Double.parseDouble(s);
                double kg = 0.453592 * pounds;
                textview2.setText("The kg value is : " + kg);
                Toast.makeText(MainActivity.this, "The value is " + kg, Toast.LENGTH_SHORT).show();
            }
        }
        );
        buttone = findViewById(R.id.button2);
        textview2e = findViewById(R.id.textView5);
        editTexte = findViewById(R.id.editText2);
        buttone.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String s = editTexte.getText().toString();
                double k = Double.parseDouble(s);
                double p = 2.20462 * k;
                textview2e.setText("The value in lbs is : " + p);
                Toast.makeText(MainActivity.this, "The value is " + p, Toast.LENGTH_SHORT).show();
            }
        });
    }
}