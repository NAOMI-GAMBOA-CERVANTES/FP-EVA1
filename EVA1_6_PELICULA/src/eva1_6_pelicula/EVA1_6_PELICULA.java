/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_6_pelicula;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_6_PELICULA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DECLARAMOS VARIABLES
        String nombre;
        String genero;
        int duracion;
        String reparto;
        String clasificacion;
        Scanner captu;//Declaramos la herramienta, previamente el import
        //Variable "captu" u otro nombre
        //Add import for java.util.Scanner
        captu = new Scanner(System.in);//creamos la herramienta
        
        //HAY QUE INDICAR QUE INDICARLE AL USUARIO QUE CAPTURAR
        System.out.println("Introduce el nombre de la pelicula: ");
        nombre = captu.nextLine();
        System.out.println("Introduce el genero de la pelicula: ");
        genero = captu.nextLine();
        System.out.println("Introduce la duracion: ");
        duracion = captu.nextInt();//nextInt = Entero
        captu.nextLine();
        System.out.println("Introduce el reparto: ");
        reparto = captu.nextLine(); 
        
        System.out.println("DATOS CAPTURADOS-----------------");
        System.out.println(nombre);
        System.out.println(genero);
        System.out.println(duracion);
        System.out.println(reparto);
    }
    
}
