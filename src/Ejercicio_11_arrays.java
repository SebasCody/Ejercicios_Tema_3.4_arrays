/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sebastian.peralta
 */
public class Ejercicio_11_arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[][] numArrayBi = new int[3][6];
        int filas = 3, columnas = 6;

        numArrayBi[0][0] = 0;
        numArrayBi[0][1] = 30;
        numArrayBi[0][2] = 2;
        numArrayBi[0][5] = 5;

        numArrayBi[1][0] = 75;
        numArrayBi[1][4] = 0;

        numArrayBi[2][2] = -2;
        numArrayBi[2][3] = 9;
        numArrayBi[2][5] = 11;

        for (int i = 0; i < numArrayBi.length; i++) {
            for (int j = 0; j < numArrayBi[i].length; j++) {
                System.out.printf(numArrayBi[i][j] + " ");
            }
            System.out.println("");
        }

    }

}
