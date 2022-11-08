
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author sebastian.peralta
 */
public class Ejercicio_03_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);

        System.out.println("******NOTAS DE CLASE******");

        int[] notas = new int[5];
        int num;
        int suma = 0;

        //Control de errores dentro de la recogida de las notas
        for (int i = 0; i < notas.length; i++) {
            do {
                System.out.println("Introduce la nota nº" + (i + 1) + ":");
                num = Integer.parseInt(entrada.nextLine());

            } while (num < 0 || num > 10);
            notas[i] = num;
        }

        int max = notas[0];
        int min = notas[0];

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < min) {
                min = notas[i];
            }

            if (notas[i] > max) {
                max = notas[i];
            }
            suma = suma + notas[i];

        }

        //Hacemos la media
        double media = (double) suma / notas.length;

        System.out.println("\n\n***RESULTADOS***");
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);

    }

}
