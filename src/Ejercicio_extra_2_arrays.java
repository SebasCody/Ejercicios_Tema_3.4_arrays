
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sebastian.peralta
 */
public class Ejercicio_extra_2_arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Definir dos arrays de enteros en código y decir si son iguales o distintos. 
        //Ejemplo: 1 - 2 -3 - 2 VS 1 - 9 - 5 - 2 
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Define el tamaño de los arrays que vas a usar (n): ");
        int n = Integer.parseInt(entrada.nextLine());
        int []array1; //definimos el tipo de datos que habrá en el array (enteros)
        
        array1 = new int[n]; //asignamos el tamaño n al array
        int []array2 = new int[n]; //en esta linea hemos definido el tipo de array a la vez que le hemos asignado el tamaño
        
        boolean sonIguales=true;
        
        for (int i=0; i<n; i++){
            System.out.println("Introduce un número para array1: ");
            int num = Integer.parseInt(entrada.nextLine());
            array1[i]=num;
            System.out.println("Introduce un número para array2: ");
            int num2 = Integer.parseInt(entrada.nextLine());
            array2[i] = num2;
            
            if (array1[i]!=array2[i]){
                sonIguales=false;
            }
        }
        
        if (sonIguales) System.out.println("Son iguales");
        else System.out.println("No son iguales");
        
        
    }
    
}
