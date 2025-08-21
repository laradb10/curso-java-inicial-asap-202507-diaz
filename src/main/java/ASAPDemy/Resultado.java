package ASAPDemy;

public enum Resultado {
    SUSCRIPTO_OK("El usuario se suscribió exitosamente al curso."),
    MAX_BECADOS("El usuario es becado y el curso ya cuenta con el máximo de becados posible."),
    ES_AUTOR("El usuario que intenta suscribirse es el autor del curso."),
    YA_SUSCRIPTO("El usuario ya estaba suscripto en el curso."),
    CURSO_INEX("El curso no existe."),
    USUARIO_INEX("El usuario no existe.");

    private String mensaje;

    private Resultado(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return this.mensaje;
    }
}
