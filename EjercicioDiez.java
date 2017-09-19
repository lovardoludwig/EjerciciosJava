/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodiez;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioDiez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String DatoAux;
     Double Ganadores;
     Double Premio;
     Double PremioCU;
     Scanner MiEscaner = new Scanner(System.in);
     
     System.out.println("Ingrese el importe del premio:");
     DatoAux = MiEscaner.next();
     Premio = Double.parseDouble(DatoAux);
     
     System.out.println("Ingrese la cantidad de ganadores:");
     DatoAux = MiEscaner.next();
     Ganadores = Double.parseDouble(DatoAux);
     
     PremioCU= Premio / Ganadores;
        System.out.println("Ingrese el importe por ganador:" +PremioCU);
    }
    
}
