/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofor;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class FuncionesParaFor 
{   public static void saludar()
    {
        System.out.println("hola");
    }
    public static void MostrarNumerosCrecientes()
    {
        Scanner MiEscaner = new Scanner(System.in);
        int contador;
        for(contador=0;contador<100;contador++)
        {
            System.out.println("el numero es: "+contador);
            contador++;
        }
    }
    public static void MostrarNumerosDecresientes()
    {
        for(int contador=100; contador>0;contador--){
            System.out.println("el numero es: "+contador);
        }
    }
    public static void MostrarNumerosPares()
    {
        Integer numero=0;
        Integer sumador=0;
        for(int contador=0;contador<100;contador++)
        {
            sumador=numero++;
            if(sumador%2==0)
            {
                System.out.println("los numeros pares son: "+sumador);
            }
        }
    }
    public static void MostrarNumerosDivisiblesPorSeis()
    {
        Integer numero=0;
        Integer sumador=0;
        for(int contador=0;contador<100;contador++)
        {
            sumador=numero++;
            if(sumador%6==0)
            {
                System.out.println("los numeros pares son: "+sumador);
            }
        }
    }
    public static void MostrarTablaDeMultiplicar()
    {
        Integer numero=9;
        Integer resultado;
        for (int contador = 1; contador < 11; contador++) {
            resultado=numero*contador;
            //System.out.println("resultado: "+resultado);
            System.out.println(numero+"*"+contador+"="+resultado); 
        }
    }
    public static void MostrarTablasDeMultiplicar()
    {
        Scanner MiEscaner=new Scanner(System.in);
        Integer numero;
        Integer resultado;
        String aux;
        
        System.out.println("ingrese un numero: ");
        aux = MiEscaner.next();
        numero=Integer.parseInt(aux);
        while(numero<20)
        {
            for (int contador = 1; contador < 11; contador++) 
            {
                resultado=numero*contador;
                //System.out.println("resultado: "+resultado);
                System.out.println(numero+"*"+contador+"="+resultado);
            }
            break;
        }
    }
    public static void MostrarTablaDeDividir()
    {
        Scanner MiEscaner=new Scanner(System.in);
        Float numero;
        Float resultado;
        String aux;
        
        System.out.println("ingrese un numero: ");
        aux = MiEscaner.next();
        numero=Float.parseFloat(aux);
        while(numero<20)
        {
            for (int contador = 1; contador < 11; contador++) 
            {
                resultado=numero/contador;
                //System.out.println("resultado: "+resultado);
                System.out.println(numero+"/"+contador+"="+resultado);
            }
            break;
        }
    }
    public static void InformarSiEsUnNumeroPrimo()
    {
        Scanner MiEscaner = new Scanner(System.in);
        Integer numero=8;
        Integer contador;
        //boolean flag=true;
        
        for (contador = 2; contador < numero; contador++) {
            if(numero%contador==0)
            {
                //flag=false;
                break;
            }
        }
        /*
        if(flag==false)
        {
            System.out.println("no es primo");
        }else
        {
            System.out.println("es primo");
        }
        */
        if(contador==numero)
        {
            System.out.println("es primo");
        }else
        {
            System.out.println("no es primo");
        }
    }
    public static void PrimosDel1Al100()
    {
        Scanner MiEscaner = new Scanner(System.in);
        Integer contador=0;
                
        for (int numero = 1; numero < 101; numero++) 
        {
            while(numero%contador==0)
            {
                break;
            }
        }
    }
    public static void CentroNumerico()
    {
        Integer numero=6;
        Integer sumaAnteriores=0;
        Integer sumaPosteriores=0;
        boolean centroNumerico=false;
        for (int contador = 1; contador < numero; contador++) 
        {
            sumaAnteriores=sumaAnteriores+contador;
        }
        System.out.println("la suma de los anteriores es: "+sumaAnteriores);
        
        for (int posterior = numero+1; ; posterior++) {
            sumaPosteriores=sumaPosteriores+posterior;
            if(sumaAnteriores==sumaPosteriores)
            {
                centroNumerico=true;
                break;
            }
            if(sumaPosteriores>sumaAnteriores)
            {
                centroNumerico=false;
                break;
            }
        }
        if(centroNumerico)
        {
            System.out.println("es centro numerico el numero: "+numero);
        }else
        {
            System.out.println("no es centro numerico");
        }
    }
    public static void CentrosNumericosDel1Al1000()
    {
        Integer numero;
        Integer sumaAnteriores=0;
        Integer sumaPosteriores=0;
        boolean centroNumerico=false;
        
        for (numero = 1; numero < 1000; numero++)
        {
            sumaAnteriores=0;
            sumaPosteriores=0;
            centroNumerico=false;
        
            for (int contador = 1; contador < numero; contador++) 
            {
                sumaAnteriores=sumaAnteriores+contador;
            }
            System.out.println("la suma de los anteriores es: "+sumaAnteriores);

            for (int posterior = numero+1; ; posterior++) {
                sumaPosteriores=sumaPosteriores+posterior;
                if(sumaAnteriores==sumaPosteriores)
                {
                    centroNumerico=true;
                    break;
                }
                if(sumaPosteriores>sumaAnteriores)
                {
                    centroNumerico=false;
                    break;
                }
            }
            if(centroNumerico)
            {
                System.out.println("es centro numerico el numero: "+numero);
            }else
            {
                System.out.println("no es centro numerico");
            }
        }
    }
    public static void FibonacciSucesion()
    {
        Integer fibonacci;
        Integer actual=1;
        Integer anterior=0;
        for (int contador = 0; contador < 20; contador++)
        {
            fibonacci= anterior+actual;
            anterior=actual;
            actual=fibonacci;
            System.out.println("es el: "+fibonacci);
        }
    }
    /**
     * rocorrer los numero del 1 al 100
     * mostrar en lugar del numero la palabra "UTN" para todos los
     * multiplos de 3
     * mostrar en lugar del numero la palabra "FRA" para todos los
     * multiplos de 5
     * mostrar en lugar del numero la palabra "UTN" para todos los
     * multiplos de 3 y 5
     */
    public static void SerieUtnFra()
    {
        for (int numero = 0; numero < 100; numero++) 
        {
            if(numero%3==0&&numero%5==0)
            {
                System.out.println("UTNFRA");
            }else
            {
                if(numero%3==0)
                {
                    System.out.println("UTN");
                }else
                {
                    if(numero%5==0)
                    {
                        System.out.println("FRA");
                    }else
                    {
                        System.out.println(numero);
                    }
                }
            }
        }
    }
    /**
     * 153 1^3+5^3+3^3=153
     */
    public static void NumeroArmstrong()
    {
        Integer numeroIngresado=153;
        Integer numero=numeroIngresado;
        if(numero<0)
        {
            numero=numero*-1;
        }
        Integer cantidadDigitos=0;
        while(numero>0)
        {
            numero=numero/10;
            cantidadDigitos++;
        }
        System.out.println(cantidadDigitos);
        Integer digito;
        Integer suma=0;
        Integer auxNumero=numeroIngresado;
        while(auxNumero>0)
        {
            digito=auxNumero%10;
            suma=suma+(int)Math.pow(digito,cantidadDigitos);
            auxNumero=auxNumero/10;
            System.out.println(digito);
        }
        System.out.println(suma);
        if(suma==numeroIngresado)
        {
            System.out.println("no es un numero armstrong");
        }else
        {
            System.out.println("es un numero armstrong");
        }
    }
    public static void HacerPiramide()
    {
        Integer cantidadFilas=9;
        for (int contador = 1; contador < cantidadFilas; contador++)
        {
            for (int contadorLugares = cantidadFilas-1; contadorLugares > contador; contadorLugares--) {
                System.out.print(" ");
            }
            for (int contadorDos = 1; contadorDos <=(2*contador-1) ; contadorDos++) {
                System.out.print("X");
            }
            System.out.println("");
        }
    }
    public static void EscalaNumeros()
    {
        Integer cantidadFilas=5;
        for (int contador = 1; contador < cantidadFilas; contador++)
        {
            for (int contadorDos = 1; contadorDos <=(2*contador-1) ; contadorDos++) {
                System.out.print("1");
            }
            System.out.println("");
        }   
    }
}