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
        //EjemploWhile.MostrarMenu();
        //EjemploWhile.TomarDatosValidados();
        //EjemploWhile.ContadoresYAcumuladores();
        //EjemploWhile.NumeroPrimo();
        EjemploWhile.PrimosDelUnoAlCien();
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
    /**
     * Pide los datos de una persona y valida cada uno
     * Datos a pedir:
     * Nombre
     * Edad(entre 1 y 100 años)
     * Sexo (f o m)
     * Estado civil (soltero, casado, divorciado)
     * Nacionalidad (n: nativo, l: latino, e: europeo, r: resto del mundo)
     * Sueldo (entre 8000 y 58000)
     * Dona organos(si o no)
     * Clave de no menos 6 caracteres
     */
    public static void TomarDatosValidados()
    {
        Scanner MiEscaner = new Scanner(System.in);
        String aux;
        String nombre;
        Integer edad;
        String sexo;
        String estadoCivil;
        String nacionalidad;
        Integer sueldo;
        String donador;
        String clave;
        
        System.out.println("Ingrese nombre:");
        nombre = MiEscaner.next();
        
        System.out.println("Ingrese edad");
        aux = MiEscaner.next();
        edad = Integer.parseInt(aux);
        while((edad<1)||(edad>100))
        {
            System.out.println("Ingrese edad:");
            aux = MiEscaner.next();
            edad = Integer.parseInt(aux);
        }
        
        System.out.println("Ingrese sexo:");
        sexo = MiEscaner.next();
        while(!sexo.equals("f")&&(!sexo.equals("m")))
        {
            System.out.println("Ingrese sexo");
            sexo = MiEscaner.next();
        }
        
        System.out.println("Ingrese estado civil:");
        estadoCivil = MiEscaner.next();
        while(!estadoCivil.equals("soltero")&&!estadoCivil.equals("casado")&&!estadoCivil.equals("divorciado"))
        {
            System.out.println("Ingrese estado civil");
            estadoCivil = MiEscaner.next();
        }
        
        System.out.println("Ingrese nacionalidad:");
        nacionalidad = MiEscaner.next();
        while(!nacionalidad.equals("n")&&!nacionalidad.equals("l")&&!nacionalidad.equals("e")&&!nacionalidad.equals("r"))
        {
            System.out.println("Ingrese nacionalidad");
            nacionalidad = MiEscaner.next();
        }
        
        System.out.println("Ingrese sueldo:");
        aux = MiEscaner.next();
        sueldo = Integer.parseInt(aux);
        while((sueldo<8000)||(sueldo>58000))
        {
            System.out.println("Ingrese sueldo:");
            aux = MiEscaner.next();
            sueldo = Integer.parseInt(aux);
        }
        
        System.out.println("Ingrese si es o no donador de organos:");
        donador = MiEscaner.next();
        while(!donador.equals("no")&&!donador.equals("si"))
        {
            System.out.println("Ingrese si es o no donador de organos:");
            donador = MiEscaner.next();
        }
        
        System.out.println("Ingrese clave:");
        clave = MiEscaner.next();
        while(clave.length()<6)
        {
            System.out.println("Ingrese clave:");
            clave = MiEscaner.next();
        }
        
        //String otroAux="lalala";
        //Integer resultado = otroAux.length();
        //System.out.println("Resultado: "+resultado);
        //Resultado del largo de la contraseña ingresada
    }
    public static void ContadoresYAcumuladores()
    {
        Integer contador=0;
        Integer acumulador=0;
        Integer factorial=1;
        //factorial=multiplicacion de todos los numeros antecesores a un numero
        Integer restador=0;
        Integer contadorPares=0;
        Integer contadorDiv3=0;
        
        
        while(contador<10)
        {
            contador++;
            System.out.println("numero: "+contador);
            acumulador=acumulador+contador;
            factorial=factorial*contador;
            restador=restador-contador;
            if(contador%2==0)
            {
                contadorPares++;
            }
            if(contador%3==0)
            {
                contadorDiv3++;
            }
        }
        System.out.println("la suma es: "+acumulador);
        System.out.println("la multiplicacion es: "+factorial);
        System.out.println("la resta es: "+restador);
        System.out.println("la cantidad de pares es: "+contadorPares);
        System.out.println("los multiplos de 3 son: "+contadorDiv3);
    }
    public static void PrimosDelUnoAlCien()
    {
        Integer numeroIngresado=1;
        while(numeroIngresado<101)
        {
            numeroIngresado++;
            Integer  contador=2;
            Integer contadorDivisores=0;

            while(contador<numeroIngresado)
            {
                if(numeroIngresado%contador==0)
                {
                    contadorDivisores++;
                    break;
                }            
                contador++;
            }
            if(contadorDivisores>0)
            {
                //System.out.println("no es primo");
            }else
            {
                System.out.println("es primo");
            }
        }
    }
    public static void NumeroPrimo()
    {
        Integer numeroIngresado=357;
        Integer  contador=2;
        Integer contadorDivisores=0;

        while(contador<numeroIngresado)
            {
                if(numeroIngresado%contador==0)
                {
                    contadorDivisores++;
                    break;
                }            
                contador++;
            }
            if(contadorDivisores>0)
            {
                System.out.println("no es primo");
            }else
            {
                System.out.println("es primo");
            }
    }
}
    
