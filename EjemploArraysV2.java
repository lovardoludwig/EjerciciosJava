/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarraysv2;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjemploArraysV2 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] alumno={"maria","manuel","diego","estela","martin"};
        int[] notas={10,2,5,2,7};
        int aux;
        aux=EjemploArraysV2.RetornarPromedio(notas);
        System.out.println(aux);
        String auxDos;
        auxDos=EjemploArraysV2.RetornarElNombreDeLaPrimerNota(notas, args);
    }
    
    public static String  RetornarElNombreDeLaPrimerNota(int[]notas ,String[]nombres)
    {   
        String retorno=""; 
        int mejorNota=0;        
        for (int i = 0; i < notas.length; i++) {
            if(i==0)
            {
                mejorNota= notas[i];
                retorno=nombres[i];
            }else
            {
                if(mejorNota< notas[i])
                {
                    mejorNota= notas[i];
                    retorno=nombres[i];
                }
            }
        }
        return retorno;
        //hacer el nombre del menor
    }
        /*Scanner MiEscaner = new Scanner(System.in);
        String nombres[];
        nombres=new String[3];
        int notas[];
        notas=new int[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("ingrese su nombre");
            nombres[i]=MiEscaner.next();
            System.out.println("ingrese su nota");
            notas[i]=MiEscaner.nextInt();
        }
        EjemploArraysV2.MostrarNombres(nombres);
        
    }
     public static void CargarDatosDos(int[] cantidad,String[] ListadoDePalabras)    
    {
        Scanner MiEscaner = new Scanner(System.in);
        String nombres[];
        nombres=new String[3];
        int notas[];
        notas=new int[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("ingrese su nombre");
            nombres[i]=MiEscaner.next();
            System.out.println("ingrese su nota");
            notas[i]=MiEscaner.nextInt();
        }
    }
    public static void CargarDatos(int cantidad)
    {
        Scanner MiEscaner = new Scanner(System.in);
        String nombres[];
        nombres=new String[cantidad];
        int notas[];
        notas=new int[cantidad];
        
        for (int i = 0; i < cantidad; i++) {
            System.out.println("ingrese su nombre");
            nombres[i]=MiEscaner.next();
            System.out.println("ingrese su nota");
            notas[i]=MiEscaner.nextInt();
        }
    }
    public static void CargarDatos()
    {
        // array de nombres
        // array de notas
        // pedir tres notas y tres nombres
        // mostrar los dos arrays
        // saco el promedio
        
        Scanner MiEscaner = new Scanner(System.in);
        String nombres[];
        nombres=new String[3];
        int notas[];
        notas=new int[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("ingrese su nombre");
            nombres[i]=MiEscaner.next();
            System.out.println("ingrese su nota");
            notas[i]=MiEscaner.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("el nombre es: "+nombres[i]);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("el nota es: "+notas[i]);
        }
        int suma=0;
        for (int i = 0; i < 3; i++) {
            suma=suma+notas[i];
        }
        int promedio=suma/3;
    }
    public static void MostrarNombres(String[] ListadoDePalabras)
    {
        for (int i = 0; i < ListadoDePalabras.length; i++) {
            System.out.println("la palabra es: "+ListadoDePalabras[i]);
        }
    }
    public static void MostrarPromedio(int[] ListadoDeNumeros)
    {
        
    }*/
    public static int RetornarCantidadDeAprovados(int[] miParametro)
    {
        int resultado=0;
        for (int i = 0; i < miParametro.length; i++) {
            if(miParametro[i]>3)
                resultado++;
        }
        return resultado;
    }
    public static int RetornarPromedio(int[] miParametro)
    {
        int resultado=0;
        int suma=0;
        int promedio;
        for (int i = 0; i < miParametro.length; i++) {
            if(miParametro[i]>3)
                resultado++;
        }
        for (int i = 0; i < miParametro.length; i++) {
            suma=suma+miParametro[i];
        }
        promedio=suma/miParametro.length;
        System.out.println("el promedio es: "+promedio);
        return promedio;
    }
   
}
