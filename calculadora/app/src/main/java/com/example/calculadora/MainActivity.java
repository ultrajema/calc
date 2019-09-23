package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.service.autofill.OnClickAction;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import funciones.clsentrada;
import funciones.clsestadistica;

public class MainActivity extends AppCompatActivity {

    public EditText numeros;
    public TextView media2;
    public TextView desviacion3;
    public TextView mediana2;
    public TextView moda2;
    public TextView rango2;
    public TextView orden;

    int n;
    String vectar;


    double media, mediana, moda, rango, desviacion2;
    clsestadistica calculadora;
    clsentrada entrada = new clsentrada();
    int [] vectir;
    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numeros = (EditText) findViewById(R.id.numtex);
        media2 = (TextView) findViewById(R.id.texmedia);
        desviacion3 = (TextView) findViewById(R.id.texdesviacion);
        mediana2 = (TextView) findViewById(R.id.texmediana);
        moda2 = (TextView) findViewById(R.id.texmoda2);
        rango2 = (TextView) findViewById(R.id.texrango);
        orden = (TextView) findViewById(R.id.texrango);



    }

    public void agregar(View view){

        vectar = numeros.getText().toString();
        String [] arr = vectar.split(" ");
        int cantidad = arr.length;
        vectir = new int[cantidad];
        for(int i =0; i<arr.length;i++){
            vectir[i] = Integer.parseInt(arr[i]);
        }

        //vector = entrada.llenararreglo(n);

    }

    public void calcular(View view){


        calculadora = new clsestadistica(vectir);

        media = calculadora.promedio();
        desviacion2 = calculadora.desviacion();
        mediana= calculadora.mediana();
        moda = calculadora.moda();
        rango = calculadora.rango();


        media2.setText("la media es: "+media);
        desviacion3.setText("la desviacion es: "+desviacion2);
        mediana2.setText("la mediana es: "+mediana);
        moda2.setText("la moda es: "+moda);
        rango2.setText("el rango es: "+rango);

    }
}
