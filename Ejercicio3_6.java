/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2;
import java.util.Scanner;

/**
 *
 * @author Cristian Bernal Mendez
 */
public class Ejercicio3_6 {
    /**
     * Escribe un programa que solicite al
     * usuario una cantidad en segundos y la convierta a días,
     * horas, minutos y segundos.
     * @param args 
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Introduce segundos a convertir:");
        int seg = tec.nextInt();
        
        int horas = seg/60;
        seg = seg%60;
        int min = horas%60;
        horas = horas/60;
        int dias = horas/24;
        
        System.out.println(dias+" dias, "+horas+" horas, "+min+" minutos y "+seg+" segundos.");
    }
}
