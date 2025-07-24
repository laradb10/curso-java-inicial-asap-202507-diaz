package Clase_1;

import java.util.Scanner;

public class Main_1 {

    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero del ejercicio que quiere realizar: ");
        int num = scanner.nextInt();
        switch (num){
            case 1:
                System.out.println("Ingrese un numero entero: ");
                int numero = scanner.nextInt();
                esMultiplo(numero);
                break;
            case 2:
                System.out.println("Ingrese su fecha de nacimiento: Dia");
                int dia = scanner.nextInt();
                System.out.println("Mes:");
                int mes = scanner.nextInt();
                System.out.println("Anio -- Formato XXXX");
                int anio = scanner.nextInt();
                calculadoraDeLaSuerte(dia, mes, anio);
                break;
            case 3:
                System.out.println("Ingrese su calificacion:");
                int calificacion = scanner.nextInt();
                calificacionAlfabetica(calificacion);
                break;
            case 4:
                System.out.println("Ingrese el anio a verificar:");
                int anioAVerificar = scanner.nextInt();
                esBisiesto(anioAVerificar);
                break;
            default:
                System.out.println("Error.");
        }


    }

//Ejercicio 1
    //Escribir un programa que lea 1 numero entero por teclado e indique si es multiplo de 2 o de 3.

    public static void esMultiplo (int num){
        if(num % 2 == 0 && num % 3 == 0){
            System.out.println("" + num + " es multiplo de 2 y de 3");
        }
        else if (num % 2 == 0 ){
            System.out.println("" + num + " es multiplo de 2");
        }
        else if (num % 3 == 0){
            System.out.println("" + num + " es multiplo de 3");
        }
        else{
            System.out.println("" + num + " no es multiplo de 2 o de 3");
        }
    }

//Ejercicio02
//Escribir un programa que pida por teclado la fecha de nacimiento de una persona (dia, mes, anio) y calcule su numero de la suerte.
//El numero de la suerte se calcula sumando el dia, mes y anio de la fecha de nacimiento y a continuacion sumando las cifras obtenidas en la suma.
//Por ejemplo: Si la fecha de nacimiento es 12/07/1980 Calculamos el numero de la suerte asi: 12+7+1980 = 1999 1+9+9+9 = 28
//Numero de la suerte: 28

    public static void calculadoraDeLaSuerte (int dia, int mes, int anio){
        int suma = dia + mes + anio;
        String sumaStr = String.valueOf(suma);
        int suerte = 0;
        for(int i = 0; i < sumaStr.length(); i++){
            int digito = Character.getNumericValue(sumaStr.charAt(i));
            suerte = suerte + digito;
        }
        System.out.println("Su numero de la suerte es: " + suerte);
    }

//Ejercicio03
//Escribir un programa lea por teclado una calificacion numerica entre 0 y 10 y muestre por pantalla su correspondiente calificacion alfabetica.
//La equivalencia entre la calificacion numerica y la alfabetica se muestra en esta tabla:
//0 <= nota < 5 Insuficiente
//5 <= nota < 6 Suficiente
//6 <= nota < 7 Bien
//7 <= nota < 9 Notable
//9 <= nota <= 10 Sobresaliente
//La calificacion numerica que se introduce por teclado debe estar comprendida entre 0 y 10 para poder obtener su equivalente calificacion
//alfabetica. Si la calificacion introducida no es valida se muestra un mensaje indicandolo y el programa finaliza.

    public static void calificacionAlfabetica (int calificacion){
        if(calificacion >= 0 && calificacion <= 10){
            if(calificacion >= 0 && calificacion < 5){
                System.out.println("Insuficiente.");
            }
            else if (calificacion == 5){
                System.out.println("Suficiente.");
            }
            else if (calificacion == 6){
                System.out.println("Bien.");
            }
            else if (calificacion >= 7 && calificacion < 9){
                System.out.println("Notable.");
            }
            else if (calificacion >= 9 && calificacion <= 10){
                System.out.println("Sobresaliente.");
            }
        }
        else{
            System.out.println("Esa calificacion no es valida.");
        }
    }

//Ejercicio04
//Escribir un programa que compruebe si un anio es bisiesto. Un anio es bisiesto si es divisible por 4 y no lo es por 100 o si es divisible por 400.

    public static void esBisiesto (int anio){
        if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0){
            System.out.println("El anio " + anio + " es bisiesto.");
        }
        else{
            System.out.println("El anio " + anio + " NO es bisiesto.");
        }
    }
}

