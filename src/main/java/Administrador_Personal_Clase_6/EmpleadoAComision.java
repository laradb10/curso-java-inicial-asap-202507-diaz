package Administrador_Personal_Clase_6;

public class EmpleadoAComision extends Empleado {

    private int clientesCaptados;
    private double montoPorCliente;
    private static final double SALARIO_MINIMO = 20000;

    public EmpleadoAComision(String dni, String nombre, String apellido, int anioIngreso, int clientesCaptados, double montoPorCliente) {
        super(dni, nombre, apellido, anioIngreso);
        this.clientesCaptados = clientesCaptados;
        this.montoPorCliente = montoPorCliente;
    }

    public int getClientesCaptados() {
        return clientesCaptados;
    }

    @Override
    public double calcularSalario() {
        double salario = clientesCaptados * montoPorCliente;
        if (salario < SALARIO_MINIMO) {
            return SALARIO_MINIMO;
        } else {
            return salario;
        }
    }
}
