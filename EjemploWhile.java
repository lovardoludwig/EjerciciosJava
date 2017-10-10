/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplowhile;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjemploWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //EjemploWhile.PromedioConIf();
        //EjemploWhile.PromedioConWhile();
        //EjemploWhile.IteracionSinCantidad();
        //EjemploWhile.SalidaPorLogica();
        //EjemploWhile.PedirNumeros();
        EjemploWhile.MostrarMenu();
    }//finaliza el main
    
    /**
     * Pide dos numeros e informa el promedio
     */
    public static void PromedioConIf()
    {
        Scanner MiEscaner = new Scanner(System.in);
        Integer numeroUno;
        Integer numeroDos;
        Integer promedio;
        String datoAux;
        
        System.out.println("ingrese el primer numero");      
        datoAux=MiEscaner.next();
        numeroUno=Integer.parseInt(datoAux);

        System.out.println("ingrese el segundo numero");      
        datoAux=MiEscaner.next();
        numeroDos=Integer.parseInt(datoAux);
        
        promedio=(numeroUno+numeroDos)/2;
        System.out.println("El promedio es:" +promedio);
        
    //finaliza promedio con if    
        
    }
    
    /**
     * Pide dos numeros e informa el promedio
     */
    
    public static void PromedioConWhile()
    {
        Scanner MiEscaner = new Scanner(System.in);
        Integer numero;
        Integer promedio;
        Integer contador=0;
        Integer suma=0;
        String datoAux;
        
        while(contador<3)
        {
            contador++;
            System.out.println("ingrese el numero" +contador);      
            datoAux=MiEscaner.next();
            numero=Integer.parseInt(datoAux);
            suma=suma+numero;
        }
        promedio=suma/contador;
        System.out.println("El promedio es:" +promedio);

        
    }
    
    /**
     * Cuando no sabe,os la cantidad de iteraciones
     */
    public static void IteracionSinCantidad()
    {
        String continuar="si";
        while(!continuar.equals("no"))
        {
            System.out.println("Hola, desea continuar?");
            Scanner MiEscaner = new Scanner(System.in);
            continuar = MiEscaner.next();
        }
    }
    
    public static void SalidaPorLogica()
    {
        String continuar="si";
       while(true)
       {
           System.out.println("Hola, desea continuar?");
            Scanner MiEscaner = new Scanner(System.in);
            continuar = MiEscaner.next();
            if(continuar.equals("no"))
            {
                break;
            }
       } 
    }
    
    public static void PedirNumeros()
    {
        Integer numero;
        Integer contador=0;
        String aux;
        Integer suma=0;
        Scanner MiEscanner = new Scanner(System.in);
        while(contador<10&&suma>50)
        {
            contador++;
            System.out.println("Ingrese numero" +contador+":");
            aux=MiEscanner.next();
            numero=Integer.parseInt(aux);
            suma=suma+numero;
            /*if(suma>50)
            {
                break;
            }*/
        }
        System.out.println("La suma es "+suma);
        System.out.println("La cantidad es "+contador);
    }
    
    public static void MostrarMenu()
    {
        String opcion="nada";
        Scanner MiEscaner = new Scanner(System.in);
        
        
        while(!opcion.equals("6"))
        {
            System.out.println("1-sumar");
            System.out.println("2-restar");
            System.out.println("3-multiplicar");
            System.out.println("4-dividir");
            System.out.println("6-salir");
            System.out.println("Ingrese opcion deseada");
            opcion=MiEscaner.next();
            switch(opcion)
            {
                case "1":
                    EjemploWhile.Sumar();
                    break;
                case "2":
                    EjemploWhile.Resta();
                    break;
                case "3":
                    EjemploWhile.Multiplicacion();
                    break;
                case "4":
                    EjemploWhile.Division();
                    break;
                case "6":
                    System.out.println("Adios!!!");
                    break;
                default:
                    System.out.println("Ingreso una opcion equivocada");
            }   
        }//del while
        System.out.println("Cerro el menu");
        
    }
    
    public static void Sumar()
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
    public static void Resta()
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
    public static void Multiplicacion()
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
    public static void Division()
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
