package Licencias_Clase7;

import java.util.ArrayList;
import java.util.List;

public class SedeDeLicencias {

    private final List<Examen> examenes;

    public SedeDeLicencias() {
        this.examenes = new ArrayList<>();
    }

    public void addExamen(Examen examen) {
        this.examenes.add(examen);
    }

    public double porcentajeDeReprobados (){
        int total = examenes.size();
        int reprobados = 0;
        double porcentaje = 0;
        if(total > 0) {
            for (int i = 0; i < examenes.size(); i++) {
                if (!examenes.get(i).aprobo()) {
                    reprobados++;
                }
            }
            porcentaje = (reprobados * 100.0) / total;
            return porcentaje;
        }
        else {
            System.out.println("Lista vacia");
            return 0.0;
        }
    }

    public double promedioTiempoAutosAprobados(){
        double tiempo = 0;
        int total = 0;
        for(int i = 0; i< examenes.size(); i++){
            if (examenes.get(i) instanceof ExamenDeAuto){
                ExamenDeAuto examenAuto = (ExamenDeAuto) examenes.get(i);
                if (examenAuto.aprobo()){
                    total++;
                    tiempo += examenAuto.getTiempoCircuito();
                }
            }
        }

        double promedio = tiempo/total;
        return promedio;
    }

    public Informe obtenerInforme (){
        double porcentaje = porcentajeDeReprobados();
        double promedio = promedioTiempoAutosAprobados();
        return new Informe(porcentaje, promedio);
    }

}
