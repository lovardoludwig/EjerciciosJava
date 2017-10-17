/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotreintayocho;

import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class EjercicioTreintayOcho {

    /**
     * mostrar la suma de los primeros 100 numeros naturales
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner MiEscaner = new Scanner(System.in);
        Integer contador=0;
        Integer suma=1;
        
        while(contador<101)
        {
            contador++;
            suma=contador+suma;
        }
        System.out.println("la suma es de "+suma);
        
        
    }
    
}
