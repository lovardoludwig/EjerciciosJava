/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotreintayseis;

import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class EjercicioTreintaySeis {

    /**
     * Mostrar todos los numeros pares de 1 a 100
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner MiEscaner=new Scanner(System.in);
        Integer contador=0;
        
        while(contador<100)
        {
            contador++;
            if(contador%2==0)
            {
                System.out.println("el numero "+contador+" es par");
            }
        }
        
        
        
    }
    
}
