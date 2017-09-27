/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infonumerica;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class InfoNumerica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se brinda la informacion sobre un numero ingresado
        // modulo = %
        /*Scanner MiEscaner = new Scanner(System.in);
        Integer NumeroUno;
        Integer NumeroDos;
        Integer Resultado;
        NumeroUno=2;
        NumeroDos=10;
        Resultado = 2%10;
        System.out.println("El resultado de 2%10 es:"+Resultado);
        Resultado =11%2;
        System.out.println("El resultado de 11%2 es:"+Resultado);*/
        Scanner MiEscaner = new Scanner(System.in);
        String DatoAux;
        Integer Numero;
        System.out.println("Ingrese un numero");
        DatoAux = MiEscaner.next();
        Numero=Integer.parseInt(DatoAux);
        
        if(Numero>100)
        {
            System.out.println("El numero es mayor a 100");
        }else
        {
            System.out.println("El numero es menor a 100");
        }
        /*if(Numero>0)
        {
            System.out.println("Es positivo");
        }else
        {
            System.out.println("Es negativo");
        }*/
        if(Numero%2==0)
        {
            System.out.println("El numero es par");
        }else
        {
            System.out.println("El numero es impar");
        }
        if(Numero!=0)
        {
            System.out.println("positivo");
        }else
        {
            System.out.println("negativo");
        }
    }
    /* 1- informar si el numero es mayor o menor a 100
       2- informar si es positivo o negativo
       3- informar si es par
    */
}
