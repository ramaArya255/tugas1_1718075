package com.example.pertemuan1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Segitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        final EditText alasSegitiga     = (EditText) findViewById(R.id.numAlas);
        final EditText tinggiSegitiga   = (EditText) findViewById(R.id.numTinggi);

        final EditText luasSegitiga = (EditText) findViewById(R.id.outputLuas);

        final Button hasilLuas  = (Button) findViewById(R.id.button_hitungLuas);
        hasilLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (alasSegitiga.length()==0 && tinggiSegitiga.length()==0){
                    Toast.makeText(getApplication(),"Alas dan Tinggi tidak boleh kosong",Toast.LENGTH_LONG).show();
                }
                else {
                    String alas = alasSegitiga.getText().toString();
                    String tinggi = tinggiSegitiga.getText().toString();
                    Double a = Double.parseDouble(alas);
                    Double b = Double.parseDouble(tinggi);
                    Double c = a * b / 2;
                    String hasil = String.valueOf(c);
                    luasSegitiga.setText(hasil);
                }
            }
        });
    }
}