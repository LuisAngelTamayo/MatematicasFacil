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

public class DiagResta extends AppCompatActivity {
    RadioGroup grupo1r, grupo2r, grupo3r, grupo4r, grupo5r;
    Button bcompro_r, bsig_r;

    RadioButton suma1;
    RadioButton suma2;
    RadioButton suma3;
    RadioButton suma4;
    RadioButton suma5;

    RadioButton correc_r1;
    RadioButton correc_r2;
    RadioButton correc_r3;
    RadioButton correc_r4;
    RadioButton correc_r5;

    RadioButton mult_r1;
    RadioButton multr_2;
    RadioButton mult_r3;
    RadioButton multr_4;
    RadioButton mult_r5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diag_resta);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        bsig_r = findViewById(R.id.b_sig_r);

        suma1 = findViewById(R.id.rs1);
        suma2 = findViewById(R.id.rs2);
        suma3 = findViewById(R.id.rs3);
        suma4 = findViewById(R.id.rs4);
        suma5 = findViewById(R.id.rs5);

        correc_r1 = findViewById(R.id.r_correct);
        correc_r2 = findViewById(R.id.r_correct2);
        correc_r3 = findViewById(R.id.r_correct3);
        correc_r4 = findViewById(R.id.r_correct4);
        correc_r5 = findViewById(R.id.r_correct5);

        mult_r1 = findViewById(R.id.rm1);
        multr_4 = findViewById(R.id.rm4);
        multr_2 = findViewById(R.id.rm2);
        mult_r3 = findViewById(R.id.rm3);
        mult_r5 = findViewById(R.id.rm5);


    }
    public void siguiente(View view) {
        grupo1r = findViewById(R.id.rg_resta);
        grupo2r = findViewById(R.id.rg_resta2);
        grupo3r = findViewById(R.id.rg_resta3);
        grupo4r = findViewById(R.id.rg_resta4);
        grupo5r = findViewById(R.id.rg_resta5);

        int cont = 0;
        if (grupo5r.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Debes de contestar todas las operaciones", Toast.LENGTH_LONG).show();
            cont = 0;
        } else {
            cont++;
        }
        if (grupo4r.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Debes de contestar todas las operaciones", Toast.LENGTH_LONG).show();
            cont = 0;
        } else {
            cont++;
        }
        if (grupo3r.getCheckedRadioButtonId() == -1) {
            cont = 0;
            Toast.makeText(this, "Debes de contestar todas las operaciones", Toast.LENGTH_LONG).show();
        } else {
            cont++;
        }
        if (grupo2r.getCheckedRadioButtonId() == -1) {
            cont = 0;
            Toast.makeText(this, "Debes de contestar todas las operaciones", Toast.LENGTH_LONG).show();
        } else {
            cont++;
        }
        if (grupo1r.getCheckedRadioButtonId() == -1) {
            cont = 0;
            Toast.makeText(this, "Debes de contestar todas las operaciones", Toast.LENGTH_LONG).show();
        } else {
            cont++;
        }
        if (cont != 0) {
            int suma = 0;
            int buena = 0;
            int multipli = 0;

            if (suma1.isChecked()) {
                suma++;
            } else if (correc_r1.isChecked()) {
                buena++;
            } else if (mult_r1.isChecked()) {
                multipli++;
            }

            if (suma2.isChecked()) {
                suma++;
            } else if (correc_r2.isChecked()) {
                buena++;
            } else if (multr_2.isChecked()) {
                multipli++;
            }

            if (suma3.isChecked()) {
                suma++;
            } else if (correc_r3.isChecked()) {
                buena++;
            } else if (mult_r3.isChecked()) {
                multipli++;
            }

            if (suma4.isChecked()) {
                suma++;
            } else if (correc_r4.isChecked()) {
                buena++;
            } else if (multr_4.isChecked()) {
                multipli++;
            }

            if (suma5.isChecked()) {
                suma++;
            } else if (correc_r5.isChecked()) {
                buena++;
            } else if (mult_r5.isChecked()) {
                multipli++;
            }


            if (suma != 0) {
                Intent siguiente = new Intent(this, TeachResta1.class);
                startActivity(siguiente);
            }
            if (multipli != 0) {
                Intent siguiente = new Intent(this, TeachResta1.class);
                startActivity(siguiente);
            }
            if (buena == 5) {
                Toast.makeText(this, "¡GENIAL!  Sabes restar", Toast.LENGTH_LONG).show();
                String dmult = getIntent().getStringExtra("multi");
                String ddiv = getIntent().getStringExtra("div");

                if (dmult.equals("2")) {
                    Intent siguiente = new Intent(this, DiagMultiplicacion.class);
                    startActivity(siguiente);
                } else if (ddiv.equals("2")) {
                    Intent siguiente = new Intent(this, DiagDividir.class);
                    startActivity(siguiente);
                }
            }
        }
    }
}
