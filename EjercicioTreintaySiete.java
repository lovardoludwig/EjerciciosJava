/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotreintaysiete;

import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class EjercicioTreintaySiete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner MiEscaner=new Scanner(System.in);
        Integer contador=0;
        
        while(contador<100)
        {
            contador++;
            if(contador%2==1)
            {
                System.out.println("el numero "+contador+" es impar");
            }
        }

    }
    
}
