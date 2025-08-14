package Licencias_Clase7;

public abstract class Vehiculo {

    private final String patente;
    private final String marca;
    private final int cilindrada;

    public Vehiculo(String patente, String marca, int cilindrada) {
        this.patente = patente;
        this.marca = marca;
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }
}
