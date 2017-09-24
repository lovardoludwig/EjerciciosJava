/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioveintitres;

import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class EjercicioVeintitres {

    /**
     * @param args the command line arguments
     * Debemos pedir el ancho y el largo de un terreno e informar cuantos metros de alambre necesitamos para dar tres (3) vueltas de alambre
     */
    public static void main(String[] args) {
        Scanner MiEscaner = new Scanner(System.in);
        String DatoAux;
        Double Ancho;
        Double Largo;
        Double Total;
        
        System.out.println("Ingrese el ancho");
        DatoAux = MiEscaner.next();
        Ancho = Double.parseDouble(DatoAux);
        
        System.out.println("Ingrese el largo");
        DatoAux = MiEscaner.next();
        Largo = Double.parseDouble(DatoAux);
        
        Total = (Ancho*2 + Largo*2)*3;
        System.out.println("" + Total);
        
    }
    
}
