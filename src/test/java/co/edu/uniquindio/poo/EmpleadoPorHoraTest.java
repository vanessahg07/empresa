package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.model.EmpleadoPorHora;

public class EmpleadoPorHoraTest {

    @Test
    public void testCalcularSalario() {
        EmpleadoPorHora empleado = new EmpleadoPorHora("109988277", "Susana", 20, 5000);
        assertEquals(100000, empleado.calcularSalario(), 0.001);
    } 

}
