package com.ihc.reciclafacil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class coleta_revisao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coleta_revisao);
    }

    public void gotoMenu(View view)
    {
        Intent i = new Intent(this, menu_principal.class);
        startActivity(i);
    }

    public void gotoConfirm(View view)
    {
        Context context = getApplicationContext();
        Toast.makeText(context, "Agendamento efetuado com sucesso!", Toast.LENGTH_LONG).show();
        Intent i = new Intent(this, menu_principal.class);
        startActivity(i);
    }
}