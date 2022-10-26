/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.Ejercicio3;
import java.util.Scanner;

/**
 *
 * @author Cristian Bernal Mendez
 */
public class Ejercicio3_1 {
    
    /**
     * Programa que lea 100 números y cuente cuantos de ellos son positivos.
     * @param args 
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        //Pedimos un número.
        System.out.println("Introduce un número y calcularemos si\nsus 100 siguientes si son positivos: ");
        int num = tec.nextInt();
        int cont = 0;
        
        //Comprueba con un for los 100 números siguientes y
        //si es positivo, lo suma a la variable cont.
        for (int i = 0; i<100; i++){
            if (num>=0){ cont++; }
            num++;
        }
        
        //Imprimimos el resultado
         System.out.println("Hay "+cont+" números positivos.");
    }
    
}
