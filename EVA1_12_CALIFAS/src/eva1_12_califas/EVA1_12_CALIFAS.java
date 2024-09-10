/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_12_califas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_12_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DECLARAR VARIABLE PARA LA CALFICACIÓN 
        //EVALUAR SI ACREDITAS (MAYOR O IGUAL A 70)
        //O NO ACREDITAS (NA--> MENOR A 70)
        Scanner captu = new Scanner(System.in);
        double calif;
        
        System.out.println("CAPTURA LA CALIFICACIÓN");
        calif = captu.nextDouble();
        if (calif >= 70){
            System.out.println("ACREDITAS");
        }
        else{
            System.out.println("NA");
        }
        
    }
    
}
