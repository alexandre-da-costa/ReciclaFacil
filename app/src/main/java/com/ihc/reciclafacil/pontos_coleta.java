package com.ihc.reciclafacil;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class pontos_coleta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pontos_coleta);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Pontos de Coleta");

        ActivityCompat.requestPermissions(pontos_coleta.this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 123);

        if (ContextCompat.checkSelfPermission(getApplicationContext(),
                Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            Toast.makeText(getApplicationContext(), "Permissão não concedida", Toast.LENGTH_LONG).show();
            gotoMenu();
            return;
        } else
            gotoPontosColeta();
    }

    public void gotoPontosColeta() {
        Intent i = new Intent(this, MapaColeta.class);
        startActivity(i);
    }

    public void gotoMenu() {
        Intent i = new Intent(this, menu_principal.class);
        startActivity(i);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}