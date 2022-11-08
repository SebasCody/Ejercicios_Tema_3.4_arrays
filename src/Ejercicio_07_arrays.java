
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Sebas_work
 */
public class Ejercicio_07_arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // TODO code application logic here
//        Scanner entrada = new Scanner(System.in);
//
//        // Introducir una frase por teclado (con sus espacios en blanco)
//        // y contar el número de palabras que tiene y mostrar cada una 
//        // de las palabras. 
//        //DEFINICION DE VARIABLES 
//        String fraseVariable;
//        String[] palabrasArray;
//        int contadorPalabras;
//
//        System.out.println("***FRASE POR TECLADO***");
//        System.out.println("Introduce una frase con espacios incluidos:");
//        fraseVariable = entrada.nextLine();
//        palabrasArray = fraseVariable.split(" ");
//
//        contadorPalabras = 0; //Inicio a 0 el contador de palabras
//        for (int i = 0; i < palabrasArray.length; i++) {
//            System.out.println("Palabra nº" + i + ": " + palabrasArray[i]); //Muestro las palabras
//            contadorPalabras++; //Cuento las palabras
//        }
//
//        System.out.printf("Número total de palabras: %d\n", contadorPalabras);

        //************************************************************************************************
        //Introducir una fecha por teclado en formato dd/mm/aaaa
        //y obtener separadamente el dia, el mes y el año.
        //DEFINICION DE VARIABLES
        Scanner entrada = new Scanner(System.in);
        String fecha;
        String[] dateArray;

        System.out.println("***FECHA POR TECLADO***");
        System.out.println("Introduce una FECHA con FORMATO dd/mm/aaaa:");
        fecha = entrada.nextLine();
        dateArray = fecha.split("/");

        System.out.println("Día: " + dateArray[0]);
        System.out.println("Mes: " + dateArray[1]);
        System.out.println("Año: " + dateArray[2]);
    }

}
