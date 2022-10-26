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
public class Ejercicio2_3 {
    
    /**
     * Realiza el ejercicio 12 de la actividad de condicionales
     * (El mes se introduce en letra (“enero”,”febrero”,”marzo”….)
     * @param args 
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        //Introducimos los datos.
        System.out.println("Introduce dia (01 a 31): ");
        int dia = tec.nextInt();
        System.out.println("Introduce mes (01 a 12): ");
        int mes = tec.nextInt();
        System.out.println("Introduce año (1970 a 3000): ");
        int anyo = tec.nextInt();
        
        //Comprueba el año.
        if (anyo>=1970 && anyo<=3000){
            System.out.println("Anyo correcto.");
        } else{ System.out.println("AÑO NO VALIDO."); System.exit(0); }
        
        //Comprueba el mes.
        if (mes>=1 && mes<=12){
            System.out.println("Mes correcto.");
        } else{ System.out.println("MES NO VALIDO."); System.exit(0); }
        
        //Comprueba el día.
        if (dia>=1 && dia<=31){
            if (dia==31 && mes==1){
                System.out.println("Dia correcto.");
            } else{ if (dia==31 && mes==3){
                System.out.println("Dia correcto.");
            } else{ if (dia==31 && mes==5){
                System.out.println("Dia correcto.");
            } else{ if (dia==31 && mes==7){
                System.out.println("Dia correcto.");
            } else{ if (dia==31 && mes==10){
                System.out.println("Dia correcto.");
            } else{ if (dia==31 && mes==12){
                System.out.println("Dia correcto.");
            } else{ if (dia>28 && mes==2){
                System.out.println("DIA NO VALIDO.");
                System.exit(0);
            } else{ System.out.println("Dia correcto."); };
            }}}}}}
        } else { System.out.println("DIA NO VALIDO."); System.exit(0); }
    }
}
