/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteraciones;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Iteraciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Integer Edad=18;
        while(Edad>17)
        {
            System.out.println("hola es mayor");
        }
        while(Edad<17)
        {
            System.out.println("hola es menor");
        }*/
        /*Integer contador=0;
        Scanner MiEscaner = new Scanner(System.in);
        
        while(contador<10)
        {
            System.out.println("hola "+contador);
            contador=contador+1;
        }*/
        /*
        Integer contador=0;
        String aux;
        Integer edad;
        Integer sumador=0;
        Integer promedio;
        Scanner MiEscaner = new Scanner(System.in);
        
        while(contador<3)
        {
            System.out.println("Ingrese la edad de la persona numero "+contador);
            aux=MiEscaner.next();
            edad=Integer.parseInt(aux);
            sumador=sumador+edad;
            contador=contador+1;
        }
        promedio=sumador/3;
        System.out.println("El promedio es: "+promedio);*/
        Integer Opcion;
        Scanner MiEscaner = new Scanner(System.in);
        System.out.println("Que ejercicio queres probar?");
        String Aux=MiEscaner.next();
        Opcion=Integer.parseInt(Aux);
        switch(Opcion)
        {
            case 1:
                GuiaWhile.SacarCantidadDeMayores();
                break;
            case 2:
                GuiaWhile.SacarCantidadDePositivos();
                break;
            case 3:
                GuiaWhile.mostrarPares();
                break;
        }
        
        
    } 
}
