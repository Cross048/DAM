/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2;

/**
 *
 * @author Cristian Bernal Mendez
 */
public class Ejercicio2_6 {
    /**
     * Escribe un programa para calcular el área y el volumen de un cilindro.
     * Para ello declara una constante que guarda el valor de PI.
     * @param args
     */
    public static void main(String[] args) {
        double PI = 3.1416;
        double diametro = 15.5;
        double altura = 42.5;
        
        double area = 2*PI*(diametro/2)*((diametro/2)+altura);
        double volumen = PI*((diametro/2)*(diametro/2))*altura;
        
        System.out.println ("Area: "+area+"\nVolumen: "+volumen);
    }
}
