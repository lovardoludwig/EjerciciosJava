/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotrece;

import java.util.Scanner;

/**
 *
 * @author alumno
 * Se ingresa una edad y se informa si es mayor de edad
 */
public class EjercicioTrece {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer Edad;
        String DatoAux; 
        Scanner MiEscaner = new Scanner(System.in);
        
        System.out.println("Ingrese la edad: ");
        DatoAux = MiEscaner.next();
        Edad = Integer.parseInt(DatoAux);
        
        if (Edad>17)
        {
            System.out.println("Es mayor");
        }else
        {
            System.out.println("Es menor");
        }
        
    }
    
}
