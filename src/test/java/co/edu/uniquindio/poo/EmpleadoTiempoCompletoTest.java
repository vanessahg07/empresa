package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.model.EmpleadoTiempoCompleto;

public class EmpleadoTiempoCompletoTest {

    @Test
    public void testCalcularSalario(){
        EmpleadoTiempoCompleto empleado = new EmpleadoTiempoCompleto(3000000, "10923433", "Juan");
        assertEquals(3000000, empleado.calcularSalario(), 0.001);
    }

}
