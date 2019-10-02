package com.spungkyb.beratbadanapp;//merupakan package

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnHitung;
    EditText edit_text_name,edit_text_bb,edit_text_tb;
    TextView hasil;


    //extend merupakan inheritance
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHitung = (Button) findViewById(R.id.btnHitung);
        edit_text_name = (EditText)findViewById(R.id.edit_text_nama);
        edit_text_bb = (EditText)findViewById(R.id.edit_text_bb);
        edit_text_tb = (EditText)findViewById(R.id.edit_text_tb);
        hasil = (TextView)findViewById(R.id.hasil);

        //set on click listener pada button
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edit_text_name.getText().toString();
                Integer bb = Integer.parseInt(edit_text_bb.getText().toString());
                Double tb = Double.valueOf(edit_text_tb.getText().toString())/100;
                Double bmi = bb/Math.pow(tb,2);
                if (bmi < 18.5) {
                    hasil.setText("cungkriing cok");
                } else if (bmi >= 18.5 && bmi < 25.0) {
                    hasil.setText("pas cok");
                } else if (bmi >= 25.0 && bmi < 30.0) {
                    hasil.setText("moyez cok");
                } else {
                    hasil.setText("sapi cok");
                }



            }
        });



    }

    //method onclick, View view sebagai paramater
    public void Tentang(View view) {
    }

    public void Hitung(View view) {
    }
}