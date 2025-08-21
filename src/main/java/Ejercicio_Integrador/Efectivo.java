package Ejercicio_Integrador;

import com.github.sanchezih.util.Fecha;

public class Efectivo extends MedioDePago{
    private boolean esConsumidorFinal;
    private static final double NO_ES_CONSUMIDOR_FINAL = 0.10;
    private static final double ES_CONSUMIDOR_FINAL = 0.15;

    public Efectivo(Fecha fecha, boolean esConsumidorFinal) {
        super(fecha);
        this.esConsumidorFinal = esConsumidorFinal;
    }

    public boolean isEsConsumidorFinal() {
        return esConsumidorFinal;
    }

    @Override
    public double pagar(double monto, Fecha fechaCompra) {
        double montoFinal = monto;
        if (esConsumidorFinal) {
            montoFinal = montoFinal - (ES_CONSUMIDOR_FINAL * montoFinal);
        } else {
            montoFinal = montoFinal - (NO_ES_CONSUMIDOR_FINAL * montoFinal);
        }
        return montoFinal;
    }
}
