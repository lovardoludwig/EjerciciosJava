/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class GuiaInicial {
      public static void saludar() {
        
          System.out.println("Buenas tardes");
    }
    
      public static void HacerEjercicio1()
      {
          System.out.println("Esto funciona de maravilla");
      }
       public static void HacerEjercicio2()
      {
          String Nombre;
          Scanner MiEscaner = new Scanner(System.in);
          System.out.println("Ingrese su nombre");
          Nombre=MiEscaner.next();
      }
       public static void HacerEjercicio3()
       {
           String Nombre;
           String Apellido;
           Scanner MiEscaner = new Scanner(System.in);
           
           System.out.println("Ingrese su nombre");
          Nombre=MiEscaner.next();
          
          System.out.println("Ingrese su apellido");
          Apellido=MiEscaner.next();
          
           System.out.println("su nombre es:" + Nombre);
           System.out.println("su apellido es:" + Apellido);
       }
       public static void HacerEjercicio5()
       {
           Integer NumeroUno;
           Integer NumeroDos;
           Integer Suma;
           String DatoAux;
           Scanner MiScanner = new Scanner(System.in);
           
           System.out.println("Ingrese el numero uno");
           DatoAux = MiScanner.next();
           NumeroUno = Integer.parseInt(DatoAux);
           
           System.out.println("Ingrese el numero dos");
           DatoAux = MiScanner.next();
           NumeroDos = Integer.parseInt(DatoAux);
           
           Suma = NumeroUno + NumeroDos;
           
           System.out.println("el resultado de la suma es:" + Suma);
       }
        public static void HacerEjercicio7()
        {
            Integer base;
            Integer perimetro;

            Scanner miScanner = new Scanner(System.in);

            System.out.println("¿Cuál es la base del cuadrado? ");
            base = miScanner.nextInt();

            perimetro = base * 4;

            System.out.println("El perimetro es de " + perimetro);
        }
        public static void HacerEjercicio9()
        {
            String datoAux;
            Integer cantidad;
            Double precio;
            Double total;
            Scanner miScanner = new Scanner(System.in);

            System.out.println("Ingrese cantidad: ");
            datoAux = miScanner.next();
            cantidad = Integer.parseInt(datoAux);

            System.out.println("Ingrese precio: ");
            datoAux = miScanner.next();
            precio= Double.parseDouble(datoAux);

            total = cantidad * precio;

            System.out.println("El precio total a pagar es " + total);
        }
        public static void HacerEjercicio11()
        {
            int horaTrabajo;
            int horasTrabajadas;
            int multiplicacion;
            double sueldo;
            double sueldoTotal;

            Scanner miScanner = new Scanner(System.in);

            System.out.println("Ingrese el valor de la hora trabajada: ");
            horaTrabajo= miScanner.nextInt();

            System.out.println("Ingrese la cantidad de horas trabajadas: ");
            horasTrabajadas= miScanner.nextInt();

            multiplicacion = horaTrabajo * horasTrabajadas;
            sueldo = multiplicacion * 0.15;
            sueldoTotal = multiplicacion - sueldo;

            System.out.println("El sueldo es " + sueldoTotal);
        }
        public static void HacerEjercicio14()
        {
            String Nombre;
            String Sexo;
            Scanner MiEscaner = new Scanner(System.in);
            
            System.out.println("Ingrese Nombre");
            Nombre = MiEscaner.next();
            
            System.out.println("Ingrese sexo");
            Sexo = MiEscaner.next();
            
            if(Sexo.equals("f"))
            {
                System.out.println("Feliz dia" + Nombre);
            }
        }
        public static void HacerEjercicio16()
        {
            Integer Edad;
            String DatoAux;
            Scanner MiEscaner = new Scanner(System.in);
            
            System.out.println("Ingrese edad");
            DatoAux=MiEscaner.next();
            Edad=Integer.parseInt(DatoAux);
            
            if(Edad>17)
            {
                System.out.println("Es mayor de edad");
            }else
            {
                System.out.println("Es menor de edad");
            }
        }
        public static void HacerEjercicio18()
        {
            String Clave;
            Scanner MiEscaner = new Scanner(System.in);
            
            System.out.println("Ingrese clave");
            Clave=MiEscaner.next();
            
            if(Clave.equals("1234"))
            {
                System.out.println("Bienvenido");
            }else
            {
                System.out.println("Clave incorrecta");
            }
        }
        public static void HacerEjercicio20()
        {
            Integer Importe;
            String Mes;
            String DatoAux;
            Double Total;
            Scanner MiEscaner = new Scanner(System.in);
            
            System.out.println("Ingrese importe");
            DatoAux=MiEscaner.next();
            Importe=Integer.parseInt(DatoAux);
            
            System.out.println("Ingrese mes de viaje");
            Mes=MiEscaner.next();
            
            if(Mes.equals("Enero"))
            {
                Total=Importe-(Importe*0.1);
            }
            DatoAux=MiEscaner.next();
            Total=Double.parseDouble(DatoAux);
            System.out.println("el total es:" + Total);
        }
        public static void HacerEjercicio22()
        {
            Integer Nota;
            String DatoAux;
            Scanner MiEscaner = new Scanner(System.in);
            
            System.out.println("Ingrese nota");
            DatoAux=MiEscaner.next();
            Nota=Integer.parseInt(DatoAux);
            
            if(Nota.equals("10"))
            {
                System.out.println("Excelente");
            }else
                if((Nota<10)&&(Nota>3))
                {
                    System.out.println("Aprobo");
                }else
                {
                    System.out.println("La proxima sera");
                }
        }
}
