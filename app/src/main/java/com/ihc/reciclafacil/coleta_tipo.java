package com.ihc.reciclafacil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class coleta_tipo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coleta_tipo);
        getSupportActionBar().setTitle("Solicitar Coleta");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void gotoDiaHora(View view)
    {
        Intent i = new Intent(this, coleta_agendamento.class);
        startActivity(i);
    }
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}