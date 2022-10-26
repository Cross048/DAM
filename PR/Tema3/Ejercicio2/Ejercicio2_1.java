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
public class Ejercicio2_1 {
    
    /**
     * Realizar el problema 2 de la actividad de condicionales (calculadora)
     * utilizando la estructura condicional múltiple
     * @param args 
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        //Pedimos los numeros a operar
        System.out.println("Introduce un numero:");
        double num1 = tec.nextDouble();
        System.out.println("Introduce otro numero:");
        double num2 = tec.nextDouble();
        double res = 0; //Creamos variable 0 que sera el resultado
        
        //Dejamos al usuario elegir la operacion con un pequeño menu
        System.out.println("¿Que operacion desea realizar?:\n1. Suma\n2. Resta\n3. Multiplicacion\n4. Division");
        int op = tec.nextInt();
        
        //Segun la opcion, se realizara la operacion
        if (op==1){
            res = num1+num2; //Suma
        } else {
            if (op==2){
                res = num1-num2; //Resta
            } else {
                if (op==3){
                    res = num1*num2; //Multiplicacion
                } else{
                    if (op==4){
                        res = num1/num2; // Division
                    } else{
                        //En caso de error, anunciara el fallo y cerrara el programa
                        System.out.println("ERROR"); 
                        System.exit(0);
                    }
                }
            }
        }
        
        //Imprime resultado
        System.out.println("Resultado: "+res);
    }
}
