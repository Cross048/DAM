/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.Ejercicio2;
import java.util.Scanner;

/**
 *
 * @author Cristian Bernal Mendez
 */
public class Ejercicio2_2 {
    
    /**
     * Realiza el ejercicio 11 de la actividad de condicionales
     * (El día se introduce en letra (“Lunes”,”Martes”….)
     * @param args 
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        //Pedimos al usuario que introduzca un día de la semana.
        System.out.println("Introduce dia de la semana");
        System.out.println("(Todo minusculas y sin tildes): ");
        String dia = tec.nextLine();
        
        //Según el día, nos dirá si es lectivo o festivo.
        if ("lunes".equals(dia)){
            System.out.println("Es dia lectivo."); 
        } else { if ("martes".equals(dia)){
            System.out.println("Es dia lectivo."); 
        } else { if ("miercoles".equals(dia)){
            System.out.println("Es dia lectivo."); 
        } else { if ("jueves".equals(dia)){
            System.out.println("Es dia lectivo."); 
        } else { if ("viernes".equals(dia)){
            System.out.println("Es dia lectivo."); 
        } else { if ("sabado".equals(dia)){
            System.out.println("Es dia festivo."); 
        } else { if ("domingo".equals(dia)){
            System.out.println("Es dia festivo."); }
        }}}}}}
    }
}
