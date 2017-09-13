/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocinco;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioCinco {

    /**
     * @param args the command line arguments
     * Se necesita pedir dos numeros y sumarlos, mostrar el resultado
     */
    public static void main(String[] args) {
        int NumeroUno;
        int NumeroDos;
        int Suma;
        Scanner entradaPorTeclado=new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        NumeroUno= entradaPorTeclado.nextInt();
        System.out.println("Ingrese el segundo numero");
        NumeroDos= entradaPorTeclado.nextInt();
        Suma=NumeroUno+NumeroDos;
        System.out.println("La suma es :"+Suma);
       
    }
    
}
