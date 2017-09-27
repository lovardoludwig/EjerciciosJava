/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteracionwhile;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class IteracionWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner MiEscaner = new Scanner(System.in);
        String Clave;
        
        System.out.println("Ingrese clave:");
        Clave = MiEscaner.next();
        
        while(!Clave.equals("1234"))
        {
            System.out.println("Error, reingrese clave");
            Clave = MiEscaner.next();
        }
        System.out.println("Bienvenido");
        
        Integer Contador=0;
        while(Contador<10)
        {
            Contador = Contador + 1;
            System.out.println(Contador+"...Contando");
        }
        System.out.println("Termine");
    }
    
}
