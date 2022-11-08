
import java.time.Year;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Sebas_work
 */
public class Ejercicio_06_arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //****************HAY QUE REHACERLO. ESTÁ HORRIBLE. PERO FUNCIONA*************
        Scanner entrada = new Scanner(System.in);

        int dia;
        int mes;
        int year;

        int[] diasMeses = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] nombresMeses = {"", "enero", "febrero", "marzo", "abril", "mayo",
            "junio", "julio", "agosto", "septiembre",
            "octubre", "noviembre", "diciembre"};

        System.out.print("---Dime una fecha---\n");
        System.out.print("Día:");
        dia = Integer.parseInt(entrada.nextLine());

        do {
            System.out.print("Mes: ");
            mes = Integer.parseInt(entrada.nextLine());
            if (mes > 12) {
                System.out.println("Fecha incorrecta. Mes incorrecto.");
                System.out.println("Vueve a meter el mes...");
            }
        } while (mes > 12 || mes < 1);

        System.out.print("Año: ");
        year = Integer.parseInt(entrada.nextLine());

        boolean diaCorrecto = false;
        boolean mesCorrecto = false;
        boolean bisiesto = Year.of(year).isLeap();

        if (bisiesto == true) {
            diasMeses[2] = 29;
        }

        if (1 <= mes || mes <= 12) {
            mesCorrecto = true;

            if (dia <= diasMeses[mes]) {
                diaCorrecto = true;
                System.out.println("El <" + dia + " de " + nombresMeses[mes] + " del "
                        + year + "> es una fecha correcta");
            }
        }

        if (diaCorrecto == false) {
            System.out.println("Fecha incorrecta. Día incorrecto.");
        }

        if (mesCorrecto == false) {
            System.out.println("Fecha incorrecta. Mes incorrecto.");
        }

    }

}
