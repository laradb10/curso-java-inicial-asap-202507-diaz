package Administrador_Personal_Clase_6;

public class Main_6 {

    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        empresa.addEmpleado(new EmpleadoAComision("147", "María", "López", 2022, 10, 2000));
        empresa.addEmpleado(new EmpleadoAComision("123", "Juan", "Pérez", 2020, 15, 1500));
        empresa.addEmpleado(new EmpleadoAComision("456", "Ana", "Gómez", 2018, 5, 3000));
        empresa.addEmpleado(new EmpleadoSalarioFijo("789", "Luis", "Martínez", 2015, 50000));


        System.out.println("Lista de salarios:");
        empresa.mostrarSalarios();

        System.out.println("\nEmpleado con más clientes:");
        System.out.println(empresa.empleadoConMasClientes());
    }
}
