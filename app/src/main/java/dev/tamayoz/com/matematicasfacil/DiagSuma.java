package dev.tamayoz.com.matematicasfacil;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.SystemClock;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class DiagSuma extends AppCompatActivity {
    RadioGroup grupo1, grupo2, grupo3, grupo4, grupo5;
    Button compro_b, sig_b;

    RadioButton conca1;
    RadioButton conca2;
    RadioButton conca3;
    RadioButton conca4;
    RadioButton conca5;

    RadioButton correc1;
    RadioButton correc2;
    RadioButton correc3;
    RadioButton correc4;
    RadioButton correc5;

    RadioButton mult1;
    RadioButton mult2;
    RadioButton mult3;
    RadioButton mult4;
    RadioButton mult5;
    String drest = "";
    String dmult = "";
    String ddiv = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diag_suma);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        sig_b = findViewById(R.id.siguiente_sumar);

        conca1 = findViewById(R.id.conca1_txt);
        conca2 = findViewById(R.id.conca2_txt);
        conca3 = findViewById(R.id.conca3_txt);
        conca4 = findViewById(R.id.conca4_txt);
        conca5 = findViewById(R.id.conca5_txt);

        correc1 = findViewById(R.id.correc_txt);
        correc2 = findViewById(R.id.correc2_txt);
        correc3 = findViewById(R.id.correc3_txt);
        correc4 = findViewById(R.id.correc4_txt);
        correc5 = findViewById(R.id.correc_5);

        mult1 = findViewById(R.id.mul_txt);
        mult2 = findViewById(R.id.mul2_txt);
        mult3 = findViewById(R.id.mul3_txt);
        mult4 = findViewById(R.id.mul4_txt);
        mult5 = findViewById(R.id.mul5_txt);


    }

    public void comprobar(View view) {
        grupo1 = findViewById(R.id.grupo1);
        grupo2 = findViewById(R.id.grupo2);
        grupo3 = findViewById(R.id.grupo3);
        grupo4 = findViewById(R.id.grupo4);
        grupo5 = findViewById(R.id.grupo5);
        int cont = 0;
        if (grupo5.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Debes de contestar todas las operaciones", Toast.LENGTH_LONG).show();
            cont = 0;
        } else {
            cont++;
        }
        if (grupo4.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Debes de contestar todas las operaciones", Toast.LENGTH_LONG).show();
            cont = 0;
        } else {
            cont++;
        }
        if (grupo3.getCheckedRadioButtonId() == -1) {
            cont = 0;
            Toast.makeText(this, "Debes de contestar todas las operaciones", Toast.LENGTH_LONG).show();
        } else {
            cont++;
        }
        if (grupo2.getCheckedRadioButtonId() == -1) {
            cont = 0;
            Toast.makeText(this, "Debes de contestar todas las operaciones", Toast.LENGTH_LONG).show();
        } else {
            cont++;
        }
        if (grupo1.getCheckedRadioButtonId() == -1) {
            cont = 0;
            Toast.makeText(this, "Debes de contestar todas las operaciones", Toast.LENGTH_LONG).show();
        } else {
            cont++;
        }
        if (cont != 0) {
            compro_b.setVisibility(View.INVISIBLE);
            sig_b.setVisibility(View.VISIBLE);
        }

    }
    public void siguiente(View view) {
        grupo1 = findViewById(R.id.grupo1);
        grupo2 = findViewById(R.id.grupo2);
        grupo3 = findViewById(R.id.grupo3);
        grupo4 = findViewById(R.id.grupo4);
        grupo5 = findViewById(R.id.grupo5);
        int cont = 0;
        if (grupo5.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Debes de contestar todas las operaciones", Toast.LENGTH_LONG).show();
            cont = 0;
        } else {
            cont++;
        }
        if (grupo4.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Debes de contestar todas las operaciones", Toast.LENGTH_LONG).show();
            cont = 0;
        } else {
            cont++;
        }
        if (grupo3.getCheckedRadioButtonId() == -1) {
            cont = 0;
            Toast.makeText(this, "Debes de contestar todas las operaciones", Toast.LENGTH_LONG).show();
        } else {
            cont++;
        }
        if (grupo2.getCheckedRadioButtonId() == -1) {
            cont = 0;
            Toast.makeText(this, "Debes de contestar todas las operaciones", Toast.LENGTH_LONG).show();
        } else {
            cont++;
        }
        if (grupo1.getCheckedRadioButtonId() == -1) {
            cont = 0;
            Toast.makeText(this, "Debes de contestar todas las operaciones", Toast.LENGTH_LONG).show();
        } else {
            cont++;
        }
        if (cont != 0) {
            // siguiente
            int concate = 0;
            int buena = 0;
            int multipli = 0;

            if (conca1.isChecked()) {
                concate++;
            } else if (correc1.isChecked()) {
                buena++;
            } else if (mult1.isChecked()) {
                multipli++;
            }

            if (conca2.isChecked()) {
                concate++;
            } else if (correc2.isChecked()) {
                buena++;
            } else if (mult2.isChecked()) {
                multipli++;
            }

            if (conca3.isChecked()) {
                concate++;
            } else if (correc3.isChecked()) {
                buena++;
            } else if (mult3.isChecked()) {
                multipli++;
            }

            if (conca4.isChecked()) {
                concate++;
            } else if (correc4.isChecked()) {
                buena++;
            } else if (mult4.isChecked()) {
                multipli++;
            }

            if (conca5.isChecked()) {
                concate++;
            } else if (correc5.isChecked()) {
                buena++;
            } else if (mult5.isChecked()) {
                multipli++;
            }


            if (concate != 0) {
                Intent siguiente = new Intent(this, TeachSuma1.class);
                startActivity(siguiente);
            }
            if (multipli != 0) {
                Intent siguiente = new Intent(this, TeahSuma3.class);
                startActivity(siguiente);
            }
            if (buena == 5){

                AlertDialog.Builder emergente = new AlertDialog.Builder(DiagSuma.this);
                emergente.setMessage("¿Deseas resolver ejercicios como este?")
                        .setCancelable(false)
                        .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                WebSumaM();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
                buena = 6;
            }
            if (buena == 6) {
                //SystemClock.sleep(5000);
                Toast.makeText(this, "¡GENIAL!  Sabes sumar", Toast.LENGTH_LONG).show();
                drest = getIntent().getStringExtra("resta");
                dmult = getIntent().getStringExtra("multi");
                ddiv = getIntent().getStringExtra("div");
                System.out.println(drest);

                if (drest.equals("2")) {
                    Intent siguiente = new Intent(this, DiagResta.class);
                    startActivity(siguiente);
                    System.out.println(drest + "Dato if");

                } else if (dmult.equals("2")) {
                    Intent siguiente = new Intent(this, DiagMultiplicacion.class);
                    startActivity(siguiente);

                } else if (ddiv.equals("2")) {
                    Intent siguiente = new Intent(this, DiagDividir.class);
                    startActivity(siguiente);
                }

            }
            //siguiente
        }
    }
    public void WebSumaM(){
        Intent siguiente = new Intent(this,WebView.class);
        startActivity(siguiente);
    }
}
