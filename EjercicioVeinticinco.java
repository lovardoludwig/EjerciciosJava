/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioveinticinco;

import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class EjercicioVeinticinco {

    /**
     * @param args the command line arguments
     * Sabiendo que necesito 2 bolsas de cal y 3 de cemento para una pared de 1 metro cuadrado, se pide el alto y ancho y se informa la cantidad de cada material que necesito
     */
    public static void main(String[] args) {
        Scanner MiEscaner = new Scanner(System.in);
        Integer Cal;
        Integer Cemento;
        Double Alto;
        Double Ancho;
        Integer Pared;
        String DatoAux;
        
        System.out.println("El ancho de la pared es de:");
        DatoAux = MiEscaner.next();
        Ancho = Double.parseDouble(DatoAux);
        
        System.out.println("El alto de la pared es de:");
        DatoAux = MiEscaner.next();
        Alto = Double.parseDouble(DatoAux);
        
        DatoAux = MiEscaner.next();
        Pared = Integer.parseInt(DatoAux);
        
        Cemento = 3;
        Cal = 2;
        Pared = Cemento + Cal;
        
        
        
    }
    
}
