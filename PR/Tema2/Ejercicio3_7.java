/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2;
import static java.lang.Math.sin;
import static java.lang.Math.tan;
import java.util.Scanner;

/**
 *
 * @author Cristian Bernal Mendez
 */
public class Ejercicio3_7 {
    /**
     * Conociendo un ángulo y la longitud del lado opuesto de
     * un triángulo rectángulo, pedir por teclado el ángulo y
     * el lado opuesto y calcular la hipotensa de las 2 formas
     * para comprobar que dan el mismo resultado.
     * @param args 
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Lado opuesto del triangulo rectangulo:");
        int opuesto = tec.nextInt();
        System.out.println("Angulo del triangulo:");
        int ang = tec.nextInt();
        
        //En un paso:
        double hipo = Math.abs(opuesto/sin(ang));
        System.out.println("Hipotenusa metodo 1: "+hipo+"cm");
        
        //En dos pasos:
        double adyacente = opuesto/tan(ang);
        hipo = Math.sqrt(adyacente*adyacente+opuesto*opuesto);
        System.out.println("Hipotenusa metodo 2: "+hipo+"cm");
    }
}
