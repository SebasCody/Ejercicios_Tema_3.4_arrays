
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author sebastian.peralta
 */
public class Ejercicio_04_arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        System.out.println("***CREANDO UN VECTOR FILA DE 5 ELEMENTOS");

        int[] vector;
        vector = new int[5];

        //Rellenamos el vector
        for (int i = 0; i < vector.length; i++) {

            System.out.print("Introduce un número: ");
            int num = Integer.parseInt(entrada.nextLine());
            vector[i] = num;
            if (num < 0) {
                break;
            }
        }

        for (int j = 0; j < vector.length; j++) {
            if (vector[j] >= 0) {
                System.out.println(vector[j]);
            } else {
                break;
            }
        }

    }

}
