package com.codingwithhassan.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = this.findViewById(R.id.editTextTextPersonName);
        TextView textView = this.findViewById(R.id.textView);
        Button button = this.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Click Event Listening...", Toast.LENGTH_SHORT).show();
                int number = Integer.parseInt(editText.getText().toString());
                long grams = number * 1000;
                double pounds = number * 2.205;
                textView.setText(number+"kg = "+grams+"g" + " = " + pounds + " pounds");
            }
        });

    }
}