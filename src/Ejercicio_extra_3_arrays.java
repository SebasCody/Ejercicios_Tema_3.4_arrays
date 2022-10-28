/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sebastian.peralta
 */
public class Ejercicio_extra_3_arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        char []tablaAux = new char[10];
        
        int[] lista1 = {1,2,3,5};
        
        int[] lista2 = {1,9,6,7};
        //int[] lista2 = {1,2,3,5};
        
        boolean sonIguales = true;
        
        //paso1: relleno la tabla auxiliar con los numeros de lista1
        
        for (int i=0; i< lista1.length;i++ ){
            int num = lista1[i];
            tablaAux[num]='x';    
        }
        //imprimo la tabla por gusto
        for (int i = 0; i < tablaAux.length; i++) {
            System.out.println("Posición "+i+":"+tablaAux[i]);
        }
        
        
        
        //paso2: compruebo si los elementos de la lista 2 se ecuentran marcados en la tabla auxiliar;
        
        for (int i = 0; i < lista2.length; i++) {
             int num=lista2[i];
             if (tablaAux[num]!='x'){
                 sonIguales = false;
             }
        }
    }
    
}
