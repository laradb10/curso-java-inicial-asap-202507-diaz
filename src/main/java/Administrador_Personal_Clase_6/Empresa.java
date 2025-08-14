package Administrador_Personal_Clase_6;
import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<>();
    }

    public void addEmpleado(Empleado e) {
        empleados.add(e);
    }

    public void mostrarSalarios() {
        for (Empleado e : empleados) {
            System.out.println(e + " - Salario: $" + e.calcularSalario());
        }
    }

    public EmpleadoAComision empleadoConMasClientes() {
        EmpleadoAComision mayor = null;

        for (Empleado e : empleados) {
            if (e instanceof EmpleadoAComision) {
                EmpleadoAComision ecom = (EmpleadoAComision) e;
                if (mayor == null || ecom.getClientesCaptados() > mayor.getClientesCaptados()) {
                    mayor = ecom;
                }
            }
        }
        return mayor;
    }
}

