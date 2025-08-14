package Administrador_Personal_Clase_6;
import java.time.LocalDate;

public class EmpleadoSalarioFijo extends Empleado{

    private double sueldoBasico;

    public EmpleadoSalarioFijo(String dni, String nombre, String apellido, int anioIngreso, double sueldoBasico) {
        super(dni, nombre, apellido, anioIngreso);
        this.sueldoBasico = sueldoBasico;
    }

    @Override
    public double calcularSalario() {
        int anioActual = LocalDate.now().getYear();
        int antiguedad = getAntiguedad(anioActual);
        double adicional = 0;

        if (antiguedad >= 2 && antiguedad <= 5) {
            adicional = 0.05;
        } else if (antiguedad >= 6 && antiguedad <= 10) {
            adicional = 0.10;
        } else if (antiguedad > 10) {
            adicional = 0.15;
        }

        return sueldoBasico + (sueldoBasico * adicional);
    }

}

