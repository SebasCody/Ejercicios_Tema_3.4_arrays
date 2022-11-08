
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author sebastian.peralta
 */
public class Ejercicio_08_arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        String[] alumnos = {"Francisco", "Marcos", "Laura", "Marta", "Pedro"};
        double[] primerTrimestre = {7, 10, 4, 5, 8};
        double[] segundoTrimestre = {8, 10, 6, 6, 7};
        double[] tercerTrimestre = {9, 10, 7, 9, 6};

        double mediaAlumno;

        System.out.println("Listado de alumnos");
        System.out.println("******************");
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("" + (i+1) + ". " + alumnos[i]);

        }

        System.out.println("Dime la posición del alumno a buscar: ");
        int posicion = (Integer.parseInt(entrada.nextLine()))-1;

        mediaAlumno = (primerTrimestre[posicion] + segundoTrimestre[posicion] + tercerTrimestre[posicion]) / 3;
        System.out.println("La nota media de " + alumnos[posicion] + " es " + Math.round(mediaAlumno));
        
        
        System.out.println("\n---Medias del grupo---");
        System.out.println("Media primer trimestre de todo el grupo: " + Math.round((primerTrimestre[0] + primerTrimestre[1] + primerTrimestre[2] + primerTrimestre[3] + primerTrimestre[4])/(primerTrimestre.length)));
        System.out.println("Media segundo trimestre de todo el grupo: " + Math.round((segundoTrimestre[0] + segundoTrimestre[1] + segundoTrimestre[2] + segundoTrimestre[3] + segundoTrimestre[4])/(segundoTrimestre.length)));
        System.out.println("Media tercer trimestre de todo el grupo: " + Math.round((tercerTrimestre[0] + tercerTrimestre[1] + tercerTrimestre[2] + tercerTrimestre[3] + tercerTrimestre[4])/(tercerTrimestre.length)));

    }

}
