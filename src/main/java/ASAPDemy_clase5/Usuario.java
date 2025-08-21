package ASAPDemy_clase5;

public class Usuario {
    private String nombre;
    private String email;
    private int id;
    private boolean esBecado;


    public Usuario(String nombre, String email, int id, boolean esBecado) {
        this.nombre = nombre;
        this.email = email;
        this.id = id;
        this.esBecado = esBecado;
    }

    public boolean tieneElMismoId(int idUsuario) {
        return this.id == idUsuario;
    }

    public boolean esBecado() {
        return this.esBecado;
    }

    public int getId() {
        return this.id;
    }
}
