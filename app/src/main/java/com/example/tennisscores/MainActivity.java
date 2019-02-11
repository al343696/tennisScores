package com.example.tennisscores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textSetsA, textSetsB, textPointsA, textPointsB;
    String currentPointsA, currentPointsB, currentGamesA, currentGamesB, currentSetsA, currentSetsB;

    //TODO: Declarar lo que falta, solo si se va a cambiar su valor

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textSetsA = findViewById(R.id.textSetsA);


        textPointsA = findViewById(R.id.textPointsA);
        textPointsB = findViewById(R.id.textPointsB);

        //TODO: Añadir todos los IDs
        onClear();
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.botonPuntoA){
            compararPuntosA();

            textPointsA.setText(currentPointsA);
            textPointsB.setText(currentPointsB);

        }else if(view.getId() == R.id.botonPuntoB)
        {
            compararPuntosB();

            textPointsB.setText(currentPointsB);
            textPointsA.setText(currentPointsA);

        }else if(view.getId() == R.id.clear){

            onClear();
        }
    }

    public void onClear()
    {
        currentGamesA = " 0";
        currentGamesB = " 0";

        currentPointsA = " 0";
        textPointsA.setText(currentPointsA);

        currentPointsB = " 0";
        textPointsB.setText(currentPointsB);

        currentSetsA = " 0";
        currentSetsB = " 0";


        //TODO: Resetear todo lo necesario, debe estar declarado al principio, y creado en el onCreate();

    }

    void compararPuntosA()
    {
        if(currentPointsA == " 0")
        {
            currentPointsA = "15";
        }
        else if(currentPointsA == "15")
        {
            currentPointsA = "30";
        }
        else if(currentPointsA == "30")
        {
            currentPointsA = "40";
        }
        else if(currentPointsA == "40"){
            if(currentPointsB != "40")
            {
                anotarPuntoA();
            }
            else{
                currentPointsA = "Ad";
                currentPointsB = "--";
            }
        }else if(currentPointsA == "Ad")
        {
            anotarPuntoA();
        }
        else{
            currentPointsB = "40";
            currentPointsA = "40";
        }


    }

    void compararPuntosB()
    {
        if(currentPointsB == " 0")
        {
            currentPointsB = "15";
        }
        else if(currentPointsB == "15")
        {
            currentPointsB = "30";
        }
        else if(currentPointsB == "30")
        {
            currentPointsB = "40";
        }
        else if(currentPointsB == "40"){
            if(currentPointsA != "40")
            {
                anotarPuntoA();
            }
            else{
                currentPointsB = "Ad";
                currentPointsA = "--";
            }
        }
        else if(currentPointsB == "Ad")
        {
            anotarPuntoB();
        }
        else{
            currentPointsB = "40";
            currentPointsA = "40";
        }


    }

    void anotarPuntoA(){

    }

    void anotarPuntoB(){

    }


}
