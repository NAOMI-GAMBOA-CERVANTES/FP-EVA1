/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_15_pantalla_inicio;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_15_PANTALLA_INICIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CONSTANTES
        final String USUARIO = "Admin"; 
        final String PASSWORD = "Admin"; //Final  = bloquea la variable, no se puede
        //cambiar valor
        //final double PI = 3.1416
        
        String usu, pwd;
        Scanner captu = new Scanner(System.in);
        System.out.println("Usuario: ");
        usu = captu.nextLine();
        System.out.println("Password: ");//Ctrl + Shift + abajo = copiar+pegar
        pwd = captu.nextLine();
        //¿CÓMO VALIDAMOS EL ACCESO?
        if (usu.equals(USUARIO) && pwd.equals(PASSWORD)){
        System.out.println("ACCESO CONCEDIDO");
    }
        else{
                System.out.println("ACCESO DENEGADO");
                }
        
        
    }
    
}
