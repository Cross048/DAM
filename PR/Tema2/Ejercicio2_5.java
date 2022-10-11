/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2;

/**
 *
 * @author Cristian Bernal Mendez
 */
public class Ejercicio2_5 {
    /**
     * Dadas las siguientes expresiones aritméticas,
     * calcula cuál es el resultado de evaluarlas.
     * @param args
     */
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        double uno = -a+5%b-a*a;
        double dos = 5+3%7*b*a-b%a;
        double tres = (a+1)*(b+1)-b/a;
        double cuatro = a*(a+b)/b;
        
        System.out.println ("a- "+uno+"\nb- "+dos+"\nc- "+tres+"\nd-"+cuatro);
    }
}
