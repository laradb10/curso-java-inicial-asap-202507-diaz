package ASAPDemy_clase5;
import java.util.List;
import java.util.ArrayList;

public class ASAPDemy {
    private List<Usuario> usuarios;
    private List<Categoria> categorias;

    public ASAPDemy(){
        this.usuarios = new ArrayList<>();
        this.categorias = new ArrayList<>();
    }


    public Resultado suscribirseACurso(int idUsuario, int idCurso) {
        Resultado resultado = Resultado.USUARIO_INEX;
        Usuario alumno = buscarUsuarioExistente(idUsuario);
        Curso curso = buscarCurso(idCurso);

        if (alumno != null) {
            if (curso != null) {
                if (curso.revisarAlumno(alumno)) {
                    resultado = Resultado.YA_SUSCRIPTO;
                } else if (curso.getAutor().tieneElMismoId(alumno.getId())) {
                    resultado = Resultado.ES_AUTOR;
                } else {
                    if (alumno.esBecado()) {
                        if (curso.controlBeca()) {
                            curso.agregarAlumno(alumno);
                            resultado = Resultado.SUSCRIPTO_OK;
                        } else {
                            resultado = Resultado.MAX_BECADOS;
                        }
                    } else {
                        curso.agregarAlumno(alumno);
                        resultado = Resultado.SUSCRIPTO_OK;
                    }
                }
            } else {
                resultado = Resultado.CURSO_INEX;
            }
        }

        return resultado;
    }

    private Usuario buscarUsuarioExistente(int idUsuario) {
        Usuario resultado = null;
        int pos = 0;

        while (resultado == null && pos < this.usuarios.size()) {
            Usuario user = this.usuarios.get(pos);
            if (user.tieneElMismoId(idUsuario)) {
                resultado = user;
            }
            pos++;
        }

        return resultado;
    }

    private Curso buscarCurso(int idCurso) {
        Curso resultado = null;
        int pos = 0;

        while (resultado == null && pos < this.categorias.size()) {
            Categoria categoria = this.categorias.get(pos);
            resultado = categoria.buscarCurso(idCurso);
            pos++;
        }

        return resultado;
    }

    public void agregarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public void agregarCategoria(Categoria categoria) {
        this.categorias.add(categoria);
    }

}
