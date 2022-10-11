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
public class Ejercicio3_2 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        //Variables de las notas.
        System.out.println("Introduce la nota de los parciales.\n(Escribe las comas con un punto . )");
        System.out.println("Parcial 1: ");
        double parcial1 = tec.nextDouble();
        System.out.println("Parcial 2: ");
        double parcial2 = tec.nextDouble();
        
        double notafinal = (parcial1+parcial2)/2;
        
        //Imprimir en pantalla.
        System.out.println ("La nota final es "+notafinal);
    }
}
