package org.example.domain;
import java.util.ArrayList;

public class Agenda {
    private ArrayList<Cita> citas;

    // Constructor vacío
    public Agenda() {
        citas = new ArrayList<>();
    }

    // Método para agregar una cita
    public void agregarCita(Cita cita) {
        citas.add(cita);
    }

    // Método para obtener todas las citas
    public ArrayList<Cita> getCitas() {
        return citas;
    }

    // Método para mostrar todas las citas
    public void mostrarCitas() {
        for (Cita cita : citas) {
            System.out.println(cita);
        }
    }
}
