/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.Ejercicio1;
import java.util.Scanner;

/**
 *
 * @author Cristian Bernal Mendez
 */
public class Ejercicio1_4 {
    /**
     * Diseñar un algoritmo que dado el nº de pasos determine
     * la cantidad total a pagar por una llamada telefónica.
     * @param args 
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        //Pedimos nº de pasos y minutos en llamada
        System.out.println("Numero de pasos: ");
        int pasos = tec.nextInt();
        System.out.println("Minutos en llamada: ");
        int min = tec.nextInt();
        float pagar = 0;
        
        if (pasos<=5){
            pagar = (float) (min*0.10); //Toda llamada que sea menor o igual de 5 pasos tiene un coste de 0,10€
        } else if (pasos>5){
            pasos = pasos-5;
            pagar = (float) (min*(0.10+(0.5*pasos))); //Cada paso adicional a partir de los 5 primeros cuesta 0,05 Є
        }
        
        //Imprimir el resultado
        System.out.println("A pagar: "+pagar+" €");
    }
}
