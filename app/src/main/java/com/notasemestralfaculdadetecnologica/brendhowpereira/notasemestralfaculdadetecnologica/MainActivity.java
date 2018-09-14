package com.notasemestralfaculdadetecnologica.brendhowpereira.notasemestralfaculdadetecnologica;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Vibrator vibracall;
    String ata = getString(R.string.textViewResult);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vibracall = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
    }

    public void calcular(View view){
        vibracall.vibrate(199);
    }
}
