/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_16_operador_or;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_16_OPERADOR_OR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int km, meses;
        Scanner cap = new Scanner(System.in);
        System.out.println("¿Cuántos kilometraje tiene el vehículo?: ");
        km = cap.nextInt();
        cap.nextLine();
        System.out.println("¿Cuántos meses tiene el vehículo?: ");
        meses = cap.nextInt();
        cap.nextLine();
        //Con una de las dos comparaciones que se cumpla, el if es verdadero
        if((km >=5000) || (meses >=6)){//agregar parentésis para mayor claridad
            System.out.println("Cambio de aceite ");
        }
        else{
            System.out.println("Vehículo en buenas condiciones");
        }
        
    }
    
}
