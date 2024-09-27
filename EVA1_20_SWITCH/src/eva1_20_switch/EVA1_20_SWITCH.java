/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_20_switch;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_20_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia;
        Scanner cap = new Scanner (System.in);
        System.out.println("Número correspondiente al día (1-7):");
        dia = cap.nextInt();
        switch(dia){
            case 1:
                System.out.println("Lunes"); 
                break;//última instrucción - FIN DEL CASO
            case 2:
                System.out.println("Martes"); 
                break;//última instrucción - FIN DEL CASO
            case 3:
                System.out.println("Miércoles"); 
                break;//última instrucción - FIN DEL CASO
            case 4:
                System.out.println("Jueves"); 
                break;//última instrucción - FIN DEL CASO
            case 5:
                System.out.println("Viernes"); 
                break;//última instrucción - FIN DEL CASO
            case 6:
                System.out.println("Sábado"); 
                break;//última instrucción - FIN DEL CASO
            case 7:
                System.out.println("Domingo"); 
                break;//última instrucción - FIN DEL CASO
            default: //OPCIONAL, SIN BREAK, ÚLTIMA SECCIÓN DEL SWITCH
                System.out.println("Número no válido, debe ser entre 1-7"); 
        }
    }
    
}
