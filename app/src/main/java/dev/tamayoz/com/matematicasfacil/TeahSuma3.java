package dev.tamayoz.com.matematicasfacil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TeahSuma3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teah_suma3);
    }
    public void siguiente(View view){
        Intent siguiente = new Intent(this, DiagSuma.class);
        startActivity(siguiente);
    }
}
