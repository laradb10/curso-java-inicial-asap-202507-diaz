package ASAPDemy;
import java.util.List;
import java.util.ArrayList;
public class Curso {
    private String titulo;
    private int id;
    private float precio;
    private int valoracion;
    private Usuario autor;
    private List<Usuario> suscriptos;
    private List<Leccion> lecciones;
    private int becados;
    private static final int MAX_BECADOS = 5;

    public Curso(String titulo, int id, float precio, Usuario autor) {
        this.titulo = titulo;
        this.id = id;
        this.precio = precio;
        this.valoracion = 0;
        this.autor = autor;
        this.suscriptos = new ArrayList<>();
        this.lecciones = new ArrayList<>();
        this.becados = 0;
    }

    public boolean tieneElMismoId(int idCurso) {
        return this.id == idCurso;
    }

    public boolean revisarAlumno(Usuario usuario) {
        boolean resultado = false;
        int pos = 0;

        while (pos < this.suscriptos.size() && !resultado) {
            if (this.suscriptos.get(pos).tieneElMismoId(usuario.getId())) {
                resultado = true;
            }
            pos++;
        }

        return resultado;
    }

    public boolean controlBeca() {
        return this.becados < MAX_BECADOS;
    }

    public void agregarAlumno(Usuario usuario) {
        this.suscriptos.add(usuario);
        if (usuario.esBecado()){
            this.becados++;}
    }

    public Usuario getAutor() {
        return this.autor;
    }
}
