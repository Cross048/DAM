/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.Ejercicio1;
import java.util.Scanner;

/**
 *
 * @author Cristian Bernal Mendez
 */
public class Ejercicio1_3 {
    
    /**
     * Los trabajadores de una fábrica de automóviles tienen
     * tres turnos: mañana, noche y festivo. Se desea calcular el sueldo
     * semanal a razón de5díasde trabajo por semana.
     * @param args 
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int manana = 600;
        int noche = 800;
        int festivos = 1000;
        
        //Pedimos las horas realizadas cada dia y los dias festivos del trabajador
        System.out.println("Cantidad de horas por la mañana: ");
        int cantman = tec.nextInt();
        System.out.println("Cantidad de horas por la noche: ");
        int cantnoc = tec.nextInt();
        System.out.println("Cantidad de dias festivos: ");
        int cantfes = tec.nextInt();
        
        //Realizamos el calculo del sueldo
        double sueldo = manana*cantman*(5-cantfes)+noche*cantnoc*(5-cantfes)+festivos*cantfes;
        
        //Imprimimos el resultado
        System.out.println("Sueldo de 5 dias de trabajo: "+sueldo);
    }
}
