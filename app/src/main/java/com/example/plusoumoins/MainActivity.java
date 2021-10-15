package com.example.plusoumoins;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // Variables globales
    EditText etNumber;
    EditText etNumber2;
    private static final String TAG = "Log écrit : ";
    int randomNumber;

    // Méthode Initialisation pour lier les widgets au code
    public void init(){
        etNumber = findViewById(R.id.editNum);
        etNumber2 = findViewById(R.id.editNum2);
     //  btnOK = findViewById(R.id.btnOK);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Appel init
        init();
    }

    public void calculplus(View v){

        double result =  Double.parseDouble(etNumber2.getText().toString()) + Double.parseDouble(etNumber.getText().toString());
        Toast.makeText(this, Double.toString(result), Toast.LENGTH_SHORT).show();
    }

    public void calculmoins(View v){
        double result =  Double.parseDouble(etNumber2.getText().toString()) - Double.parseDouble(etNumber.getText().toString());
        Toast.makeText(this, Double.toString(result), Toast.LENGTH_SHORT).show();
    }

    public void calculfois(View v){
        double result =  Double.parseDouble(etNumber2.getText().toString()) * Double.parseDouble(etNumber.getText().toString());
        Toast.makeText(this, Double.toString(result), Toast.LENGTH_SHORT).show();
    }

    public void calculdivis(View v){
        if (Double.parseDouble(etNumber.getText().toString()) != 0 ){
            double result =  Double.parseDouble(etNumber2.getText().toString()) / Double.parseDouble(etNumber.getText().toString());
            Toast.makeText(this, Double.toString(result), Toast.LENGTH_SHORT).show();
        } else{
            Toast.makeText(this, "On ne peut pas diviser par 0", Toast.LENGTH_SHORT).show();
        }

    }


    public void generateRandomNumber(){
        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;
    }

}