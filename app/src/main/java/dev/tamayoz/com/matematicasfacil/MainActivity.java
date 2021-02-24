package dev.tamayoz.com.matematicasfacil;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import java.util.UUID;

import dev.tamayoz.com.matematicasfacil.Model.AdminSQLiteOpenHelper;
import dev.tamayoz.com.matematicasfacil.Model.Usuario;

public class MainActivity extends AppCompatActivity {

    EditText Nom, Años;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Nom = findViewById(R.id.Nombre_ET);
        Años = findViewById(R.id.Edad_ET);
        // inicializarFirebase();
    }

    public void guardar(View view) {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "Matematicas", null, 1);
        SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();

        if (Nom.getText().toString().equals("") || Años.getText().toString().equals("")) {
            Toast.makeText(this, "No ha ingresado datos", Toast.LENGTH_LONG).show();
        } else {
            String Id = (UUID.randomUUID().toString());
            String Nombre = Nom.getText().toString();
            String Edad = Años.getText().toString();

            ContentValues registro = new ContentValues();
            registro.put("id", Id);
            registro.put("nombre", Nombre);
            registro.put("edad", Edad);

            BaseDeDatos.insert("Usuario", null, registro);
            BaseDeDatos.close();

            Intent siguiente = new Intent(this, Diagnostico.class);
            startActivity(siguiente);

        }
/**
 private void inicializarFirebase() {
 FirebaseApp.initializeApp(this);
 firebaseDatabase = FirebaseDatabase.getInstance();
 databaseReference = firebaseDatabase.getReference();
 }

 public void guardar (View view){
 if (Nom.getText().toString().equals("") || Años.getText().toString().equals("")) {
 Toast.makeText(this, "No ha ingresado datos", Toast.LENGTH_LONG).show();
 } else {
 //firebase
 String Nombre = Nom.getText().toString();
 String Eda = Años.getText().toString();
 Usuario User = new Usuario();
 User.setId(UUID.randomUUID().toString());
 User.setNombre(Nombre);
 User.setEdad(Eda);
 databaseReference.child("Usuario").child(User.getId()).setValue(User);
 Toast.makeText(this, "Agregado", Toast.LENGTH_SHORT).show();
 //firebase
 Intent siguiente = new Intent(this, Diagnostico.class);
 startActivity(siguiente);

 }
 }
 **/

    }
}
