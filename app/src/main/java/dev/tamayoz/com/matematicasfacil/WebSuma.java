package dev.tamayoz.com.matematicasfacil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebSuma extends AppCompatActivity {
    WebView wv1;
    String drest = "";
    String dmult = "";
    String ddiv = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_suma);
        wv1 = (WebView)findViewById(R.id.web);
        String URL = "https://www.matesfacil.com/interactivos/primaria/sumar/cifras/conllevada/php1.php";
        wv1.setWebViewClient(new WebViewClient());
        wv1.loadUrl(URL);
    }
    public void Regresar(View view){
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
}
