/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_17_rango;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_17_RANGO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int calif1;
        Scanner cap = new Scanner (System.in);
        System.out.println("1era calificación: ");
        calif1 = cap.nextInt();
        cap.nextLine();
         if((calif1 >= 0) && (calif1 <= 100)){
            System.out.println("Calificación válida ");
        }
        else{
            System.out.println("Calificación inválida");
            
        }
        
        
    } 
    
}
