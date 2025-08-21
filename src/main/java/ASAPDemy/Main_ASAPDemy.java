package ASAPDemy;

public class Main_ASAPDemy {
    public static void main(String[] args) {
        // Crear la plataforma
        ASAPDemy plataforma = new ASAPDemy();

        // Crear Usuarios
        Usuario autor = new Usuario("Lara", "lara@mail.com", 1, false);
        Usuario alumno = new Usuario("Ramiro", "ramiro@mail.com", 2, false);

        plataforma.agregarUsuario(autor);
        plataforma.agregarUsuario(alumno);

        // Crear Curso y Categoría
        Curso cursoJava = new Curso("Java Inicial", 101, 1500f, autor);
        Categoria categoriaProgramacion = new Categoria("Programación", 10);
        categoriaProgramacion.agregarCurso(cursoJava);
        plataforma.agregarCategoria(categoriaProgramacion);

        // CASO 1: Alumno se suscribe al curso (debe devolver SUSCRIPTO_OK)
        Resultado res1 = plataforma.suscribirseACurso(2, 101);
        System.out.println("Caso 1 - Alumno se suscribe: " + res1.getMensaje());

        // CASO 2: Alumno vuelve a intentar suscribirse (debe devolver YA_SUSCRIPTO)
        Resultado res2 = plataforma.suscribirseACurso(2, 101);
        System.out.println("Caso 2 - Alumno ya suscripto: " + res2.getMensaje());

        // CASO 3: Autor intenta suscribirse a su curso (debe devolver ES_AUTOR)
        Resultado res3 = plataforma.suscribirseACurso(1, 101);
        System.out.println("Caso 3 - Autor intenta suscribirse: " + res3.getMensaje());

        // CASO 4: Usuario inexistente intenta suscribirse (debe devolver USUARIO_INEX)
        Resultado res4 = plataforma.suscribirseACurso(999, 101);
        System.out.println("Caso 4 - Usuario inexistente: " + res4.getMensaje());

        // CASO 5: Intentar suscribirse a curso inexistente (debe devolver CURSO_INEX)
        Resultado res5 = plataforma.suscribirseACurso(2, 999);
        System.out.println("Caso 5 - Curso inexistente: " + res5.getMensaje());
    }
}
