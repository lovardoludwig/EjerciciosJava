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
public class GuiaWhile {
    public static void saludarwhile()
    {
        System.out.println("hola ");
    }
    public static void SacarCantidadDeMayores()
    {
          /*
          pedir 5 edades e informar cuantos mayores a 18 hay
          */
        Integer edad;
        String datoAux;
        Integer contador=0;
        Integer cantMayores=0;
        Integer cantMenores=0;
        Integer total;
        Scanner MiEscaner = new Scanner(System.in);
          
        while(contador<5)
        {
           contador++;
           System.out.println("Ingresar edad");
           datoAux=MiEscaner.next();
           edad=Integer.parseInt(datoAux);
           if(edad>17)
           {
                cantMayores=cantMayores+1;
           }else
           {
                cantMenores++;
           }
        }
        System.out.println("la cantidad de mayores de edad es de: "+cantMayores);
        System.out.println("la cantidad de menores de edad es de: "+cantMenores);
        total=cantMayores+cantMenores;
        System.out.println("cantidad de personas: "+total);
    }
    public static void SacarCantidadDePositivos()
    {
        Integer numero;
        String datoAux;
        Integer contador=0;
        Scanner MiEscaner= new Scanner(System.in);
        
        while(contador>5)
        {
            System.out.println("ingrese numero:");
            datoAux=MiEscaner.next();
            numero=Integer.parseInt(datoAux);
        }
    }
    public static void mostrarPares()
    {
        Integer contador=0;
        while(contador<100)
        {
            contador++;
            if(contador%2==0)
            {
                System.out.println("es par:" +contador);
            }
            if()                          
        }
    }
    
}
