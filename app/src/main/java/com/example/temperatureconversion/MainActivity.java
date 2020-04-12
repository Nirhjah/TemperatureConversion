package com.example.temperatureconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.editText);

        final TextView output = findViewById(R.id.output);

        //Farenheit to Celcius
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FarenheitToCelcius();

            }
        });

        //Celcius to Farenheit
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CelciusToFarenheit();

            }

        });
    }

    private void CelciusToFarenheit() {
        EditText editText = findViewById(R.id.editText);

        final TextView output = findViewById(R.id.output);
        double n1 = Double.valueOf(editText.getText().toString());

        double temp;

        temp = n1 * 1.8 + 32;


        output.setText("Output temperature" + temp);
    }

    private void FarenheitToCelcius() {
        EditText editText = findViewById(R.id.editText);

        final TextView output = findViewById(R.id.output);
        double n2 = Double.valueOf(editText.getText().toString());

        double temp;

        temp = n2 - 32 * 5/9;


        output.setText("Output temperature" + " " + temp);
    }


}
