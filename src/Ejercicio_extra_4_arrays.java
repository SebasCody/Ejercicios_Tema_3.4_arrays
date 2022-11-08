/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Sebas_work
 */
public class Ejercicio_extra_4_arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //DEFINIMOS LOS ARRAYS QUE VAMOS A USAR
        int[] lista1 = {1, 4, 6, 8, 9};
        int[] lista2 = {1, 4, 6, 8, 9};
        //boolean comparador = false;
        int contador_de_comparador = 0;
        //DEBEMOS TENER EN CUENTA QUE DENTRO DENTRO DE UN ARRAY LOS NÚMEROS NO SE PUEDEN REPETIR

        for (int i = 0; i < lista1.length; i++) {
            int numero_lista1 = lista1[i]; //GUARDAMOS EL NÚMERO i DEL ARRAY EN UNA VARIABLE TEMPORAL PARA LUEGO COMPARARLO

            for (int j = 0; j < lista2.length; j++) {
                int numero_lista2 = lista2[j]; //GUARDAMOS EL NÚMERO j DEL SEGUNDO ARRAY PARA COMPARARLO

                if (numero_lista1 == numero_lista2) {
                    //comparador = true;
                    contador_de_comparador++;

                }

            }

        }

        if (contador_de_comparador == lista1.length) {
            System.out.println("Los dos arrays son iguales");

        } else {
            System.out.println("Los dos arrays no son iguales");
        }

    }

}
