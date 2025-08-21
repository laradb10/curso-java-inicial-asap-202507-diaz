package ejemplo_prototype_para_practicar;

public class Usuario implements Prototipo{
    String nombre;
    int edad;

    Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Constructor copia los valores deñ objeto original
    Usuario(Usuario original) {
        this.nombre = original.nombre;
        this.edad = original.edad;
    }

    @Override
    public Prototipo clonar() {
        return new Usuario(this);
    }
}
