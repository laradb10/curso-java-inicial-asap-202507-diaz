package ASAPDemy_clase5;
import java.util.List;
import java.util.ArrayList;
public class Categoria {
    private String nombre;
    private int id;
    private List<Curso> cursos;

    public Categoria(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.cursos = new ArrayList<>();
    }

    public Curso buscarCurso(int idCurso) {
        Curso resultado = null;
        int pos = 0;

        while (pos < this.cursos.size() && resultado == null) {
            Curso c = this.cursos.get(pos);
            if (c.tieneElMismoId(idCurso)) {
                resultado = c;
            }
            pos++;
        }

        return resultado;
    }

    public void agregarCurso(Curso curso) {
        this.cursos.add(curso);
    }
}
