/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotreintaynueve;

import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class EjercicioTreintayNueve {

    /**
     * pedir 10 numeros e informar cuantos pares ingresaron
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner MiEscaner = new Scanner(System.in);
        Integer contador=0;
        Integer contadorPares=0;
        Integer numero;
        String aux;
        
        while(contador<10)
        {
            System.out.println("Ingrese un numero");
            aux = MiEscaner.next();
            numero = Integer.parseInt(aux);
            
            if(numero%2==0)
            {
                contadorPares++;
                System.out.println("la cantidad pares es de: "+ contadorPares);
            }
            contador++;
        }
        
        
        
    }
    
}
