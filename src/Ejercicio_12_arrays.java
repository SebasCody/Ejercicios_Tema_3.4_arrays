/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sebastian.peralta
 */
public class Ejercicio_12_arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[][] tabla = new int[100][100];
        int sumaFila;
        int sumaColumna;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                int ran = (int) (Math.random() * 10);
                tabla[i][j] = ran;
                System.out.print(tabla[i][j] + "    ");
            }
            System.out.println("");
        }

        System.out.print("\n");
        for (int i = 0; i < 100; i++) {
            sumaFila = 0;
            for (int j = 0; j < 100; j++) {
                sumaFila = sumaFila + tabla[i][j];
            }
            System.out.println("Suma de fila " + i + ": " + sumaFila);
        }

        System.out.print("\n");
        for (int j = 0; j < 100; j++) {
            sumaColumna = 0;
            for (int i = 0; i < 100; i++) {
                sumaColumna = sumaColumna + tabla[i][j];
            }
            System.out.println("Suma de columna " + j + ": " + sumaColumna);
        }

    }
    
    
//Se trata de calcular un valor aproximado de pi, 
//lanzando dardos sobre la diana representada en la figura.
//
//Supongamos que los dardos se reparten uniformemente, entonce la probabilidad 
//de que un dardo caiga en el cuadrante del circulo es:
//
//P = Área del cuadrante/área del cuadrado = (Pi/4)/1 = Pi/4
//
//Si lanzamos N dardos sobre el cuadrado, y sea M el número de dardos que caen 
//en el cuadrante. La frecuencia relativa de caída en el cuadrante M/N, 
//será aproximadamente igual a Pi/4. Por tanto: Pi= 4M/N
//
//Si el número N es suficientemente grande, cabe esperar que 4M/N sea una buena 
//aproximación de Pi.
    
    
int areaCuadranteCirculo;
int areaCuadrado;



}
