package org.example.domain;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
public class Paciente implements Serializable {
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
    private String direccion;
    private String telefono;


    // Constructor
    public Paciente(String nombre, String apellido, int edad, String genero, String direccion, String telefono) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
        this.telefono = telefono;

    }


    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    @Override
    public String toString() {
        return nombre + " " + apellido + " (" + edad + " años) - " + telefono;
    }
}
