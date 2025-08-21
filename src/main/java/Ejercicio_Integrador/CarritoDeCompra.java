package Ejercicio_Integrador;
import com.github.sanchezih.util.Fecha;
import java.util.List;

public class CarritoDeCompra {
    private String id;
    private List<Item> items;
    private MedioDePago medioDePago;
    private Fecha fecha;

    public CarritoDeCompra(String id, List<Item> items, MedioDePago medioDePago, Fecha fecha) {
        this.id = id;
        this.items = items;
        this.medioDePago = medioDePago;
        this.fecha = fecha;
    }

    public String getId() {
        return id;
    }

    public MedioDePago getMedioDePago() {
        return medioDePago;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public double calcularPrecioFinal() {
        double precioBruto = 0.0;

        for (Item item : items) {
            precioBruto += item.calcularSubtotal();
        }

        double precioFinal = medioDePago.pagar(precioBruto, this);
        return precioFinal;
    }
}
