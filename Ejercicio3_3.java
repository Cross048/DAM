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
public class Ejercicio3_3 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Introduce el precio y el descuento.");
        System.out.println("Precio de las deportivas:");
        double precio = tec.nextDouble();
        System.out.println("Descuento a aplicar (en %):");
        double rebaja = tec.nextDouble();
        
        double preciofinal = precio-((precio*rebaja)/100);
        
        System.out.println ("Las deportivas costaran "+preciofinal+"€.");
    }
}
