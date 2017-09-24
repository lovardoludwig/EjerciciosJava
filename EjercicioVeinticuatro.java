/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioveinticuatro;

import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class EjercicioVeinticuatro {

    /**
     * @param args the command line arguments
     * Debemos pedir el ancho, el largo de un terreno y la cantidad de hilos de alambre e informar cuantos metros de alambre necesitamos para completar las vueltas de alambre.
     */
    public static void main(String[] args) {
        Scanner MiEscaner = new Scanner(System.in);
        String DatoAux;
        Double Ancho;
        Double Largo;
        Double Alambre;
        Double Total;
        
        System.out.println("Ingrese el ancho");
        DatoAux = MiEscaner.next();
        Ancho = Double.parseDouble(DatoAux);
        
        System.out.println("Ingrese el largo");
        DatoAux = MiEscaner.next();
        Largo = Double.parseDouble(DatoAux);
        
        System.out.println("Ingrese la cantidad de alambre");
        DatoAux = MiEscaner.next();
        Alambre = Double.parseDouble(DatoAux);
        
        Total = ((Ancho*2 + Largo*2)*3)-Alambre;
        System.out.println("La cantidad de alambre faltante es de:" + Total);
    }
    
}
