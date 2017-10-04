/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentaregresiva;

import java.util.Scanner;
import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

/**
 *
 * @author alumno
 */
public class CuentaRegresiva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Integer contador=10;
        
        while(contador>0)
        {
            System.out.println("numero "+contador);
            contador--;
        }*/
        /*Integer contador=0;
        Integer sumador=0;
        Integer cantidad;
        Integer promedio=0;
        cantidad=10;
        
        while(contador<cantidad)
        {
            System.out.println("numero "+contador);
            contador++;
            sumador=sumador+contador;
        }
        promedio=sumador/cantidad;*/
        
        Scanner MiEscaner = new Scanner(System.in);
        String respuesta;
        Integer contador=0;
        Integer sumador=0;
        Integer promedio;
        System.out.println("hay alguien?");
        respuesta=MiEscaner.next();
        
        while(respuesta.equals("si"))
        {
            System.out.println("ingrese su edad");
            respuesta=MiEscaner.next();
            contador++;
            sumador=sumador+contador;
            System.out.println("hay alguien mas?");
            respuesta=MiEscaner.next();
        }
        promedio=sumador/contador;
    }
    
}
