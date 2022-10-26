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
public class Ejercicio2_4 {
    
    /**
     * Programa que lee un número entero del 0 al 9 y
     * lo devuelva escrito en letras
     * @param args 
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        //Pedimos un número.
        System.out.println("Introduce numero entero del 0 al 9: ");
        int num = tec.nextInt();
        
        //Creamos la array con 10 letras.
        String [] letras = {"a","b","c","d","e","f","g","h","i","j"};
        
        //Devolvemos el valor equivalente en el array.
        System.out.println(letras[num]);
    }
}
