package com.ihc.reciclafacil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class historico_descartes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historico_descartes);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Histórico de descartes");
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}