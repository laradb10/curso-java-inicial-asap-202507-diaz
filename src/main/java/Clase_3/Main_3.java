package Clase_3;

import java.util.Scanner;

public class Main_3 {

    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero del ejercicio que quiere realizar: ");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                int n = 0;
                do{
                    System.out.println("Ingrese un numero entero.");
                    n = scanner.nextInt();
                    if (n <= 0){
                        System.out.println("No se aceptan numeros negativos o ceros. Por favor, intente nuevamente");
                    }
                } while (n <= 0);
                calcularAlturas(n);
                break;
            case 2:
                
                break;
            case 3:
                break;
            default:
                System.out.println("Error.");
        }

    }

    //Ejercicio01
    //Escribir un programa que lea la altura de N personas y calcule:
    //La altura media.
    //Cuantas personas tienen una altura superior a la media.
    //Cuantas tienen una altura inferior a la media.
    //El valor de N se pide por teclado y debe ser entero positivo.

public static void calcularAlturas (int num){
        float[] arrayPersonas = new float[num];
    System.out.println("Usted ha ingresado " + num + " personas. Por favor, comience a agregar sus alturas");
    for (int i = 0; i < num; i++){
        System.out.println("Ingrese la altura de la persona numero " + (i+1) + " en METROS. Ejemplo: 1,50");
        Scanner scannerFL = new Scanner(System.in);
        float altura = scannerFL.nextFloat();
        arrayPersonas[i]=altura;
    }
    int n = 0;
    do {
        System.out.println("Elija la opcion deseada: ");
        System.out.println("1. Calcular altura media.");
        System.out.println("2. Calcular cuantas personas tienen una altura superior a la media.");
        System.out.println("3. Calcular cuantas personas tienen una altura inferior a la media.");
        System.out.println("0. Salir.");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        switch(n){
            case 1:
                float media = calcularMedia(arrayPersonas);
                System.out.println("La altura media es " + media);
                break;
            case 2:
                superiorMedia(arrayPersonas);
                break;
            case 3:
                inferiorMedia(arrayPersonas);
                break;
            default:
                System.out.println("Error.");
        }
    } while (n > 0);
}

public static float calcularMedia (float[] array){
        float suma = 0;
        float media = 0;
        for(int i = 0; i < array.length; i ++){
            suma = suma + array[i];
        }
        media = suma / array.length;

        return media;
}

public static void superiorMedia (float[] array){
        float media = calcularMedia(array);
        int cont = 0;
        for(int i = 0; i < array.length; i ++){
            if (array[i] > media) {
                System.out.println("La persona " + (i + 1) + " tiene una altura superior a la media");
                cont++;
            }
    }
    System.out.println("En total, " + cont + " personas tienen una altura superior a la media.");
}

public static void inferiorMedia (float[] array){
    float media = calcularMedia(array);
    int cont = 0;
    for(int i = 0; i < array.length; i ++){
        if (array[i] < media) {
            System.out.println("La persona " + (i + 1) + " tiene una altura inferior a la media");
            cont++;
        }
    }
    System.out.println("En total, " + cont + " personas tienen una altura inferior a la media.");
}

}
