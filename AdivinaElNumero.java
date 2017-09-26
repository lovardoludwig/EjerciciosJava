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
        String DatoAux;
                
        System.out.println("Ingrese un numero");
        DatoAux = MiEscaner.next();
        Numero = Integer.parseInt(DatoAux);
        
        NumeroR = (int) (Math.random()*10) + 1;
        System.out.println("El numero secreto es: "+NumeroR);
        
        if(Numero.equals(NumeroR))
        {
            System.out.println("Acerto al numero");
        }else
        {
            if (Numero>NumeroR)
            {
                System.out.println("Te pasaste");
            }else
            {
                System.out.println("Te faltó");
            }
        }
        //a informar si:
        //si le erro por un punto , mensaje casi casi
        //si le erro por dos puntos, mensaje cerca
        //si le erro por tres puntos, mensaje ni cerca
        //si le erro por cuatro puntos, mensaje bien lejos
        //para todos los demas, sos horrible en este juego
    }
    
}
