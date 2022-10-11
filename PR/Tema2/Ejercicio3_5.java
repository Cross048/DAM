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
public class Ejercicio3_5 {
    /**
     * Escribe un programa que defina dos variables enteras
     * para describir las longitudes de los lados de un rectángulo.
     * El programa debe pedir el valor de cada lado y a continuación
     * escribir en la pantalla las longitudes de los lados y calcular
     * y escribir el perímetro y el área del rectángulo.
     * @param args 
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Lado 1 del rectangulo:");
        int lado1 = tec.nextInt();
        System.out.println("Lado 2 del rectangulo");
        int lado2 = tec.nextInt();
        
        int perimetro = 2*lado1+2*lado2;
        int area = lado1*lado2;
        
        System.out.println("Lados del rectangulo: "+lado1+"cm y "+lado2+"cm");
        System.out.println("Perimetro: "+perimetro+"cm");
        System.out.println("Area: "+area+"cm^2");
    }
}
