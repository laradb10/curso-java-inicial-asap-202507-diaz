package Ejercicio_Integrador;

import java.util.ArrayList;
import java.util.List;

public class SitioWeb {

    private List<CarritoDeCompra> carritosVendidos = new ArrayList<>();

    public void agregarCarritoVendido(CarritoDeCompra c) {
        carritosVendidos.add(c);
    }

    public void mostrarPreciosDeCarritosVendidos() {
        if (!carritosVendidos.isEmpty()) {
            for (CarritoDeCompra c : carritosVendidos) {
                System.out.println("\tCarrito " + c.getId() + ": $" + c.calcularPrecioFinal());
            }
        } else {
            System.out.println("No hay carritos en el sitio web.");
        }
    }

    public String idDelCarritoMasCaro() {
        CarritoDeCompra masCaro = null;
        if (!carritosVendidos.isEmpty()) {
            masCaro = carritosVendidos.get(0);
            for (CarritoDeCompra c : carritosVendidos) {
                if (masCaro.calcularPrecioFinal() < c.calcularPrecioFinal()) {
                    masCaro = c;
                }
            }
        } else {
            System.out.println("No hay carritos en el sitio web.");
        }
        return masCaro.getId();
    }

    public double nroCuotasPromedio() {
        int totalCuotas = 0;
        int contador = 0;
        double promedio = 0.0;
        if (!carritosVendidos.isEmpty()) {
            for (CarritoDeCompra c : carritosVendidos) {
                if (c.getMedioDePago() instanceof TarjetaDeCredito) {
                    totalCuotas += ((TarjetaDeCredito) c.getMedioDePago()).getCuotas();
                    contador++;
                }
            }
        } else {
            System.out.println("No hay carritos en el sitio web.");
        }

        promedio = totalCuotas/contador;
        return promedio;
    }
}

