/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sebastian.peralta
 */
public class Ejercicio_05_arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //int []lista1 = {4,3,2,1,0}; //Defino la lista
        //int []lista1={6,5,4,3,2};  //lista que decrece
        //int []lista1={6,7,10,11,15};  //lista que crece
        int[] lista1 = {6, 7, 5, 11, 2};  //lista que crece
        //int []lista1={7,6,6,6,6};  //lista que decrece

        boolean esCreciente = true; //Suponemos que no es creciente
        boolean esDecreciente = true;
        boolean sonIguales = true;

        //Creo el bucle que llegará hasta n-1 del tamaño de la lista
        for (int i = 0; i < lista1.length - 1; i++) {

            //Comparo el elemento i con el elemento i+1.            
            if (lista1[i] > lista1[i + 1]) {
                esCreciente = false;
            }
            if (lista1[i] < lista1[i + 1]) {
                esDecreciente = false;
            }
            if (lista1[i] != lista1[i + 1]) {
                sonIguales = false;
            }
        }

        if (sonIguales == true) {
            System.out.println("Todos los números son iguales");
        } else if (esCreciente) {
            System.out.println("La lista de números es creciente");
        } else if (esDecreciente) {
            System.out.println("La lista de números es decreciente");
        } else {
            System.out.println("El array está desordenado");
        }
    }

}
