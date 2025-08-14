package Licencias_Clase7;

public abstract class Examen implements Evaluable{

    private final String fecha;
    private final Persona evaluado;

    public Examen(String fecha, Persona persona) {
        this.fecha = fecha;
        this.evaluado = persona;
    }

}
