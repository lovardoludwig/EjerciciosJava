/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorapoo;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Calculadora {
    
    public static void ArrancarCalculadora()
    {
        String opcion="algo";
        System.out.println("Bienvenido a la calculadora");
        while(!opcion.equals("6"))
        {
            Calculadora.MostrarMenu();
        Scanner MiEscaner = new Scanner(System.in);
        opcion=MiEscaner.next();
        switch(opcion)
            {
                case "1":
                    Calculadora.Suma();
                    break;
                case "2":
                    Calculadora.Resta();
                    break;
                case "3":
                    Calculadora.Multiplicacion();
                    break;
                case "4":
                    Calculadora.Division();
                    break;
                case "6":
                    System.out.println("Adios!!!");
                    break;
                default:
                    System.out.println("Ingreso una opcion equivocada");
            }   
        }
        

    }
    private static void MostrarMenu()
    {
        System.out.println("1-sumar");
        System.out.println("2-restar");
        System.out.println("3-multiplicar");
        System.out.println("4-dividir");
        System.out.println("6-salir");
        System.out.println("Ingrese opcion deseada");
    }
    private static void Suma()
    {
        Integer numeroUno;
        Integer numeroDos;
        String aux;
        Integer resultado;
        Scanner MiEscaner = new Scanner(System.in);
        //primer numero
        System.out.println("Ingrese el primer numero");
        aux=MiEscaner.next();
        numeroUno=Integer.parseInt(aux);
        //segundo numero
        System.out.println("Ingrese el segundo numero");
        aux=MiEscaner.next();
        numeroDos=Integer.parseInt(aux);
        
        resultado=numeroUno+numeroDos;
        System.out.println("El resultado de la suma es: "+resultado); 
    }
    private static void Resta()
    {
        Integer numeroUno;
        Integer numeroDos;
        String aux;
        Integer resultado;
        Scanner MiEscaner = new Scanner(System.in);
        //primer numero
        System.out.println("Ingrese el primer numero");
        aux=MiEscaner.next();
        numeroUno=Integer.parseInt(aux);
        //segundo numero
        System.out.println("Ingrese el segundo numero");
        aux=MiEscaner.next();
        numeroDos=Integer.parseInt(aux);
        
        resultado=numeroUno-numeroDos;
        System.out.println("El resultado de la resta es: "+resultado); 
    }
    private static void Multiplicacion()
    {
        Integer numeroUno;
        Integer numeroDos;
        String aux;
        Integer resultado;
        Scanner MiEscaner = new Scanner(System.in);
        //primer numero
        System.out.println("Ingrese el primer numero");
        aux=MiEscaner.next();
        numeroUno=Integer.parseInt(aux);
        //segundo numero
        System.out.println("Ingrese el segundo numero");
        aux=MiEscaner.next();
        numeroDos=Integer.parseInt(aux);
        
        resultado=numeroUno*numeroDos;
        System.out.println("El resultado de la multiplicacion es: "+resultado);
    }
    private static void Division()
    {
        Integer numeroUno;
        Integer numeroDos;
        String aux;
        Integer resultado;
        Scanner MiEscaner = new Scanner(System.in);
        //primer numero
        System.out.println("Ingrese el primer numero");
        aux=MiEscaner.next();
        numeroUno=Integer.parseInt(aux);
        //segundo numero
        System.out.println("Ingrese el segundo numero");
        aux=MiEscaner.next();
        numeroDos=Integer.parseInt(aux);
        
        resultado=numeroUno/numeroDos;
        System.out.println("El resultado de la division es: "+resultado);
    }
}