/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad1_if;

import java.util.Scanner;

/**
 *
 * @author Atomi
 */
public class Actividad1_If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Introduce un año cualesquiera");
    int año1 = entrada.nextInt();
    int año2 = 0;
    
    if (año1<2021){
        año2 = 2021 - año1;
        System.out.println("Han pasado " + año2 + " años");
        
    } else if (año1>2021){
        año2 = año1 - 2021;
        System.out.println("Aun faltan " +año2+ " años");
    } else{
        System.out.println("Nos encontramo en el mismo año");
    }
    }
    
}
