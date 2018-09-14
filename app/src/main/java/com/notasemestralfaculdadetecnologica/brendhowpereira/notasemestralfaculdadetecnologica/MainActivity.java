package com.notasemestralfaculdadetecnologica.brendhowpereira.notasemestralfaculdadetecnologica;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Vibrator vibracall;
    EditText txtNotaNp1;
    EditText txtNotaNp2;
    EditText txtNotaPim;
    Button btnCalcular;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vibracall = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        txtNotaNp1 = findViewById(R.id.editTextNotaNp1);
        txtNotaNp2 = findViewById(R.id.editTextNotaNp2);
        txtNotaPim = findViewById(R.id.editTextNotaPim);
        btnCalcular = findViewById(R.id.buttonCalcular);
        txtResult = findViewById(R.id.textViewResultado);
    }

    public void calcular(View view){
        if(this.txtNotaNp1.getText().toString().trim().equals("") ||
            this.txtNotaPim.getText().toString().trim().equals("") ||
            this.txtNotaNp2.getText().toString().trim().equals("")){
            Toast.makeText(this, "Valores incorretos", Toast.LENGTH_SHORT).show();
            vibracall.vibrate(199);

        }else {
            double np1 = Double.valueOf(this.txtNotaNp1.getText().toString());
            double np2 = Double.valueOf(this.txtNotaNp2.getText().toString());
            double pim = Double.valueOf(this.txtNotaPim.getText().toString());
            txtResult.setText(String.format(String.valueOf(((np1 * 4) + (pim * 2) + (np2 * 4))/ 10)));

        }
    }
}
