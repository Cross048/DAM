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
public class Ejercicio3_4 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        System.out.println ("Cantidad a ingresar:");
        double inicio = tec.nextDouble();
        double interes = 2.75/100;
        double hacienda = 18/100;
        double interesanual = inicio*interes;
        double interesmitad = interesanual/2;
        double intereshacienda = interesmitad*hacienda;
        double interesneto = interesmitad-intereshacienda;
        double cantidadfinal = inicio+interesneto;
        System.out.println (" ");
        System.out.println ("Cantidad inicial: "+inicio);
        System.out.println ("Intereses anuales: "+interesanual);
        System.out.println ("Intereses a los 6 meses: "+interesmitad);
        System.out.println ("Retencion Hacienda: "+intereshacienda);
        System.out.println ("Interes neto: "+interesneto);
        System.out.println ("Cantidad final: "+cantidadfinal);
    }
}
