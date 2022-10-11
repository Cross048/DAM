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
public class Ejercicio3_1 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Introduce tu nombre: ");
        String nombre = tec.nextLine();
        
        System.out.println("Introduce tus apellidos: ");
        String apellidos = tec.nextLine();
        
        System.out.println("Introduce tu fecha de nacimiento: ");
        String nacimiento = tec.nextLine();
        
        System.out.println(nombre+" "+apellidos+", "+nacimiento);
    }
}
