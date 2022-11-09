

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sebastian.peralta
 */
public class Ejercicio_13_arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String[] nombresArray = {"Juan ", "Celia", "Alfre", "Mari", "Pedro"};
        String[] titulosColumna = {"ALUMNOS","1ª EVA", "2ª EVA", "3ª EVA", "MEDIA"};
        double[][] notasTabla = {{5,6,7,0},{4,2,7,0},{6,8,9,0},{10,8,9,0},{4,2,4,0}};
        int [][] notasEntero = new int[notasTabla.length][notasTabla[0].length];
        
        double sumaNotas;
        double media;
        
        
        for (int i = 0; i < titulosColumna.length; i++) {
            System.out.print(titulosColumna[i]+"  ");
        }
        
        
        System.out.println("");
        
        
        for (int i = 0; i < notasTabla.length; i++) {
            
            sumaNotas = 0;
            
            System.out.print(nombresArray[i]+"  ");
            for (int j = 0; j < notasTabla[i].length; j++) {
                
                sumaNotas = sumaNotas + notasTabla[i][j]; //sumo las notas que luego dividiré
                
                media = Math.round (sumaNotas / notasTabla[i].length); //redondeo
                
                notasTabla[i][notasTabla[i].length-1] = media; //inserto la media en la última posición
                
                notasEntero[i][j] = (int)notasTabla[i][j];
                
                System.out.print("    "+notasEntero[i][j]+"   ");
            }
            System.out.println("");
        }
        
        
        
//        int[][] 
//        for (int i = 0; i < notasTabla.length; i++){
//            for (int j = 0; j < notasTabla[i].length; j++) {
//            }             
//        }
    }
    
}
