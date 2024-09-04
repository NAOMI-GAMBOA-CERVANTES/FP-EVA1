/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_9_conversiones;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_9_CONVERSIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double far, centi, kel;
        Scanner captu = new Scanner(System.in);
        System.out.println("Temperatura en grados fahrenheit: ");
        far = captu.nextDouble();
        centi = (far - 32) / 1.8;//Agregar paréntesis para 
        //jerarquía de operaciones
        System.out.println("°C = " + centi);
        //Ahora convertir de grados centígrados a farenheit
        System.out.println("Temperatura en grados centígrados: ");
        centi = captu.nextDouble();
        far = (centi * 1.8) + 32;
        System.out.println("°F = " + far);
         //Convertir de grados centígrados a kelvin
        System.out.println("Temperatura en grados centígrados: ");
        centi = captu.nextDouble();
        kel = centi +  273.15;
        System.out.println("°K = " + kel);
    }
    
}
