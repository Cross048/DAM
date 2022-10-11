/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2;

/**
 *
 * @author Cristian Bernal Mendez
 */
public class Ejercicio2_2 {
    /**
     * Escriir un programa que declare 2 variables para
     * almacenar las notas de los 2 parciales de la asignatura
     * de programación (pueden tener decimales).
     * @param args
     */
    public static void main(String[] args) {
        //Variables de las notas.
        double parcial1 = 8.2;
        double parcial2 = 6.5;
        double notafinal = (parcial1+parcial2)/2;
        //Imprimir en pantalla.
        System.out.println ("Programacion\nParcial 1 = "+parcial1+"\nParcial 2 = "+parcial2+"\nFinal = "+notafinal);
    }
}
