/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioveinticinco;

import java.util.Scanner;

/**
 *
 * @author alumno
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
        Integer Alto;
        Integer Ancho;
        Integer Pared;
        Integer CCemento;
        Integer CCal;
        String DatoAux;     
       
        System.out.println("El ancho de la pared es de:");
        DatoAux = MiEscaner.next();
        Ancho = Integer.parseInt(DatoAux);
        
        System.out.println("El alto de la pared es de:");
        DatoAux = MiEscaner.next();
        Alto = Integer.parseInt(DatoAux);
        
        Pared = Alto * Ancho;
        System.out.println("El tamaño de la pared es de:" + Pared);
                
        Cemento = 3;
        Cal = 2;
        CCemento = Pared * Cemento;
        System.out.println("Cantidad de cemento necesaria:" + CCemento);
        CCal = Pared * Cal;
        System.out.println("Cantidad de cal necesaria:" + CCal);
        
        
        
        
    }
    
}
