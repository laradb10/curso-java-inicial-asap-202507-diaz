package Licencias_Clase7;

public class Auto extends Vehiculo{
    private final int puertas;

    public Auto(String patente, String marca, int cilindrada, int puertas) {
        super(patente, marca, cilindrada);
        this.puertas = puertas;
    }
}
