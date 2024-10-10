package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.model.EmpleadoFreelance;

public class EmpleadoFreelanceTest {

    @Test
    public void testCalcularSalario() {
        EmpleadoFreelance empleado = new EmpleadoFreelance("12399883", "Andres", 8, 100000);
         assertEquals(800000, empleado.calcularSalario(), 0.001);
    }

}
