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
public class Ejercicio1_5 {
    /**
     * Escribe un programa que solicite dos números reales
     * y los escriba ordenados de menor a mayor
     * @param args 
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        //Pedimos dos numeros a comparar cual es mayor
        System.out.println("Introduce un numero:");
        int num1 = tec.nextInt();
        System.out.println("Introduce otro numero:");
        int num2 = tec.nextInt();
        
        if (num1>num2){
            System.out.println(num2+" < "+num1); //Si el 1 es mayor
        } else if (num2>num1){
            System.out.println(num1+" < "+num2); //Si el 2 es mayor
        } else{ System.out.println("Son iguales."); } //Si no, son iguales
    }
}
