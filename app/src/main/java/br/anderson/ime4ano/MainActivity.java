package br.anderson.ime4ano;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v){
        EditText campo = (EditText) findViewById(R.id.numero);
        int n = Integer.parseInt(campo.getText().toString());
        int fibo = (new Fibonacci()).calculo(n);
        Toast.makeText(this, String.valueOf(fibo), Toast.LENGTH_LONG).show();
    }
}