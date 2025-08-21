package Ejercicio_Integrador;
import com.github.sanchezih.util.Fecha;

public class TransferenciaBancaria extends MedioDePago{

    private String cbu;
    private static final double RECARGO_BASE = 0.05;
    private static final double RECARGO_ADICIONAL = 0.05;
    private static final int DIAS_PARA_RECARGO_EXTRA = 10;

    public TransferenciaBancaria(Fecha fecha, String cbu) {
        super(fecha);
        this.cbu = cbu;
    }

    @Override
    public double pagar(double monto, Fecha fechaCompra) {
        double montoFinal = monto + (monto * RECARGO_BASE);

        int dias = Fecha.diasTranscurridosEntreFechas(fechaCompra, this.getFecha());
        if (dias > DIAS_PARA_RECARGO_EXTRA) {
            montoFinal = montoFinal + (monto * RECARGO_ADICIONAL);
        }

        return montoFinal;
    }
}
