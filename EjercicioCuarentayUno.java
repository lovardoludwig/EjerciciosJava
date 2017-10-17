/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocuarentayuno;

import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class EjercicioCuarentayUno {

    /**
     * @param args the command line arguments
     * pedir un numero e informar todos los antecesores hasta el 0
     */
    public static void main(String[] args) {
        Scanner MiEscanner = new Scanner(System.in);
        Integer numero;
        Integer restador=1;
        String aux;
        
        System.out.println("ingrese un numero:");
        aux = MiEscanner.next();
        numero = Integer.parseInt(aux);
        while(numero>0)
        {
            numero=numero-restador;
            System.out.println("el antecesor es: "+numero);
        }
        
        
        
    }
    
}
