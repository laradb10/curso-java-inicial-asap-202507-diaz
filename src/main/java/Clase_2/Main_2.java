package Clase_2;

import java.util.Scanner;

public class Main_2 {

    public static void main (String [] args){
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
                escalaFibonacci(numero);
                break;
            case 2:
                int n1 = 0;
                int n2 = 0;
                do {
                    System.out.println("Ingrese un numero: ");
                    n1 = scanner.nextInt();
                    System.out.println("Ingrese otro numero: ");
                    n2 = scanner.nextInt();
                    if(n1 < 0 || n2 < 0){
                        System.out.println("No se aceptan numeros negativos.");
                    }
                } while (n1 < 0 || n2 < 0);
                sonAmigos(n1, n2);
                break;
            case 3:
                int n = 0;
                do {
                    System.out.println("Ingrese un numero.");
                    n = scanner.nextInt();
                    if (n < 0){
                        System.out.println("No se aceptan numeros negativos.");
                    }
                } while (n < 0);
                sumarCifras(n);
                break;
            default:
                System.out.println("Error.");
        }

        }

    //Ejercicio01
    //Escribir un programa que muestre los N primeros numeros de la serie de Fibonacci. El valor de N se lee por teclado.
    //La serie de fibonacci la forman una serie de numeros tales que: El primer termino de la serie es el numero 1.
    //El segundo termino de la serie es el numero 1. Los siguientes terminos de la serie de fibonacci se obtienen de la suma de los
    //dos anteriores: 1, 1, 2, 3, 5, 8, 13…

    public static void escalaFibonacci (int num){

        int primerNumero = 1;
        int segundoNumero = 1;

        if (num >= 1) {
            System.out.println("" + primerNumero);
        }

        if (num >= 2){
            System.out.println("" + segundoNumero);
        }

        for (int i = 3; i <= num; i++){
            int next = primerNumero + segundoNumero;
            System.out.println("" + next);
            primerNumero = segundoNumero;
            segundoNumero = next;
        }

        // do while para validar ??
    }

    // Escribir un programa que compruebe si dos numeros son amigos. Dos numeros enteros positivos A y B son numeros amigos si la suma
    //de los divisores propios de A es igual a B y la suma de los divisores propios de B es igual a A.
    //Los divisores propios de un número incluyen la unidad pero no el propio numero.
    //Un ejemplo de numeros amigos son los numeros 220 y 284.
    //Los divisores propios de 220 son 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110.
    //La suma de los divisores propios de 220 da como resultado 284
    //Los divisores propios de 284 son 1, 2, 4, 71 y 142.
    //La suma de los divisores propios de 284 da como resultado 220.
    //Por lo tanto 220 y 284 son amigos.

    public static void sonAmigos (int num1, int num2){

            int suma1 = sumaDivisores(num1);
            int suma2 = sumaDivisores(num2);

            if (suma1 == num2 && suma2 == num1){
                System.out.println("" + num1 + " y " + num2 + " Son numeros amigos");
            }
            else
            {
                System.out.println("" + num1 + " y " + num2 + " NO son numeros amigos");
            }

    }

    public static int sumaDivisores (int num){

        int suma = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                suma = suma + i;
            }
        }
        return suma;
    }

    //Ejercicio03
    //Escribir un programa que lea por teclado un numero entero positivo y calcule la suma de sus cifras.
    //Por ejemplo, si se ingresa el numero 3601 el programa debera mostrar: "La suma de sus cifras es: 10".

    public static void sumarCifras (int num){
            if (num == 0 || num == 1 || num == 2 || num == 3 || num == 4 || num == 5 || num == 6 || num == 7 || num == 8 || num == 9){
                System.out.println("Numero de una sola cifra. Cifra: " + num);
            }
            else{
                String numStr = String.valueOf(num);
                int suma = 0;
                for (int i = 0; i < numStr.length(); i++){
                    int digito = Character.getNumericValue(numStr.charAt(i));
                    suma = suma + digito;
                }

                System.out.println("Suma de las cifras del numero " + num +": " + suma);
            }
        }
    }



