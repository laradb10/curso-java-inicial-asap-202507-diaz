package Licencias_Clase7;

public class Moto extends Vehiculo{

    private final boolean tieneTodosLosEspejos;

    public Moto(String patente, String marca, int cilindrada, boolean todosLosEspejos) {
        super(patente, marca, cilindrada);
        this.tieneTodosLosEspejos = todosLosEspejos;
    }
}
