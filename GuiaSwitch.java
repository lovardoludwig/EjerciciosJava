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
public class GuiaSwitch {
    public static void HacerEjercicio28()
    {
        Scanner miSc = new Scanner(System.in);
        String mesDelAño;
        System.out.println("Ingrese el mes del año");
        mesDelAño = miSc.next();
        
        switch (mesDelAño) 
        {
            case "enero": 
                System.out.println("Feliz verano");
                break;
                
            case "febrero":
                System.out.println("Feliz verano");
                break;
            
            default:
                System.out.println("No es verano");
                break;
        }
    }
    public static void HacerEjercicio29()
    {
        Scanner miSc = new Scanner(System.in);
        String mesDelAño;
        
        System.out.println("Ingrese el mes del año");
        mesDelAño = miSc.next();
        
        switch(mesDelAño)
        {
            case "enero":
                System.out.println("Iniciando el año");
                break;
                
            case "febrero":
                System.out.println("Iniciando el año");
                break;
                
            case "junio":
                System.out.println("Mitad de año");
                break;
                
            case "julio":
                System.out.println("Mitad de año");
                break;
                
            case "diciembre":
                System.out.println("Fin de año");
                break;
        }
    }
        public static void HacerEjercicio30()
        {
            Scanner miSc = new Scanner(System.in);
        
            String mesDelAño;

            System.out.println("Ingrese el mes del año");
            mesDelAño = miSc.next();

            switch(mesDelAño)
            {
                case "enero":
                    System.out.println("Que comiences bien el año");
                    break;

                case "marzo":
                    System.out.println("A clases");
                    break;

                case "julio":
                    System.out.println("Se vienen las vacaciones");
                    break;

                case "diciembre":
                    System.out.println("Felices Fiestas");
                    break;    
            
            }
        }
        public static void HacerEjercicio31()
        {
            Scanner miSc = new Scanner(System.in);
        
            String mesDelAño;

            System.out.println("Ingrese el mes del año");
            mesDelAño = miSc.next();

            switch(mesDelAño)
            {
                case "enero":
                    System.out.println("Tiene 31 días");
                    break;

                case "febrero":
                    System.out.println("Tiene 28 días");
                    break;

                case "marzo":
                    System.out.println("Tiene 31 días");
                    break;

                case "abril":
                    System.out.println("Tiene 30 días");
                    break;

                case "mayo":
                    System.out.println("Tiene 31 días");
                    break;

                case "junio":
                    System.out.println("Tiene 30 días");
                    break;

                case "julio":
                    System.out.println("Tiene 31 días");
                    break;

                case "agosto":
                    System.out.println("Tiene 31 días");
                    break;

                case "septiembre":
                    System.out.println("Tiene 30 días");
                    break;

                case "octubre":
                    System.out.println("Tiene 31 días");
                    break;

                case "noviembre":
                    System.out.println("Tiene 30 días");
                    break;

                case "diciembre":
                    System.out.println("Tiene 31 días");
                    break;

            }
        }
        public static void HacerEjercicio32()
        {
            Scanner miSc = new Scanner(System.in);
        
            String datoAux;
            Double hora;

            System.out.println("Ingrese la hora");
            datoAux = miSc.next();
            hora = Double.parseDouble(datoAux);

            if (hora>7 && hora<11) {
                System.out.println("Es de mañana");
            }
        }
        public static void HacerEjercicio33()
        {
            Scanner miSc = new Scanner(System.in);
        
            String signoZ;

            System.out.println("Ingresar su signo del zodíaco: ");
            signoZ = miSc.next();

            switch(signoZ)
            {
                case "aries":
                    System.out.println("El Carnero");
                    break;

                case "tauro":
                    System.out.println("El Toro");
                    break;

                case "geminis":
                    System.out.println("Los Gemelos");
                    break;

                case "cancer":
                    System.out.println("El Cangrejo");
                    break;

                case "leo":
                    System.out.println("El León");
                    break;

                case "virgo":
                    System.out.println("La virgen");
                    break;

                case "libra":
                    System.out.println("La balanza");
                    break;

                case "escorpio":
                    System.out.println("El Escorpion");
                    break;

                case "sagitario":
                    System.out.println("El Arquero");
                    break;

                case "capricornio":
                    System.out.println("La Cabra");
                    break;

                case "acurario":
                    System.out.println("El Aguador");
                    break;

                case "piscis":
                    System.out.println("Los peces");
                    break;
            }
        }
        public static void HacerEjercicio34()
        {
            Scanner miSc = new Scanner(System.in);
        
            String diaSemana;

            System.out.println("Ponga día de la semana: ");
            diaSemana = miSc.next();

            switch(diaSemana)
            {
                case "lunes":
                    System.out.println("Buen comienzo de semana");
                    break;

                case "sabado":
                    System.out.println("Buen finde");
                    break;

                case "domingo":
                    System.out.println("Buen finde");
                    break;

                default:
                    System.out.println("A aguantar");
                    break;

            }
        }
        public static void HacerEjercicio35()
        {
            Scanner miSc = new Scanner(System.in);
        
            Integer precioLamparas=35;
            Integer canLamparas;
            String auxCantidad;
            String marca;
            Integer PrecioBruto;
            Double PrecioFinal=(double)0;
            Double PrecioConIIBB;
            Double IIBB;

            System.out.println("Ingrese la marca que desea comprar");
            marca = miSc.next();

            System.out.println("Ingrese el número de lamparas que compra");
            auxCantidad = miSc.next();
            canLamparas = Integer.parseInt(auxCantidad);

            PrecioBruto = canLamparas * precioLamparas;

            if(canLamparas>5)
            {
                PrecioFinal = PrecioBruto * 0.5;
                System.out.println("Debe pagar " + PrecioFinal);
            }else
            {   
                //los menores a 6
                if(canLamparas==5)
                {
                    if(marca.equals("ArgentinaLuz"))
                    {
                       PrecioFinal = PrecioBruto * 0.6; 
                    }
                    else
                    {
                        PrecioFinal = PrecioBruto * 0.7;
                    }
                }else{
                    //todos los menores a 5
                    if(canLamparas==4)
                    {
                        if (marca.equals("ArgentinaLuz") || marca.equals("FelipeLamparas")) 
                        {
                            PrecioFinal = PrecioBruto * 0.75;
                        }else {
                            PrecioFinal = PrecioBruto * 0.80;
                        }
                }
            }
                if (canLamparas==3) {
                    if (marca.equals("ArgentinaLuz")) {
                        PrecioFinal = PrecioBruto * 0.85;
                    }
                    else{
                        if (marca.equals("FelipeLamparas")) {
                            PrecioFinal = PrecioBruto * 0.90;
                        }else{
                            PrecioFinal = PrecioBruto * 0.95;
                        }
                    }
                }

                if (PrecioFinal<120) {
                    System.out.println("Debe pagar " + PrecioFinal);
                }else {
                PrecioConIIBB = PrecioFinal * 1.10;
                IIBB = PrecioConIIBB - PrecioFinal;
                    System.out.println("Usted pagó " + PrecioConIIBB + " siendo " + IIBB + " el impuesto que pagó");
                }
            }
        }
}
