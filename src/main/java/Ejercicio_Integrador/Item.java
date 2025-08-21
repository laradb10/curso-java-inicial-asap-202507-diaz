package Ejercicio_Integrador;

public class Item {
    private int cantidad;
    private Producto producto;

    public Item(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public double calcularSubtotal() {
        return this.cantidad * this.producto.getPrecio();
    }
}
