package Administrador_Personal_Clase_6;

public abstract class Empleado {

    private String dni;
    private String nombre;
    private String apellido;
    private int anioIngreso;

    public Empleado(String dni, String nombre, String apellido, int anioIngreso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioIngreso = anioIngreso;
    }

    public int getAntiguedad(int anioActual) {
        return anioActual - anioIngreso;
    }

    public abstract double calcularSalario();

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return getNombre() + " " + getApellido();
    }

}
