package Licencias_Clase7;

public class Circuito implements Evaluable{

    private final int tiempoSegundos;
    private final int faltas;

    public Circuito(int tiempoSegundos, int faltas) {
        this.tiempoSegundos = tiempoSegundos;
        this.faltas = faltas;
    }

    @Override
    public boolean aprobo() {
        boolean resultado = false;
        if (this.faltas <= 2) {
            resultado = true;
        }
        return resultado;
    }

    public int getTiempoSegundos() {
        return tiempoSegundos;
    }
}
