/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinaelnumero;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class AdivinaElNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner MiEscaner = new Scanner(System.in);
        Integer NumeroR;
        Integer Numero;
        Integer Diferencia;
        String DatoAux;
                
        System.out.println("Ingrese un numero");
        DatoAux = MiEscaner.next();
        Numero = Integer.parseInt(DatoAux);
        
        NumeroR = (int) (Math.random()*10) + 1;
        System.out.println("El numero secreto es: "+NumeroR);
        
        DatoAux = MiEscaner.next();
        Diferencia = Integer.parseInt(DatoAux);
        
        if(Numero.equals(NumeroR))
        {
            System.out.println("Acerto al numero");
        }else
        {
            if (Numero>NumeroR)
            {
                System.out.println("Te pasaste");
                /*switch(Numero - NumeroR)
                {
                    case 1:
                        System.out.println("Casi casi");
                        break;
                    case 2:
                        System.out.println("Cerca");
                        break;
                    case 3:
                        System.out.println("Ni cerca");
                        break;
                    case 4:
                        System.out.println("Bien lejos");
                        break;
                    default:
                        System.out.println("Sos horrible en este juego");
                }*/
            }else
            {
                System.out.println("Te faltó");
                /*switch(NumeroR - Numero)
                {
                    case 1:
                        System.out.println("Casi casi");
                        break;
                    case 2:
                        System.out.println("Cerca");
                        break;
                    case 3:
                        System.out.println("Ni cerca");
                        break;
                    case 4:
                        System.out.println("Bien lejos");
                        break;
                    default:
                        System.out.println("Sos horrible en este juego");*/
                }
                Diferencia = Numero - NumeroR;
                switch(NumeroR - Numero)
                {
                    case -1:
                    case 1:
                        System.out.println("...");
                        break;
            }
        }
    }
    
}
