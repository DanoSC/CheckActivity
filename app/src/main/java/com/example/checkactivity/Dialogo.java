package com.example.checkactivity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Dialogo extends AppCompatActivity {
    private TextView textoSeleccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogo);

        textoSeleccion = findViewById(R.id.textoSeleccion);
        Button botonMostrarDialogo = findViewById(R.id.botonMostrarDialogo);

        botonMostrarDialogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarDialogo();
            }
        });
    }

    private void mostrarDialogo() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Selecciona una opción")
                .setItems(R.array.opciones, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        String[] opciones = getResources().getStringArray(R.array.opciones);
                        String seleccion = opciones[which];
                        textoSeleccion.setText("Selección: " + seleccion);
                    }
                });
        builder.create().show();
    }
}