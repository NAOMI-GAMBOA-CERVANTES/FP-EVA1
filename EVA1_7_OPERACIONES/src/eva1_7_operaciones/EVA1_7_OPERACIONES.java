/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_7_operaciones;

/**
 *
 * @author invitado
 */
public class EVA1_7_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //OPERACIONES ARITMÉTICAS
        int x = 10; //declaración y asignación
        int y = 5;
        //declaracion de múltiples variblas 
        //mismo tipo
        int suma, resta, divi, multi, pot, raiz;
        //SUMA Y RESTA
        suma = x + y; //operador de suma +
        System.out.println("Suma de x + y");
        System.out.println(suma);

        resta = x - y; //operador de diferencia;
        System.out.println("Resta de x - y");
        System.out.println(resta);
        
        multi = x * y; //operador de multiplicaciÓn;
        System.out.println("Multiplicación de x * y");
        System.out.println(multi);
        //DIVISIÓN ------> EL MANEJO DE TIPOS DE DATOS
        //Si se dividen enteros, java da como resultado un entero
        divi = x / y; //operador de divi;
        System.out.println("División de x(10) / y(5)");
        System.out.println(divi);
        x = 11;
        y = 3;
        divi = x / y; //operador de divi;
        System.out.println("División de x(11)/ y(3)");
        System.out.println(divi);
        
        double val1 = 11;
        double val2 = 3;
        double diviD;
        diviD = val1 / val2;
        System.out.println("División entre # decimales");
        System.out.println(diviD);
    }
    
}
