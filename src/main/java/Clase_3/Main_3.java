package Clase_3;

import java.util.Scanner;

public class Main_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero del ejercicio que quiere realizar: ");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                int n = 0;
                do {
                    System.out.println("Ingrese un numero entero.");
                    n = scanner.nextInt();
                    if (n <= 0) {
                        System.out.println("No se aceptan numeros negativos o ceros. Por favor, intente nuevamente");
                    }
                } while (n <= 0);
                calcularAlturas(n);
                break;
            case 2:
                int n2 = 0;
                int[] arrayNum = new int[6];
                for (int i = 0; i < arrayNum.length; i++) {
                    System.out.println("Ingrese un numero entero " + (i + 1) + "/6");
                    n2 = scanner.nextInt();
                    arrayNum[i] = n2;
                }
                int s = 0;
                do {
                    System.out.println("Array cargado.");
                    System.out.println("¿Que operacion desea realizar? ");
                    System.out.println("1. Mostrar maximo valor.");
                    System.out.println("2. Mostrar minimo valor.");
                    System.out.println("0. Salir.");
                    Scanner sc = new Scanner(System.in);
                    s = sc.nextInt();
                    switch (s) {
                        case 1:
                            mostrarValorMaximo(arrayNum);
                            break;
                        case 2:
                            mostrarValorMinimo(arrayNum);
                            break;
//                        default:
//                            System.out.println("");
                    }
                }while(s > 0);
                break;
            case 3:
                int n3 = 0;
                int[] arrayN = new int[5];
                for (int i = 0; i < 5; i++) {
                    System.out.println("Ingrese un numero entero " + (i + 1) + "/5");
                    n2 = scanner.nextInt();
                    arrayN[i] = n2;
                }
                esCapicua(arrayN);
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

    public static void calcularAlturas(int num) {
        float[] arrayPersonas = new float[num];
        System.out.println("Usted ha ingresado " + num + " personas. Por favor, comience a agregar sus alturas");
        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese la altura de la persona numero " + (i + 1) + " en METROS. Ejemplo: 1,50");
            Scanner scannerFL = new Scanner(System.in);
            float altura = scannerFL.nextFloat();
            arrayPersonas[i] = altura;
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
            switch (n) {
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
//                default:
//                    System.out.println("Error.");
            }
        } while (n > 0);
    }

    public static float calcularMedia(float[] array) {
        float suma = 0;
        float media = 0;
        for (int i = 0; i < array.length; i++) {
            suma = suma + array[i];
        }
        media = suma / array.length;

        return media;
    }

    public static void superiorMedia(float[] array) {
        float media = calcularMedia(array);
        int cont = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > media) {
                System.out.println("La persona " + (i + 1) + " tiene una altura superior a la media");
                cont++;
            }
        }
        System.out.println("En total, " + cont + " personas tienen una altura superior a la media.");
    }

    public static void inferiorMedia(float[] array) {
        float media = calcularMedia(array);
        int cont = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < media) {
                System.out.println("La persona " + (i + 1) + " tiene una altura inferior a la media");
                cont++;
            }
        }
        System.out.println("En total, " + cont + " personas tienen una altura inferior a la media.");
    }
//    Ejercicio02
//    Escribir un programa que pida 6 numeros por teclado, los almacene en un array y que luego
//    muestre el maximo valor, el minimo y las posiciones que ocupan en el array.

    public static void mostrarValorMaximo(int[] array) {
        int max = array[0];
        int pos = 0;
        for (int i = 0; i < 6; i++) {
            if (max < array[i]) {
                max = array[i];
                pos = i;
            }
        }

        System.out.println("El maximo valor en el array es " + max + " y su posicion en el array es " + pos);
    }

    public static void mostrarValorMinimo(int[] array) {
        int min = array[0];
        int pos = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                pos = i;
            }
        }

        System.out.println("El minimo valor en el array es " + min + " y su posicion en el array es " + pos);
    }

//    Ejercicio03
//    Escribir un programa que pida 5 numeros enteros, los almacene
//    en un array, e indique por pantalla si dicho array es capicua.

    public static void esCapicua (int[] array){
        boolean capicua = true;
        int n = 1;
        for (int i = 0; i < array.length; i++){
            if (array[i] != array[array.length - n]){
                capicua = false;
            }
            n++;
        }

        if (capicua == true){
            System.out.println("El array es capicua.");
        }
        else{
            System.out.println("El array NO es capicua.");
        }
    }

}