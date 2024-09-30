/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_22_califas;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_22_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int calif;
        Scanner cap = new Scanner (System.in);
        System.out.println("Capture la calificación: ");
        calif = cap.nextInt();
       if ((calif >= 90) && (calif < 101) ){
            System.out.println("A"); 
        }else if ((calif >= 80) && (calif < 90)){
            System.out.println("B"); 
        }else if((calif >= 70) && (calif < 80)){
            System.out.println("C"); 
        }else if((calif >= 60) && (calif < 70)){
            System.out.println("D"); 
        }else if(calif <= 59){
            System.out.println("F"); 
        }
        else{// opcional
            System.out.println("Número no válido"); 
        }
    }
    
}
