
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author sebastian.peralta
 */
public class Ejercicio_02_arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[5];

        int num;

        //Bucle para leer los números
        for (int i = 0; i < numeros.length; i++) {
            //Este bucle es para evitar meter notas que no estén entre 10
            System.out.print("Introduce un número: ");
            num = Integer.parseInt(entrada.nextLine());
            numeros[i] = num;
        }

        //Forma 1 para mostrarlos por pantalla:
        System.out.println("ARRAY DE NÚMEROS\n-------------------");
        for (int i = 0; i <= numeros.length - 1; i++) {
            System.out.printf("numeros[%d] %10d\n", i, numeros[i]);

        }//Cierre de for

        for (int i = 0; i < numeros.length; i++) {
            String vector_fila;

            vector_fila = "" + numeros[i];

            if (i == 0) {
                System.out.printf("\nArray --> [" + vector_fila + "");
            }
            if (i == 1 || i == 2 || i == 3) {
                System.out.printf("|" + vector_fila);
            }

            if (i == 4) {
                System.out.printf("|" + vector_fila + "]\n");
            }
        }

        System.out.print("Array --> [");
        for (int i = 0; i < numeros.length - 1; i++) {

            System.out.printf("%d|", numeros[i]);
        }

        System.out.printf("%d]\n", numeros[numeros.length - 1]);

    }//Cierre de args

}//Cierre de public class
