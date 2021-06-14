package com.example.caculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public EditText val1, val2, result;
    public Button btnSoma, btnDivide, btnMultiplica, btnSubtrai, btnLimpa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val1 = findViewById(R.id.val1);
        val2 = findViewById(R.id.val2);
        result = findViewById(R.id.result);
        btnSoma = findViewById(R.id.soma);
        btnDivide = findViewById(R.id.divide);
        btnMultiplica = findViewById(R.id.multiplica);
        btnSubtrai = findViewById(R.id.subtrai);
        btnLimpa = findViewById(R.id.limpa);


    }

    public void soma(View v){

        if(!validaForm()){
            return;
        }

        String valor1 = val1.getText().toString().trim();
        String valor2 = val2.getText().toString().trim();

        Double n1 = Double.parseDouble(valor1);
        Double n2 = Double.parseDouble(valor2);

        Double retorno = n1 + n2;

        //result.setEnabled(true);
        //result.setEnabled(false);
        result.setText(retorno.toString());

    }

    public void subtrai(View v){

        if(!validaForm()){
            return;
        }

        String valor1 = val1.getText().toString().trim();
        String valor2 = val2.getText().toString().trim();

        Double n1 = Double.parseDouble(valor1);
        Double n2 = Double.parseDouble(valor2);

        Double retorno = n1 - n2;

        result.setText(retorno.toString());
    }

    public void multiplica(View v){

        if(!validaForm()){
            return;
        }

        String valor1 = val1.getText().toString().trim();
        String valor2 = val2.getText().toString().trim();

        Double n1 = Double.parseDouble(valor1);
        Double n2 = Double.parseDouble(valor2);

        Double retorno = n1 * n2;

        result.setText(retorno.toString());
    }

    public void divide(View v){

        if(!validaForm()){
            return;
        }

        String valor1 = val1.getText().toString().trim();
        String valor2 = val2.getText().toString().trim();

        Double n1 = Double.parseDouble(valor1);
        Double n2 = Double.parseDouble(valor2);

        if(n2 != 0){
            Double retorno = n1 / n2;
            result.setText(retorno.toString());
        }else {
            val2.setError("O divisor não pode ser zero!");
            val2.requestFocus();
            result.setText("Infinity");
        }

    }

    public void limpa(View v){
        val1.setText("");
        val2.setText("");
        result.setText("");
    }

    public boolean validaForm() {

        String valor1 = val1.getText().toString().trim();
        String valor2 = val2.getText().toString().trim();

        if(valor1.isEmpty()) {
            val1.setError("Preencha o campo valor 1");
            val1.requestFocus();
            return false;
        }

        if(valor2.isEmpty()) {
            val2.setError("Preencha o campo valor 2");
            val2.requestFocus();
            return false;
        }

        return true;
    }

}
