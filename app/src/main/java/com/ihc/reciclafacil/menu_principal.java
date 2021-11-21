package com.ihc.reciclafacil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu_principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        getSupportActionBar().setTitle("ReciclaFacil");
    }

    public void gotoResgate(View view)
    {
        Intent i = new Intent(this, resgate_pontos.class);
        startActivity(i);
    }

    public void gotoPontosColeta(View view)
    {
        Intent i = new Intent(this, MapaColeta.class);
        startActivity(i);
    }

    public void gotoColetaDomicilio(View view)
    {
        Intent i = new Intent(this, coleta_endereco.class);
        startActivity(i);
    }

    public void gotoHistorico(View view)
    {
        Intent i = new Intent(this, historico_descartes.class);
        startActivity(i);
    }

    public void gotoEfetuarDescarte(View view)
    {
        Intent i = new Intent(this, concluir_descarte.class);
        startActivity(i);
    }
}