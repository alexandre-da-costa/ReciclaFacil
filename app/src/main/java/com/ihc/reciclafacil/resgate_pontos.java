package com.ihc.reciclafacil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class resgate_pontos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resgate_pontos);
    }

    public void gotoConfirmarSaque(View view)
    {
        Intent i = new Intent(this, resgate_pontos_confirmacao.class);
        startActivity(i);
    }
}