
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sebastian.peralta
 */
public class Ejercicio_09_arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        String nombres [] = new String[5];
        int edades [] = new int[5];
        
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Introduce nombre: ");
            String name = entrada.nextLine();
            nombres[i]=name;
            
            System.out.println("Introduce edad: ");
            int edad = Integer.parseInt(entrada.nextLine());
            edades[i]=edad;
            
            if (name == "*") break;
            
            
        }
        
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]+"-----"+edades[i]);
        }
        
        //defino una variable para almacenar el mayor y otra para el menor
        
        int mayor=0;
        int menor=0;
        int contadorMayor=-1;
        int contadorMenor=0;
        
        for (int j = 0; j < nombres.length; j++) {
            
            if ((edades[j])>=(mayor)){
                mayor = edades[j];
                contadorMayor++;
            }
            
            if (edades[j]<edades[j+1]){
                menor = edades[j];
                contadorMenor++;
            }
        }
        
        System.out.println(nombres[contadorMayor]+" es el mayor");
        System.out.println(nombres[contadorMenor]+" es el menor");
    }
    
}
