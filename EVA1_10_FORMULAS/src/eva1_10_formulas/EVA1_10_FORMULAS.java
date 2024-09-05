/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_10_formulas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_10_FORMULAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //FORMULAS DE DISTANCIA
        //DECLARACION DE LAS VARIABLES
         double d, vo, vf, t, a;
         Scanner captu = new Scanner(System.in);
         System.out.println("-CALCULAR DISTANCIA-");
         System.out.println("Velocidad inicial: ");
         vo = captu.nextDouble();
         System.out.println("Aceleración: ");
         a = captu.nextDouble();
         System.out.println("Tiempo: ");
         t = captu.nextDouble();
         System.out.println("---RESULTADO---");
         d = (vo * t) + (a * t * t) / 2;
         System.out.println("d= " + d + " m");
         
         
                
    }
    
}
