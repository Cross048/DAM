/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2;

/**
 *
 * @author Cristian Bernal Mendez
 */
public class Ejercicio2_3 {
    /**
     * Escribe un programa que visualice en pantalla
     * cuánto le costará comprar unas deportivas cuyo precio de catálogo
     * es de 85,00 €, si sabe que puede conseguir una rebaja del 15%.
     * @param args
     */
    public static void main(String[] args) {
        double precio = 85.00;
        int rebaja = 15;
        double preciofinal = precio-((precio*rebaja)/100);
        System.out.println ("Comprar unas deportivas que valen 85€ con un descuento del 15% costaran "+preciofinal+"€.");
    }
}
