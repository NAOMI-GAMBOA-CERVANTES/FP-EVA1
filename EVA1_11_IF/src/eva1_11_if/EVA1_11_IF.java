/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_11_if;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_11_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //LÓGICA BOOLEANA --> OPERACIONES VERDADERO FALSO
        //SOLICITAR LA EDAD EN AÑOS
        int edad;
        Scanner captu = new Scanner (System.in);
        System.out.println("Captura la edad: ");
        edad = captu.nextInt();
        //RESULTADO UN VARDADERO O UN FALSO
        //Si son varias instrucciobes, se agrupan con llaves
        if(edad>=18){
            System.out.println("ES UN ADULTO");
        }
        else{//BLOQUE PARA EL FALSO (OPCIONAL)
            System.out.println("MENOR DE EDAD");
        }
        
    }
    
}
