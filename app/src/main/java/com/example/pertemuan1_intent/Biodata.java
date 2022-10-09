package com.example.pertemuan1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Biodata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        final EditText nama = (EditText) findViewById(R.id.input_nama);
        final EditText nim  = (EditText) findViewById(R.id.input_nim);
        final EditText jurusan  = (EditText) findViewById(R.id.input_jurusan);
        final EditText angkatan = (EditText) findViewById(R.id.input_angkatan);

        final TextView nama_t   = (TextView) findViewById(R.id.output_nama);
        final TextView nim_t    = (TextView) findViewById(R.id.output_nim);
        final TextView jurusan_t    = (TextView) findViewById(R.id.output_jurusan);
        final TextView angkatan_t   = (TextView) findViewById(R.id.output_angkatan);

        final Button tampilkan = (Button) findViewById(R.id.button_tampilkan);
        tampilkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama_tampil  = nama.getText().toString();
                String nim_tampil   = nim.getText().toString();
                String jurusan_tampil   = jurusan.getText().toString();
                String angkatan_tampil  = angkatan.getText().toString();

                nama_t.setText(nama_tampil);
                nim_t.setText(nim_tampil);
                jurusan_t.setText(jurusan_tampil);
                angkatan_t.setText(angkatan_tampil);
            }
        });
    }
}