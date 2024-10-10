package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;

import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.EmpleadoFreelance;
import co.edu.uniquindio.poo.model.EmpleadoPorHora;
import co.edu.uniquindio.poo.model.EmpleadoTiempoCompleto;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Empleado empleado1 = new EmpleadoTiempoCompleto(3000000, "10923433", "Juan");
        Empleado empleado2 = new EmpleadoPorHora("109988277", "Susana", 20, 5000);
        Empleado empleado3 = new EmpleadoFreelance("12399883", "Andres", 8, 100000);

        mostrarSalario(empleado1);
        mostrarSalario(empleado2);
        mostrarSalario(empleado3);
    }

    public static void mostrarSalario(Empleado empleado) {
        String mensaje = "Empleado: "+ empleado.nombre + "\n" + "Identificación: " + empleado.id + "\n" + "Salario: " + empleado.calcularSalario();


            JOptionPane.showMessageDialog(null, mensaje);
    }
}
