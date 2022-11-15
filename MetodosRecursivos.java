package tema4.MetodosRecursivos;
import java.util.Scanner;

/**
 *
 * @author Cristian Bernal Méndez
 */
public class MetodosRecursivos {
    /**
     * Subir una clase con los siguietes métodos recursivos:
     *
     * Suma desde n hasta 1: (n+(n-1)+(n-2)+......+1
     * Potencia (como sucesión de
     * multiplicaciones).
     * @param args 
     */
    public static void main(String[] args) {
        int sumatorio = sumaN();
        int potencia = potenciaN();
        System.out.println("Sumatorio: "+sumatorio);
        System.out.println("Potencia: "+potencia);
    }
    /**
     * Método suma desde n hasta 1.
     * @return sum
     */
    public static int sumaN(){
        Scanner tec = new Scanner(System.in);
        System.out.println("Sumatorio de n\nIntroduce un número para calcular su sumatorio:");
        int n = tec.nextInt();
        int sum = 0;
        for (int i= 0; i < n; i++){
            sum += n;
            n -= 1;
        }
        return sum;
    }
    /**
     * Método potencia.
     * @return pot
     */
    public static int potenciaN(){
        Scanner tec = new Scanner(System.in);
        System.out.println("Potencia de n\nIntroduce un número como base:");
        int a = tec.nextInt();
        System.out.println("Introduce un número como exponente:");
        int n = tec.nextInt();
        int pot = 1;
        for (int i= 0; i < n; i++){
            pot = pot * a;
        }
        return pot;
    }
}
