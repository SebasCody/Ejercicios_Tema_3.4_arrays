
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author sebastian.peralta
 */
public class Ejercicio_extra_1_arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);

        int par = 0;
        int[] lista;
        lista = new int[5];

        for (int i = 0; i < lista.length; i++) {

            System.out.println("Introduce un número: ");
            int num = Integer.parseInt(entrada.nextLine());
            lista[i] = num;

            //comprobar paridad
            double esPar_resto = num % 2; //para ser par la división de resto debe ser 0 (resto == 0)

            if (esPar_resto == 0) {
                par = par + 1;

            }

        }

        if (par == 5) {
            System.out.println("Todos son pares");
        } else {
            System.out.println("No todos son pares");
        }
    }

}
