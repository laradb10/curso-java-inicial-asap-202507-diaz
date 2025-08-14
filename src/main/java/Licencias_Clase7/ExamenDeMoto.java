package Licencias_Clase7;

import java.util.ArrayList;
import java.util.List;

public class ExamenDeMoto extends Examen{

    private static final int LIMITE_CILINDRADA = 150;
    private static final int LIMITE_SEGUNDOS = 120;

    private Moto moto;
    private List<Circuito> circuitos;

    public ExamenDeMoto(String fecha, Persona persona, Moto moto) {
        super(fecha, persona);
        this.moto = moto;
        this.circuitos = new ArrayList<>();
    }

    public void addCircuito(Circuito circuito) {

        this.circuitos.add(circuito);
    }

    @Override
    public boolean aprobo() {
        boolean resultado = false;
        if(moto.getCilindrada() > LIMITE_CILINDRADA){
            resultado = aproboMayorLimiteCilindrada();
        }
        else {
            resultado = aproboMenorLimiteCilindrada();
        }

        return resultado;
    }

    public boolean aproboMayorLimiteCilindrada(){
        boolean resultado = false;
        if (aproboCircuito()){
            resultado = true;
        }
        return resultado;
    }

    public boolean aproboCircuito (){
        boolean resultado = true;
        for (int i = 0; i<circuitos.size(); i++){
            if (!circuitos.get(i).aprobo()){
                resultado = false;
                i = circuitos.size();
            }
        }
        return resultado;
    }

    public int cantCircuitosDesaprobados (){
        int desaprobados = 0;
        for (int i = 0; i<circuitos.size(); i++){
            if (!circuitos.get(i).aprobo()){
                desaprobados ++;
            }
        }
        return desaprobados;
    }

    public int tiempoCircuitos (){
        int tiempo = 0;
        for (int i = 0; i<circuitos.size(); i++){
            tiempo += circuitos.get(i).getTiempoSegundos();
        }

        return tiempo;
    }

    public boolean aproboMenorLimiteCilindrada (){
        boolean resultado = false;
        int desaprobados = cantCircuitosDesaprobados();
        int tiempo = tiempoCircuitos();
        if (desaprobados == 1 && tiempo <= LIMITE_SEGUNDOS){
            resultado = true;
        }

        return resultado;
    }

}
