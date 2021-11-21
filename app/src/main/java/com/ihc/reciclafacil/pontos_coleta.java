package com.ihc.reciclafacil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class pontos_coleta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pontos_coleta);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Pontos de Coleta");
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}