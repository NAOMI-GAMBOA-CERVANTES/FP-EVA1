/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_13_aguila_sol;

/**
 *
 * @author invitado
 */
public class EVA1_13_AGUILA_SOL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // ALEATORIO
        // GENERAR NÚMEROS ALEATORIOS
        
        double valor = Math.random();
        // RANDOM GENERA VALORES >= 0 Y < A 1.
        // ENTRE 0 Y 0.9999999999999
        
        if(valor < 0.5){
            System.out.println("AGUILA");
        }
        else{
            System.out.println("SOL");
        }
    }
    
}
