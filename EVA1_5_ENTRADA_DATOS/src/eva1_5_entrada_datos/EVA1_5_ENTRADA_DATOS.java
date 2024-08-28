/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_5_entrada_datos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_5_ENTRADA_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //DECLARAMOS VARIABLES
        String marca;
        String modelo;
        int year;
        double precio;
        //¿Como se captura?
        //SCANNER 
        //Herramienta --> Clase: nos proporcionan muchas herramientas
        Scanner captu;//Declaramos la herramienta, previamente el import
        //Variable "captu" u otro nombre
        //Add import for java.util.Scanner
        captu = new Scanner(System.in);//creamos la herramienta
        
        //HAY QUE INDICAR QUE INDICARLE AL USUARIO QUE CAPTURAR
        System.out.println("Introduce la marca del vehiculo: ");
        marca = captu.nextLine();//Les regresa todo el texto hasta
        //que se presiona la tecla "enter"
        System.out.println("Introduce el modelo del vehiculo: ");
        modelo = captu.nextLine();//nextLine = texto
        System.out.println("Introduce el año: ");
        year = captu.nextInt();//nextInt = Entero
        System.out.println("Introduce el precio: ");
        precio = captu.nextDouble(); //nextDouble = decimales
        
    }
    
}
