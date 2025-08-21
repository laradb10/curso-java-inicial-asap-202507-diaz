package ejemplo_prototype_para_practicar;

public class Main_Prototype {

    public static void main(String[] args) {
        Prototipo original = new Usuario("Lara", 20);
        Prototipo copia = original.clonar();

        Usuario c = (Usuario) copia;
        System.out.println("Original: " + ((Usuario)original).nombre + ", " + ((Usuario)original).edad);
        System.out.println("Copia: " + c.nombre + ", " + c.edad);
    }

}


