package Ejercicio_Integrador;
import com.github.sanchezih.util.Fecha;

public abstract class MedioDePago {
    private Fecha fecha;

    public MedioDePago(Fecha fecha) {
        this.fecha = fecha;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public abstract double pagar(double monto, Fecha fechaCompra);

}
