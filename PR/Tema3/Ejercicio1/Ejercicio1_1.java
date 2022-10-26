/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3.Ejercicio1;
import java.util.Scanner;

/**
 *
 * @author Cristian Bernal Mendez
 */
public class Ejercicio1_1 {

    /**
     * Escribe un programa que solicite la edad de una persona y
     * muestre un mensaje por pantalla indicando si es mayor de edad o no.
     * @param args 
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        //Pedimos la edad.
        System.out.println("Introduce tu edad:");
        int edad = tec.nextInt();
        
        String esMayor = ""; //Creamos la variable esMayor sin definir
        
        //Si es mayor de edad, Si, else, No.
        if (edad>=18){
            esMayor = "Si";
        } else{
            esMayor = "No";
        }
        
        //Imprimimos el resultado
        System.out.println(esMayor+" es mayor de edad.");
    }
    
}
