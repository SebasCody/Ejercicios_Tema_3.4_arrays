
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Sebas_work
 */
public class Ejercicio_07_BIS_arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//      Sabiendo que el nombre de los campos siempre va a ser el mismo
//      (nombre;apellido1;apellido2;email;telefono), 
//      usando la función split, obtén los siguientes elementos:
//      • Nombre completo (es necesario guardarlo en una variable, no solo mostrarlo). 
//      • Nombre de usuario del email (también necesario guardarlo en una variable) 
//      • Telefono (idem a los anteriores).

        String linea = "Alicia;Peralta;Manduca;alicia.peralta@gmail.com;600554433";
        //v---Creo un Array de strings con los campos---v

        String[] camposArray = {"nombre", "apellido1", "apellido2", "email", "telefono"};
        String[] lineaArray = linea.split(";");

        String nombreCompleto = lineaArray[0] + " " + lineaArray[1] + " " + lineaArray[2];
        String email = lineaArray[3];
        String telefono = lineaArray[4];
        String[] usuarioArray = email.split("@");
        String usuario = usuarioArray[0];
        
        
        System.out.println("Nombre completo: " + nombreCompleto);
        System.out.println("Correo electrónico: " + email);
        System.out.println("Teléfono móvil: " + telefono);
        System.out.println("Usuario de correo: "+usuario);

    }

}
