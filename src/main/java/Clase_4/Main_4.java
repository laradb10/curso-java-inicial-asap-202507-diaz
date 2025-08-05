package Clase_4;

import java.util.Random;
import java.util.Scanner;

public class Main_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero del ejercicio que quiere realizar: ");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                int numero = 0;
                do {
                System.out.println("Ingrese un numero: ");
                numero = scanner.nextInt();
                if (numero <= 0) {
                    System.out.println("Numero no valido, intente nuevamente.");
                }
            } while (numero <= 0);
                esPrimo(numero);
                break;
            case 2:
                int[] arrayNum = new int[8];
                Random numRandom = new Random();
                for (int i = 0; i < arrayNum.length; i++){
                    arrayNum[i] = numRandom.nextInt(10) + 1;
                }
                break;

        }
    }

//    Ejercicio01
//    Programa que pide el ingreso de un numero e indica si es un numero primo o no.

    public static void esPrimo (int num){
        boolean primo = true;
        for (int i = 2; i < num;  i++){
            if (num % i == 0){
                primo = false;
            }
        }
        if (primo == false){
            System.out.println("El numero ingresado NO es primo.");
        }
        else{
            System.out.println("El numero ingresado es primo.");
        }
    }

//    Ejercicio02
//    Programa que genera un array de 8 enteros aleatorios entre 1 y 10, lo ordena utilizando el
//    algoritmo de ordenamiento de burbuja y lo muestra.

public static void mostrarArray(int[] array){
        for (int i = 0; i< array.length; i++){
            System.out.println("" + array[i]);
        }
}

public static void ordenamientoBurbuja (int[] array){

}

}
