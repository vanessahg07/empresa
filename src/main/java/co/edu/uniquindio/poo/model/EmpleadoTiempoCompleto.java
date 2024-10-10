package co.edu.uniquindio.poo.model;

public class EmpleadoTiempoCompleto extends Empleado {
    private double salarioMensual;

    public EmpleadoTiempoCompleto(int salarioMensual, String id, String nombre) {
        super(id, nombre);
        this.salarioMensual = salarioMensual;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    
    @Override
    public double calcularSalario() {
        return salarioMensual;
    }
}
