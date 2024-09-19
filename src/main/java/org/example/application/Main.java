package org.example.application;

import org.example.application.service.PacienteService;
import org.example.application.service.PacienteServiceImpl;
import org.example.domain.Paciente;
import org.example.infrastructure.repository.PacienteRepositoryImpl;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    private static PacienteService pacienteService = new PacienteServiceImpl(new PacienteRepositoryImpl());
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            JOptionPane.showMessageDialog(null,"1.. Registrar Paciente" + "2. Mostrar Pacientes" + "3. Salir" );
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción: "));
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1 -> registrarPaciente();
                case 2 -> mostrarPacientes();
                case 3 -> JOptionPane.showMessageDialog(null,"Saliendo...");
                default -> JOptionPane.showMessageDialog(null, "Opción inválida");
            }
        } while (opcion != 3);
    }

    private static void registrarPaciente() {
        JOptionPane.showInputDialog("Nombre: ");
        String nombre = scanner.nextLine();
        JOptionPane.showInputDialog("Apellido: ");
        String apellido = scanner.nextLine();
        JOptionPane.showInputDialog("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();  // Limpiar buffer
        JOptionPane.showInputDialog("Género: ");
        String genero = scanner.nextLine();
        JOptionPane.showInputDialog("Dirección: ");
        String direccion = scanner.nextLine();
        JOptionPane.showInputDialog("Teléfono: ");
        String telefono = scanner.nextLine();

        Paciente paciente = new Paciente(nombre, apellido, edad, genero, direccion, telefono);
        pacienteService.registrarPaciente(paciente);
        JOptionPane.showMessageDialog(null, "Paciente registrado correctamente.");
    }

    private static void mostrarPacientes() {
        for (Paciente paciente : pacienteService.listarPacientes()) {
            System.out.println(paciente);
        }
    }
}