package dev.tamayoz.com.matematicasfacil.Model;

public class Usuario {

    private String id;
    private String Nombre;
    private String Edad;


    public Usuario() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String edad) {
        Edad = edad;
    }

    @Override
    public String toString() {
        return Nombre;
    }
}
