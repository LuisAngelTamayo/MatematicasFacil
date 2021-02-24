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

public class DiagDividir extends AppCompatActivity {
    RadioGroup grupo1d, grupo2d, grupo3d, grupo4d, grupo5d;
    Button bcompro_d, bsig_d;

    RadioButton suma1d;
    RadioButton suma2d;
    RadioButton suma3d;
    RadioButton suma4d;
    RadioButton suma5d;

    RadioButton correc_d1;
    RadioButton correc_d2;
    RadioButton correc_d3;
    RadioButton correc_d4;
    RadioButton correc_d5;

    RadioButton mult_d1;
    RadioButton multd_2;
    RadioButton mult_d3;
    RadioButton multd_4;
    RadioButton mult_d5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diag_dividir);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        bcompro_d = findViewById(R.id.sig_div_bot);
        bsig_d = findViewById(R.id.comp_div_bot);


        suma1d = findViewById(R.id.rest_div1);
        suma2d = findViewById(R.id.rest_div2);
        suma3d = findViewById(R.id.rest_div3);
        suma4d = findViewById(R.id.rest_div4);
        suma5d = findViewById(R.id.rest_div5);

        correc_d1 = findViewById(R.id.buen_div1);
        correc_d2 = findViewById(R.id.buen_div2);
        correc_d3 = findViewById(R.id.buen_div3);
        correc_d4 = findViewById(R.id.buen_div4);
        correc_d5 = findViewById(R.id.buen_div5);

        mult_d1 = findViewById(R.id.mult_div1);
        multd_4 = findViewById(R.id.mult_div2);
        multd_2 = findViewById(R.id.mult_div3);
        mult_d3 = findViewById(R.id.mult_div4);
        mult_d5 = findViewById(R.id.mult_div5);
    }
    public void comprobar(View view) {
        grupo1d = findViewById(R.id.rgd1);
        grupo2d = findViewById(R.id.rgd2);
        grupo3d = findViewById(R.id.rgd3);
        grupo4d = findViewById(R.id.rgd4);
        grupo5d = findViewById(R.id.rgd5);

        int cont = 0;
        if (grupo5d.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Debes de contestar todas las operaciones", Toast.LENGTH_LONG).show();
            cont = 0;
        } else {
            cont++;
        }
        if (grupo4d.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Debes de contestar todas las operaciones", Toast.LENGTH_LONG).show();
            cont = 0;
        } else {
            cont++;
        }
        if (grupo3d.getCheckedRadioButtonId() == -1) {
            cont = 0;
            Toast.makeText(this, "Debes de contestar todas las operaciones", Toast.LENGTH_LONG).show();
        } else {
            cont++;
        }
        if (grupo2d.getCheckedRadioButtonId() == -1) {
            cont = 0;
            Toast.makeText(this, "Debes de contestar todas las operaciones", Toast.LENGTH_LONG).show();
        } else {
            cont++;
        }
        if (grupo1d.getCheckedRadioButtonId() == -1) {
            cont = 0;
            Toast.makeText(this, "Debes de contestar todas las operaciones", Toast.LENGTH_LONG).show();
        } else {
            cont++;
        }
        if (cont != 0) {
            int suma = 0;
            int buena = 0;
            int multipli = 0;

            if (suma1d.isChecked()) {
                suma++;
            } else if (correc_d1.isChecked()) {
                buena++;
            } else if (mult_d1.isChecked()) {
                multipli++;
            }

            if (suma2d.isChecked()) {
                suma++;
            } else if (correc_d2.isChecked()) {
                buena++;
            } else if (multd_2.isChecked()) {
                multipli++;
            }

            if (suma3d.isChecked()) {
                suma++;
            } else if (correc_d3.isChecked()) {
                buena++;
            } else if (mult_d3.isChecked()) {
                multipli++;
            }

            if (suma4d.isChecked()) {
                suma++;
            } else if (correc_d4.isChecked()) {
                buena++;
            } else if (multd_4.isChecked()) {
                multipli++;
            }

            if (suma5d.isChecked()) {
                suma++;
            } else if (correc_d5.isChecked()) {
                buena++;
            } else if (mult_d5.isChecked()) {
                multipli++;
            }


            if (suma != 0) {
                Intent siguiente = new Intent(this, TeachDiv1.class);
                startActivity(siguiente);
            }
            if (multipli != 0) {
                Intent siguiente = new Intent(this, TeachDiv1.class);
                startActivity(siguiente);
            }
            if (buena == 5) {
                Toast.makeText(this, "¡GENIAL!  Sabes Dividir", Toast.LENGTH_LONG).show();
                //Intent siguiente = new Intent(this, ConcluidoActivity.class);
                //startActivity(siguiente);
            }
        }


    }
}
