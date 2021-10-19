package com.ihc.reciclafacil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class concluir_descarte extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concluir_descarte);
    }

    public void gotoMenu(View view)
    {
        Intent i = new Intent(this, menu_principal.class);
        startActivity(i);
    }
}