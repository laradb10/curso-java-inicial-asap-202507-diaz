package Ejercicio_Integrador;

import com.github.sanchezih.util.Fecha;

public class TarjetaDeCredito extends MedioDePago{
    private int cuotas;
    private final static double AUMENTO_POR_CUOTAS = 0.15;

    public TarjetaDeCredito(Fecha fecha, int cuotas) {
        super(fecha);
        this.cuotas = cuotas;
    }

    public int getCuotas() {
        return cuotas;
    }

    @Override
    public double pagar(double monto, Fecha fechaCompra) {
        double montoFinal = monto;
        if (this.cuotas > 1){
            double aumento = monto * AUMENTO_POR_CUOTAS * this.cuotas;
            montoFinal += aumento;
        }

        return montoFinal;
    }
}
