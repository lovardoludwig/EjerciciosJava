/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioveintidos;

import java.util.Scanner;

/**
 *
 * @author Agus
 * 
 */
public class EjercicioVeintidos {

    /**
     * @param args the command line arguments
     * se ingresa una nota, si es 10 mostrar excelente, si esta entre 9 y 4 mostrar aprobó , de lo contrario mostrar “ la próxima será”
     */
    public static void main(String[] args) {
        Scanner MiEscaner = new Scanner(System.in);
        Integer Nota;
        String DatoAux;
        
        System.out.println("Ingrese su nota:");
        DatoAux = MiEscaner.next();
        Nota = Integer.parseInt(DatoAux);
        
        if (Nota.equals(10))
            {
            System.out.println("Excelente"); 
            }else
            if (Nota<10 && Nota>=4)
                    {
                        System.out.println("Aprobó");
                    }else
                if (Nota<4)
                {
                    System.out.println("La proxima será");
                }    
            
            
    }
    
}
