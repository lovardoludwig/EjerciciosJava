/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodiecisiete;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioDiecisiete {

    /**
     * @param args the command line arguments
     * Se ingresa la edad e informar si es niño, adolescente o mayor
     */
    public static void main(String[] args) {
        //Scanner MiEscaner = new Scanner(System.in);
        //Integer Edad;
        //String DatoAux;
        //
        //System.out.println("Ingrese edad:");
        //DatoAux = MiEscaner.next();
        //Edad = Integer.parseInt(DatoAux);
        //
        //if(Edad<=12)
        //{
        //    System.out.println("Es un niño");
        //}
        //if((Edad>12)&& (Edad<18))
        //{
        //    System.out.println("Es un adolescente");
        //}
        //if(Edad>18)
        //{
        //    System.out.println("Es un adulto");
        //}
        System.out.println("hola 17");
        
        Integer Edad;
        //
        //
        Edad=99;
        
        if(Edad>17)
        {
            System.out.println("Es mayor");
        }
        if(Edad<13)
        {
            System.out.println("Es niño");
        }
        if(Edad>12 && Edad<18)
        {
            System.out.println("Es adolescente");
        }
        
    }
    
}
