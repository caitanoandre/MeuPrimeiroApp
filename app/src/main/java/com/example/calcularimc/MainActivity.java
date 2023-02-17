package com.example.calcularimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView Resultado;
    private EditText Peso;
    private EditText Altura;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Resultado = findViewById(R.id.Resultado);
        Peso = findViewById(R.id.Peso);
        Altura = findViewById(R.id.Altura);

    }
    public  void calcularimc(View view){
        double peso  =  Double.parseDouble(Peso.getText().toString()) ;
        double altura = Double.parseDouble(Altura.getText().toString());
        double resultado = peso/(altura*altura);


        if(resultado<19){
            Resultado.setText("Abaixo do Peso");


        }else if (resultado<=19 || resultado<25) {
            Resultado.setText("Peso normal");

        }else if (resultado<=25 || resultado<30) {
            Resultado.setText("Sobrepeso");
        }
            else if (resultado<=30 || resultado<40) {
                Resultado.setText("Obesidade Tipo 1");
            }
                else if (resultado>40 ) {
                Resultado.setText("Obesidade Tipo 2 ");
            }


    }


}