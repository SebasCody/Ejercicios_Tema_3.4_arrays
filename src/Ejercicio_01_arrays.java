/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sebastian.peralta
 */
public class Ejercicio_01_arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Forma 1 de declarar un array
        String[] animales = {"perro", "gato", "conejo", "pollo", "león"};

        //Forma 2 de declarar un array
//        String []animales2=new String[5];
//        animales2[0]="perro";
//        animales2[1]="gato";
//        animales2[2]="conejo";
//        animales2[3]="pollo";
//        animales2[4]="leon";
        System.out.println(animales[0]);
        System.out.println(animales[1]);
        System.out.println(animales[2]);
        System.out.println(animales[3]);
        System.out.println(animales[4]);
        //System.out.println(animales[5]);
        System.out.println("\n");

        for (int i = 0; i < animales.length; i++) {

            System.out.println(animales[i]);
        }
        System.out.println("\n");

        //PARTE 2
        int[] numeros = {2, 4, 6, 8, 10};

        for (int i = numeros.length - 1; i >= 0; i--) {

            System.out.println(numeros[i]);
        }
    }

}
