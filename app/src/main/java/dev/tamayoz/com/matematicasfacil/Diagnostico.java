package dev.tamayoz.com.matematicasfacil;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Diagnostico extends AppCompatActivity {
    private TextView valor1, valor2, valor3, valor4, valor5, valor6, valor7, valor8, valor9, valor10, valor11, valor12, valor13, valor14, valor15, valor16;
    String resultado_s1, resultado_s2, resultado_r1, resultado_r2, resultado_m1, resultado_m2, resultado_d1, resultado_d2;
    //Radio buttons aleatorio
    final int botones_radio = 3, botones_radio2 = 3, botones_radio3 = 3, botones_radio4 = 3, botones_radio5 = 3, botones_radio6 = 3, botones_radio7 = 3, botones_radio8 = 3;
    RadioButton[] radioButton, radioButton2, radioButtonresta, radioButtonresta2, radioButtonmulti, radioButtonmulti2, radioButtondiv, radioButtondiv2;
    RadioGroup radioGroup, radioGroup2, radioGroup_resta, radioGroup_resta2, radioGroup_mul, radioGroup_mul2, radioGroupdiv, radioGroupdiv2;
    private Button siguiente_b;
    String sumas = "";
    String restas = "";
    String multis = "";
    String divs = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnostico);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        siguiente_b = findViewById(R.id.siguiente_button);


        //declaracion de los randoms
        //primer grupo de suma
        int num1 = (int) (Math.random() * 10 + 1);
        int num2 = (int) (Math.random() * 10 + 1);
        int aux = (int) (Math.random() * 3 + 1);
        int aux2 = (int) (Math.random() * 2 + 1);
        int prin_resultado = (num1 + num2);
        int resultado2 = prin_resultado + aux;
        int resultado3 = resultado2 + aux2;

        //segundo grupo de suma
        int num1_1 = (int) (Math.random() * 10 + 1);
        int num2_2 = (int) (Math.random() * 10 + 1);
        int aux_1 = (int) (Math.random() * 3 + 1);
        int aux2_2 = (int) (Math.random() * 2 + 1);
        int prin_resultado_1 = (num1_1 + num2_2);
        int resultado2_2 = prin_resultado_1 + aux_1;
        int resultado3_3 = resultado2_2 + aux2_2;

        //primer grupo de suma string
        String num1_st = Integer.toString(num1);
        String num2_st = Integer.toString(num2);
        valor1 = findViewById(R.id.sum1_txt);
        valor1.setText(num1_st);
        valor2 = findViewById(R.id.sum2_txt);
        valor2.setText(num2_st);
        String resultado_st = Integer.toString(prin_resultado);
        resultado_s1 = resultado_st;
        String resultado2_st = Integer.toString(resultado2);
        String resultado3_st = Integer.toString(resultado3);
        String resul[] = {resultado_st, resultado2_st, resultado3_st};

        //segundo grupo de suma string
        String num1_st_2 = Integer.toString(num1_1);
        String num2_st_2 = Integer.toString(num2_2);
        valor3 = findViewById(R.id.sum3_txt);
        valor3.setText(num1_st_2);
        valor4 = findViewById(R.id.sum4_txt);
        valor4.setText(num2_st_2);
        String resultado_st_2 = Integer.toString(prin_resultado_1);
        resultado_s2 = resultado_st_2;
        String resultado2_st_2 = Integer.toString(resultado2_2);
        String resultado3_st_2 = Integer.toString(resultado3_3);
        String resul2[] = {resultado_st_2, resultado2_st_2, resultado3_st_2};

        //inicializacion de los componentes del radio button (primer grupo)
        radioGroup = findViewById(R.id.gul_radio_group);
        radioButton = new RadioButton[botones_radio];
        //creacion de los radio button
        for (int i = 0; i < botones_radio; i++) {
            radioButton[i] = new RadioButton(this);
            //asignar el texto a contener
            radioButton[i].setText(resul[i]);
            //cambiar tamaño de los radio button
            radioButton[i].setTextSize(18);
        }
        for (int i = 0; i < 3; i++) {
            int swap_ind1 = ((int) (Math.random() * 10) % botones_radio);
            int swap_ind2 = ((int) (Math.random() * 10) % botones_radio);
            RadioButton temp = radioButton[swap_ind1];
            radioButton[swap_ind1] = radioButton[swap_ind2];
            radioButton[swap_ind2] = temp;
        }
        //agregar los radiobutton al radio group
        for (int i = 0; i < botones_radio; i++) {
            radioGroup.addView(radioButton[i]);
        }
        /////////////// validacion check


        //inicializacion de los componentes del radio button (segundo grupo)
        radioGroup2 = findViewById(R.id.gul_radio_group2);
        radioButton2 = new RadioButton[botones_radio2];
        //creacion de los radio button
        for (int i = 0; i < botones_radio2; i++) {
            radioButton2[i] = new RadioButton(this);
            //asignar el texto a contener
            radioButton2[i].setText(resul2[i]);
            //cambiar tamaño de los radio button
            radioButton2[i].setTextSize(18);
        }
        for (int i = 0; i < 3; i++) {
            int swap_ind1 = ((int) (Math.random() * 10) % botones_radio2);
            int swap_ind2 = ((int) (Math.random() * 10) % botones_radio2);
            RadioButton temp = radioButton2[swap_ind1];
            radioButton2[swap_ind1] = radioButton2[swap_ind2];
            radioButton2[swap_ind2] = temp;
        }
        //agregar los radiobutton al radio group
        for (int i = 0; i < botones_radio2; i++) {
            radioGroup2.addView(radioButton2[i]);
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//******************************************************************************************************************************************
        ///Resta 1
        int resta_1 = (int) (Math.random() * 10 + 1);
        int resta_2 = (int) (Math.random() * 5 + 1);
        int aux_res = (int) (Math.random() * 3 + 1);
        int aux2_res = (int) (Math.random() * 2 + 1);
        int resul_prin_res = (resta_1 - resta_2);
        int resul2_resta = resul_prin_res + aux_res;
        int resul3_resta = resul2_resta - aux2_res;

        String r1_text = Integer.toString(resta_1);
        String r2_text = Integer.toString(resta_2);
        valor5 = findViewById(R.id.resta1_txt);
        valor5.setText(r1_text);
        valor6 = findViewById(R.id.resta2_txt);
        valor6.setText(r2_text);
        String resu_prin_st = Integer.toString(resul_prin_res);
        resultado_r1 = resu_prin_st;
        String resu2_prin_st = Integer.toString(resul2_resta);
        String resu3_prin_st = Integer.toString(resul3_resta);
        String resul3[] = {resu_prin_st, resu2_prin_st, resu3_prin_st};

        radioGroup_resta = findViewById(R.id.gul_radio_group3);
        radioButtonresta = new RadioButton[botones_radio3];
        //creacion de los radio button
        for (int i = 0; i < botones_radio3; i++) {
            radioButtonresta[i] = new RadioButton(this);
            //asignar el texto a contener
            radioButtonresta[i].setText(resul3[i]);
            //cambiar tamaño de los radio button
            radioButtonresta[i].setTextSize(18);
        }
        //asignar aleatoriamente los radiobutton
        for (int i = 0; i < 3; i++) {
            int swap_ind1 = ((int) (Math.random() * 10) % botones_radio3);
            int swap_ind2 = ((int) (Math.random() * 10) % botones_radio3);
            RadioButton temp = radioButtonresta[swap_ind1];
            radioButtonresta[swap_ind1] = radioButtonresta[swap_ind2];
            radioButtonresta[swap_ind2] = temp;
        }
        //agregar los radiobutton al radio group
        for (int i = 0; i < botones_radio3; i++) {
            radioGroup_resta.addView(radioButtonresta[i]);
        }

        ///Resta 2
        int resta1_2 = (int) (Math.random() * 10 + 1);
        int resta2_2 = (int) (Math.random() * 5 + 1);
        int aux_res2 = (int) (Math.random() * 3 + 1);
        int aux2_res2 = (int) (Math.random() * 2 + 1);
        int resul_prin_res2 = (resta1_2 - resta2_2);
        int resul2_resta2 = resul_prin_res2 + aux_res2;
        int resul3_resta2 = resul2_resta2 - aux2_res2;

        String r1_text2 = Integer.toString(resta1_2);
        String r2_text2 = Integer.toString(resta2_2);
        valor7 = findViewById(R.id.resta3_txt);
        valor7.setText(r1_text2);
        valor8 = findViewById(R.id.resta4_txt);
        valor8.setText(r2_text2);
        String resu_prin_st2 = Integer.toString(resul_prin_res2);
        resultado_r2 = resu_prin_st2;
        String resu2_prin_st2 = Integer.toString(resul2_resta2);
        String resu3_prin_st2 = Integer.toString(resul3_resta2);
        String resul4[] = {resu_prin_st2, resu2_prin_st2, resu3_prin_st2};

        radioGroup_resta2 = findViewById(R.id.gul_radio_group4);
        radioButtonresta2 = new RadioButton[botones_radio4];
        //creacion de los radio button
        for (int i = 0; i < botones_radio4; i++) {
            radioButtonresta2[i] = new RadioButton(this);
            //asignar el texto a contener
            radioButtonresta2[i].setText(resul4[i]);
            //cambiar tamaño de los radio button
            radioButtonresta2[i].setTextSize(18);
        }
        //asignar aleatoriamente los radiobutton
        for (int i = 0; i < 3; i++) {
            int swap_ind1 = ((int) (Math.random() * 10) % botones_radio4);
            int swap_ind2 = ((int) (Math.random() * 10) % botones_radio4);
            RadioButton temp = radioButtonresta2[swap_ind1];
            radioButtonresta2[swap_ind1] = radioButtonresta2[swap_ind2];
            radioButtonresta2[swap_ind2] = temp;
        }
        //agregar los radiobutton al radio group
        for (int i = 0; i < botones_radio4; i++) {
            radioGroup_resta2.addView(radioButtonresta2[i]);
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//******************************************************************************************************************************************
        ///Multiplicacion 1
        int multi1 = (int) (Math.random() * 10 + 1);
        int multi2 = (int) (Math.random() * 10 + 1);
        int aux_multi = (int) (Math.random() * 3 + 1);
        int aux2_multi = (int) (Math.random() * 2 + 1);
        int resul_prin_multi = (multi1 * multi2);
        int resul2_multi = resul_prin_multi * aux_multi;
        int resul3_multi = resul2_multi * aux2_multi;

        String m1_text = Integer.toString(multi1);
        String m2_text = Integer.toString(multi2);
        valor9 = findViewById(R.id.mult1_txt);
        valor9.setText(m1_text);
        valor10 = findViewById(R.id.mult2_txt);
        valor10.setText(m2_text);
        String rm_prin_st2 = Integer.toString(resul_prin_multi);
        resultado_m1 = rm_prin_st2;
        String rm2_prin_st2 = Integer.toString(resul2_multi);
        String rm3_prin_st2 = Integer.toString(resul3_multi);
        String resul5[] = {rm_prin_st2, rm2_prin_st2, rm3_prin_st2};

        radioGroup_mul = findViewById(R.id.gul_radio_group5);
        radioButtonmulti = new RadioButton[botones_radio5];
        //creacion de los radio button
        for (int i = 0; i < botones_radio5; i++) {
            radioButtonmulti[i] = new RadioButton(this);
            //asignar el texto a contener
            radioButtonmulti[i].setText(resul5[i]);
            //cambiar tamaño de los radio button
            radioButtonmulti[i].setTextSize(18);
        }
        //asignar aleatoriamente los radiobutton
        for (int i = 0; i < 3; i++) {
            int swap_ind1 = ((int) (Math.random() * 10) % botones_radio5);
            int swap_ind2 = ((int) (Math.random() * 10) % botones_radio5);
            RadioButton temp = radioButtonmulti[swap_ind1];
            radioButtonmulti[swap_ind1] = radioButtonmulti[swap_ind2];
            radioButtonmulti[swap_ind2] = temp;
        }
        //agregar los radiobutton al radio group
        for (int i = 0; i < botones_radio5; i++) {
            radioGroup_mul.addView(radioButtonmulti[i]);
        }

        ///Multiplicacion 2
        int multi1_2 = (int) (Math.random() * 10 + 1);
        int multi2_2 = (int) (Math.random() * 10 + 1);
        int aux_multi_2 = (int) (Math.random() * 3 + 1);
        int aux2_multi_2 = (int) (Math.random() * 2 + 1);
        int resul_prin_multi_2 = (multi1_2 * multi2_2);
        int resul2_multi_2 = resul_prin_multi_2 * aux_multi_2;
        int resul3_multi_2 = resul2_multi_2 * aux2_multi_2;

        String m1_text_2 = Integer.toString(multi1_2);
        String m2_text_2 = Integer.toString(multi2_2);
        valor11 = findViewById(R.id.multi_txt2);
        valor11.setText(m1_text_2);
        valor12 = findViewById(R.id.multi2_txt2);
        valor12.setText(m2_text_2);
        String rm_prin_st2_2 = Integer.toString(resul_prin_multi_2);
        resultado_m2 = rm_prin_st2_2;
        String rm2_prin_st2_2 = Integer.toString(resul2_multi_2);
        String rm3_prin_st2_2 = Integer.toString(resul3_multi_2);
        String resul6[] = {rm_prin_st2_2, rm2_prin_st2_2, rm3_prin_st2_2};

        radioGroup_mul2 = (RadioGroup) findViewById(R.id.gul_radio_group6);
        radioButtonmulti2 = new RadioButton[botones_radio6];
        //creacion de los radio button
        for (int i = 0; i < botones_radio6; i++) {
            radioButtonmulti2[i] = new RadioButton(this);
            //asignar el texto a contener
            radioButtonmulti2[i].setText(resul6[i]);
            //cambiar tamaño de los radio button
            radioButtonmulti2[i].setTextSize(18);
        }
        //asignar aleatoriamente los radiobutton
        for (int i = 0; i < 3; i++) {
            int swap_ind1 = ((int) (Math.random() * 10) % botones_radio6);
            int swap_ind2 = ((int) (Math.random() * 10) % botones_radio6);
            RadioButton temp = radioButtonmulti2[swap_ind1];
            radioButtonmulti2[swap_ind1] = radioButtonmulti2[swap_ind2];
            radioButtonmulti2[swap_ind2] = temp;
        }
        //agregar los radiobutton al radio group
        for (int i = 0; i < botones_radio6; i++) {
            radioGroup_mul2.addView(radioButtonmulti2[i]);
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //primer grupo de division
        double d1_num = (int) (Math.random() * 40 + 1);
        double d2_num = (int) (Math.random() * 10 + 1);
        double d1_aux = (int) (Math.random() * 3 + 1);
        double d2_aux = (int) (Math.random() * 2 + 1);
        double d_prin_resultado = (d1_num / d2_num);
        double d2_resultado = d_prin_resultado - d1_aux;
        double d3_resultado = d2_resultado - d2_aux;

        String d_num1_st = Double.toString(d1_num);
        String d_num2_st = Double.toString(d2_num);
        valor13 = (TextView) findViewById(R.id.div1_txt);
        valor13.setText(d_num1_st);
        valor14 = (TextView) findViewById(R.id.div2_txt);
        valor14.setText(d_num2_st);
        String d_resultado_st = Double.toString(d_prin_resultado);
        resultado_d1 = d_resultado_st;
        String d_resultado2_st = Double.toString(d2_resultado);
        String d_resultado3_st = Double.toString(d3_resultado);
        String d_resul[] = {d_resultado_st, d_resultado2_st, d_resultado3_st};

        radioGroupdiv = (RadioGroup) findViewById(R.id.gul_radio_group7);
        radioButtondiv = new RadioButton[botones_radio7];
        //creacion de los radio button
        for (int i = 0; i < botones_radio7; i++) {
            radioButtondiv[i] = new RadioButton(this);
            //asignar el texto a contener
            radioButtondiv[i].setText(d_resul[i]);
            //cambiar tamaño de los radio button
            radioButtondiv[i].setTextSize(18);
        }
        for (int i = 0; i < 3; i++) {
            int swap_ind1 = ((int) (Math.random() * 10) % botones_radio7);
            int swap_ind2 = ((int) (Math.random() * 10) % botones_radio7);
            RadioButton temp = radioButtondiv[swap_ind1];
            radioButtondiv[swap_ind1] = radioButtondiv[swap_ind2];
            radioButtondiv[swap_ind2] = temp;
        }
        //agregar los radiobutton al radio group
        for (int i = 0; i < botones_radio; i++) {
            radioGroupdiv.addView(radioButtondiv[i]);
        }
        ////////////////////////////////////////////////////////////////
        ///Segundo grupo de division
        double d1_num2 = (int) (Math.random() * 20 + 2);
        double d2_num2 = (int) (Math.random() * 10 + 1);


        double d1_aux2 = (int) (Math.random() * 3 + 1);
        double d2_aux2 = (int) (Math.random() * 2 + 1);
        double d_prin_resultado2 = (d1_num2 / d2_num2);
        double d2_resultado2 = d_prin_resultado2 + d1_aux2;
        double d3_resultado2 = d2_resultado2 + d2_aux2;

        String d_num1_st2 = Double.toString(d1_num2);
        String d_num2_st2 = Double.toString(d2_num2);
        valor15 = findViewById(R.id.div1_txt2);
        valor15.setText(d_num1_st2);
        valor16 = findViewById(R.id.div2_txt2);
        valor16.setText(d_num2_st2);
        String d_resultado_st2 = Double.toString(d_prin_resultado2);
        resultado_d2 = d_resultado_st2;
        String d_resultado2_st2 = Double.toString(d2_resultado2);
        String d_resultado3_st2 = Double.toString(d3_resultado2);
        String d_resul2[] = {d_resultado_st2, d_resultado2_st2, d_resultado3_st2};

        radioGroupdiv2 = findViewById(R.id.gul_radio_group8);
        radioButtondiv2 = new RadioButton[botones_radio7];
        //creacion de los radio button
        for (int i = 0; i < botones_radio7; i++) {
            radioButtondiv2[i] = new RadioButton(this);
            //asignar el texto a contener
            radioButtondiv2[i].setText(d_resul2[i]);
            //cambiar tamaño de los radio button
            radioButtondiv2[i].setTextSize(18);
        }
        for (int i = 0; i < 3; i++) {
            int swap_ind1 = ((int) (Math.random() * 10) % botones_radio7);
            int swap_ind2 = ((int) (Math.random() * 10) % botones_radio7);
            RadioButton temp = radioButtondiv2[swap_ind1];
            radioButtondiv2[swap_ind1] = radioButtondiv2[swap_ind2];
            radioButtondiv2[swap_ind2] = temp;
        }
        //agregar los radiobutton al radio group
        for (int i = 0; i < botones_radio2; i++) {
            radioGroupdiv2.addView(radioButtondiv2[i]);
        }

    }
    public void siguiente (View view){
        int cont = 0;
        if (radioGroup.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Debes de contestar todas las operaciones", Toast.LENGTH_LONG).show();
            cont = 0;
        } else {
            cont++;
        }
        if (radioGroup2.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Debes de contestar todas las operaciones", Toast.LENGTH_LONG).show();
            cont = 0;
        } else {
            cont++;
        }
        if (radioGroup_resta.getCheckedRadioButtonId() == -1) {
            cont = 0;
            Toast.makeText(this, "Debes de contestar todas las operaciones", Toast.LENGTH_LONG).show();
        } else {
            cont++;
        }
        if (radioGroup_resta2.getCheckedRadioButtonId() == -1) {
            cont = 0;
            Toast.makeText(this, "Debes de contestar todas las operaciones", Toast.LENGTH_LONG).show();
        } else {
            cont++;
        }
        if (radioGroup_mul.getCheckedRadioButtonId() == -1) {
            cont = 0;
            Toast.makeText(this, "Debes de contestar todas las operaciones", Toast.LENGTH_LONG).show();
        } else {
            cont++;
        }
        if (radioGroup_mul2.getCheckedRadioButtonId() == -1) {
            cont = 0;
            Toast.makeText(this, "Debes de contestar todas las operaciones", Toast.LENGTH_LONG).show();
        } else {
            cont++;
        }
        if (radioGroupdiv.getCheckedRadioButtonId() == -1) {
            cont = 0;
            Toast.makeText(this, "Debes de contestar todas las operaciones", Toast.LENGTH_LONG).show();
        } else {
            cont++;
        }
        if (radioGroupdiv2.getCheckedRadioButtonId() == -1) {
            cont = 0;
            Toast.makeText(this, "Debes de contestar todas las operaciones", Toast.LENGTH_LONG).show();
        } else {
            cont++;
        }
        if (cont > 0) {
            int suma = 0;
            int resta = 0;
            int multi = 0;
            int div = 0;
            String sum = "";
            String ret = "";
            String mult = "";
            String divs = "";

            String resultado1;
            try {

                if (radioButton[0].isChecked()) {
                    resultado1 = radioButton[0].getText().toString();
                    if (resultado1.equals(resultado_s1)) {
                        suma++;
                    }
                } else if (radioButton[1].isChecked()) {
                    resultado1 = radioButton[1].getText().toString();
                    if (resultado1.equals(resultado_s1)) {
                        //resultado correcto
                        suma++;
                    }
                } else if (radioButton[2].isChecked()) {
                    resultado1 = radioButton[2].getText().toString();
                    if (resultado1.equals(resultado_s1)) {
                        suma++;
                    }
                }
                //suma 2
                if (radioButton2[0].isChecked()) {
                    resultado1 = radioButton2[0].getText().toString();
                    if (resultado1.equals(resultado_s2)) {
                        suma++;
                    }
                } else if (radioButton2[1].isChecked()) {
                    resultado1 = radioButton2[1].getText().toString();
                    if (resultado1.equals(resultado_s2)) {
                        //resultado correcto
                        suma++;
                    }
                } else if (radioButton2[2].isChecked()) {
                    resultado1 = radioButton2[2].getText().toString();
                    if (resultado1.equals(resultado_s2)) {
                        suma++;
                    }
                }
                //resta
                if (radioButtonresta[0].isChecked()) {
                    resultado1 = radioButtonresta[0].getText().toString();
                    if (resultado1.equals(resultado_r1)) {
                        resta++;
                    }
                } else if (radioButtonresta[1].isChecked()) {
                    resultado1 = radioButtonresta[1].getText().toString();
                    if (resultado1.equals(resultado_r1)) {
                        //resultado correcto
                        resta++;
                    }
                } else if (radioButtonresta[2].isChecked()) {
                    resultado1 = radioButtonresta[2].getText().toString();
                    if (resultado1.equals(resultado_r1)) {
                        resta++;
                    }
                }
                //resta 2
                if (radioButton[0].isChecked()) {
                    resultado1 = radioButton[0].getText().toString();
                    if (resultado1.equals(resultado_s1)) {
                        resta++;
                    }
                } else if (radioButton[1].isChecked()) {
                    resultado1 = radioButton[1].getText().toString();
                    if (resultado1.equals(resultado_s1)) {
                        //resultado correcto
                        resta++;
                    }
                } else if (radioButton[2].isChecked()) {
                    resultado1 = radioButton[2].getText().toString();
                    if (resultado1.equals(resultado_s1)) {
                        resta++;
                    }
                }
                //multiplicacion
                if (radioButtonmulti[0].isChecked()) {
                    resultado1 = radioButtonmulti[0].getText().toString();
                    if (resultado1.equals(resultado_m1)) {
                        multi++;
                    }
                } else if (radioButtonmulti[1].isChecked()) {
                    resultado1 = radioButtonmulti[1].getText().toString();
                    if (resultado1.equals(resultado_m1)) {
                        //resultado correcto
                        multi++;
                    }
                } else if (radioButtonmulti[2].isChecked()) {
                    resultado1 = radioButtonmulti[3].getText().toString();
                    if (resultado1.equals(resultado_m1)) {
                        multi++;
                    }
                }
                //multiplicacion 2
                if (radioButtonmulti2[0].isChecked()) {
                    resultado1 = radioButtonmulti2[0].getText().toString();
                    if (resultado1.equals(resultado_m2)) {
                        multi++;
                    }
                } else if (radioButtonmulti2[1].isChecked()) {
                    resultado1 = radioButtonmulti2[1].getText().toString();
                    if (resultado1.equals(resultado_m2)) {
                        //resultado correcto
                        multi++;
                    }
                } else if (radioButtonmulti2[2].isChecked()) {
                    resultado1 = radioButtonmulti2[2].getText().toString();
                    if (resultado1.equals(resultado_m2)) {
                        multi++;
                    }
                }
                //division
                if (radioButtondiv[0].isChecked()) {
                    resultado1 = radioButtondiv[0].getText().toString();
                    if (resultado1.equals(resultado_d1)) {
                        div++;
                    }
                } else if (radioButtondiv[1].isChecked()) {
                    resultado1 = radioButtondiv[1].getText().toString();
                    if (resultado1.equals(resultado_d1)) {
                        //resultado correcto
                        div++;
                    }
                } else if (radioButtondiv[2].isChecked()) {
                    resultado1 = radioButtondiv[2].getText().toString();
                    if (resultado1.equals(resultado_d1)) {
                        div++;
                    }
                }
                //division
                if (radioButtondiv2[0].isChecked()) {
                    resultado1 = radioButtondiv2[0].getText().toString();
                    if (resultado1.equals(resultado_d2)) {
                        div++;
                    }
                } else if (radioButtondiv2[1].isChecked()) {
                    resultado1 = radioButtondiv2[1].getText().toString();
                    if (resultado1.equals(resultado_d2)) {
                        //resultado correcto
                        div++;
                    }
                } else if (radioButtondiv2[2].isChecked()) {
                    resultado1 = radioButtondiv2[2].getText().toString();
                    if (resultado1.equals(resultado_d2)) {
                        div++;
                    }
                }
                sum = Integer.toString(suma);
                ret = Integer.toString(resta);
                mult = Integer.toString(multi);
                divs = Integer.toString(div);

                if (suma < 2) {
                    Intent siguiente = new Intent(this, DiagSuma.class);
                    sum = "2";
                    ret = "2";
                    mult = "2";
                    divs = "2";
                    siguiente.putExtra("suma", sum);
                    siguiente.putExtra("resta", ret);
                    siguiente.putExtra("multi", mult);
                    siguiente.putExtra("div", divs);
                    startActivity(siguiente);

                } else if (resta < 2) {
                    ret = "2";
                    mult = "2";
                    divs = "2";
                    Intent siguiente = new Intent(this, DiagResta.class);
                    siguiente.putExtra("resta", ret);
                    siguiente.putExtra("multi", mult);
                    siguiente.putExtra("div", divs);
                    startActivity(siguiente);

                } else if (multi < 2) {
                    mult = "2";
                    divs = "2";
                    Intent siguiente = new Intent(this, DiagMultiplicacion.class);
                    siguiente.putExtra("multi", mult);
                    siguiente.putExtra("div", divs);
                    startActivity(siguiente);
                } else if (div < 2) {
                    divs = "2";
                    Intent siguiente = new Intent(this, DiagDividir.class);
                    siguiente.putExtra("div", divs);
                    startActivity(siguiente);
                }

            } catch (Exception e) {

                System.out.println(e);
                //condiciones para pasar al siguiente activity

            }


        }
    }
}
