/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2;

/**
 *
 * @author Cristian Bernal Mendez
 */
public class Ejercicio2_4 {
    /**
     * Escribe un programa que visualice en pantalla cuánto le
     * dará su banco después de seis meses si pone 2000€ en una cuenta
     * a plazo fijo al 2,75% anual. Recuerda que al pagarte los intereses
     * el banco le retendrá el 18% para hacienda.
     * @param args
     */
    public static void main(String[] args) {
        int inicio = 2000;
        double interes = 2.75/100;
        double hacienda = 18/100;
        double interesanual = inicio*interes;
        double interesmitad = interes/2;
        double intereshacienda = interesmitad*hacienda;
        double interesneto = interesmitad-intereshacienda;
        double cantidadfinal = inicio+interesneto;
        
        System.out.println ("Cantidad inicial: "+inicio);
        System.out.println ("Intereses anuales: "+interesanual);
        System.out.println ("Intereses a los 6 meses: "+interesmitad);
        System.out.println ("Retencion Hacienda: "+intereshacienda);
        System.out.println ("Interes neto: "+interesneto);
        System.out.println ("Cantidad final: "+cantidadfinal);
    }
}
