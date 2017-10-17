/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocuarenta;

import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class EjercicioCuarenta {

    /**
     * @param args the command line arguments
     * pedir 10 numeros, e ingresar cuantos negativos, positivos y ceros ingresaron
     */
    public static void main(String[] args) {
        Scanner MiEscaner = new Scanner(System.in);
        Integer contador=0;
        Integer numero;
        Integer contadorNegativos=0;
        Integer contadorPositivos=0;
        Integer contadorCeros=0;
        String aux;
        
        while(contador<10)
        {
            System.out.println("Ingrese un numero");
            aux = MiEscaner.next();
            numero = Integer.parseInt(aux);
            
            if(numero==0)
            {
                contadorCeros++;
                System.out.println("cantidad de ceros: "+contadorCeros);
            }
            if(numero>0)
            {
                contadorPositivos++;
                System.out.println("cantidad de positivos: "+contadorPositivos);
            }
            if(numero<0)
            {
                contadorNegativos++;
                System.out.println("cantidad de negativos: "+contadorNegativos);
            }
            contador++;
        }
        
        
    }
    
}
