/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.Ejercicio2;
import java.util.Scanner;

/**
 *
 * @author Cristian Bernal Mendez
 */
public class Ejercicio2_5 {
    
    /**
     * Diseña un algoritmo, que al introducir una calificación entre 0 y 10
     * (consideramos que las notas son valores enteros),
     * nos devuelva la calificación numérica según la tabla.
     * @param args 
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        //
        System.out.println("Introduce calificacion del 0 al 10: ");
        int nota = tec.nextInt();
        if (0<=nota && nota<3){
            System.out.println("MD");
        } else{ if (3<=nota && nota<5){
            System.out.println("INS");
        } else{ if (5<=nota && nota<7){
            System.out.println("BIEN");
        } else{ if (7<=nota && nota<9){
            System.out.println("NOT");
        } else{ if (9<=nota && nota<10){
            System.out.println("SOB");
        } else{ System.out.println("ERROR."); System.exit(0);
        }}}}}
    }
}
