package dev.tamayoz.com.matematicasfacil;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class TeachSuma2 extends AppCompatActivity {
    RadioGroup grupo;
    RadioButton dos, tres, cinco;
    Button comprobar,siguiente;
    TextView correcto;
    ImageView cincofrutas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teach_suma2);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }
    public void comprobar (View view){
        grupo = findViewById(R.id.radio_group);
        dos = findViewById(R.id.dos_button);
        tres = findViewById(R.id.tres_button);
        cinco = findViewById(R.id.cinco_button);
        comprobar=findViewById(R.id.button9);
        correcto=findViewById(R.id.textView120);
        siguiente=findViewById(R.id.bu_siguiente);
        cincofrutas=findViewById(R.id.imagen_cincofrutas);

        if (grupo.getCheckedRadioButtonId() == -1){
            Toast.makeText(this, "Debes de contestar",Toast.LENGTH_SHORT).show();
        } else if (dos.isChecked()){
            Toast.makeText(this, "Incorrecto",Toast.LENGTH_SHORT).show();
        } else if (tres.isChecked()){
            Toast.makeText(this, "Incorrecto",Toast.LENGTH_SHORT).show();
        }else if (cinco.isChecked()){
            comprobar.setVisibility(View.INVISIBLE);
            correcto.setVisibility(View.VISIBLE);
            siguiente.setVisibility(View.VISIBLE);
            cincofrutas.setVisibility(View.VISIBLE);
        }
    }
    public void siguiente(View view){
        Intent siguiente = new Intent(this, DiagSuma.class);
        startActivity(siguiente);
    }
}
