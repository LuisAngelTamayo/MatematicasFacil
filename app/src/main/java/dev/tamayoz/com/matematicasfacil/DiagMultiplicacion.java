package dev.tamayoz.com.matematicasfacil;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class DiagMultiplicacion extends AppCompatActivity {
    RadioGroup grupom1, grupom2, grupom3, grupom4, grupom5;
    Button comprobar_botonm, siguiente_botonm;


    RadioButton sumam1;
    RadioButton sumam2;
    RadioButton sumam3;
    RadioButton sumam4;
    RadioButton sumam5;

    RadioButton correc_m1;
    RadioButton correc_m2;
    RadioButton correc_m3;
    RadioButton correc_m4;
    RadioButton correc_m5;

    RadioButton concam1;
    RadioButton concam2;
    RadioButton concam3;
    RadioButton concam4;
    RadioButton concam5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diag_multiplicacion);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        siguiente_botonm = findViewById(R.id.siguientem);

        correc_m1 = findViewById(R.id.correctom1);
        correc_m2 = findViewById(R.id.correctm2);
        correc_m3 = findViewById(R.id.correctm3);
        correc_m4 = findViewById(R.id.correctm4);
        correc_m5 = findViewById(R.id.correctm5);

        sumam1 = findViewById(R.id.sumam1);
        sumam2 = findViewById(R.id.sumam2);
        sumam3 = findViewById(R.id.sumam3);
        sumam4 = findViewById(R.id.sumam4);
        sumam5 = findViewById(R.id.sumam5);

        concam1 = findViewById(R.id.conca_m1);
        concam2 = findViewById(R.id.conca_m2);
        concam3 = findViewById(R.id.conca_m3);
        concam5 = findViewById(R.id.conca_m5);
        concam4 = findViewById(R.id.conca_m4);
    }
    public void comprobar(View view) {
        grupom1 = findViewById(R.id.rgm1);
        grupom2 = findViewById(R.id.rgm2);
        grupom3 = findViewById(R.id.rgm3);
        grupom4 = findViewById(R.id.rgm4);
        grupom5 = findViewById(R.id.rgm5);
        int cont = 0;
        if (grupom5.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Debes de contestar todas las operaciones", Toast.LENGTH_LONG).show();
            cont = 0;
        } else {
            cont++;
        }
        if (grupom4.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Debes de contestar todas las operaciones", Toast.LENGTH_LONG).show();
            cont = 0;
        } else {
            cont++;
        }
        if (grupom3.getCheckedRadioButtonId() == -1) {
            cont = 0;
            Toast.makeText(this, "Debes de contestar todas las operaciones", Toast.LENGTH_LONG).show();
        } else {
            cont++;
        }
        if (grupom2.getCheckedRadioButtonId() == -1) {
            cont = 0;
            Toast.makeText(this, "Debes de contestar todas las operaciones", Toast.LENGTH_LONG).show();
        } else {
            cont++;
        }
        if (grupom1.getCheckedRadioButtonId() == -1) {
            cont = 0;
            Toast.makeText(this, "Debes de contestar todas las operaciones", Toast.LENGTH_LONG).show();
        } else {
            cont++;
        }
        if (cont != 0) {
            int suma = 0;
            int buena = 0;
            int conca = 0;

            if (sumam1.isChecked()) {
                suma++;
            } else if (correc_m1.isChecked()) {
                buena++;
            } else if (concam1.isChecked()) {
                conca++;
            }

            if (sumam2.isChecked()) {
                suma++;
            } else if (correc_m2.isChecked()) {
                buena++;
            } else if (concam2.isChecked()) {
                conca++;
            }

            if (sumam3.isChecked()) {
                suma++;
            } else if (correc_m3.isChecked()) {
                buena++;
            } else if (concam3.isChecked()) {
                conca++;
            }

            if (sumam4.isChecked()) {
                suma++;
            } else if (correc_m4.isChecked()) {
                buena++;
            } else if (concam4.isChecked()) {
                conca++;
            }

            if (sumam5.isChecked()) {
                suma++;
            } else if (correc_m5.isChecked()) {
                buena++;
            } else if (concam5.isChecked()) {
                conca++;
            }


            if (suma != 0) {
                Intent siguiente = new Intent(this, TeachMultiplica1.class);
                startActivity(siguiente);
            }
            if (conca != 0) {
                Intent siguiente = new Intent(this, TeachMultiplica3.class);
                startActivity(siguiente);
            }
            if (buena == 5) {
                Toast.makeText(this, "¡GENIAL!  Sabes Multiplicar", Toast.LENGTH_LONG).show();
                String ddiv = getIntent().getStringExtra("div");
                if (ddiv.equals("2")) {
                    Intent siguiente = new Intent(this, DiagDividir.class);
                    startActivity(siguiente);
                }
            }
        }
    }
}
