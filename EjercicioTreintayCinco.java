/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotreintaycinco;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioTreintayCinco {

    /**
     * @param args the command line arguments
     * Las lámparas están al mismo precio de $35 pesos final. 
     * A. Si compra 6 o más lamparitas bajo consumo tiene un descuento del 50%. 
     * B. Si compra 5 lamparitas bajo consumo marca "ArgentinaLuz" se hace un descuento del 40 % y si es de otra marca el descuento es del 30%. 
     * C. Si compra 4 lamparitas bajo consumo marca "ArgentinaLuz" o “FelipeLamparas” se hace un descuento del 25 % y si es de otra marca el descuento es del 20%. 
     * D. Si compra 3 lamparitas bajo consumo marca "ArgentinaLuz" el descuento es del 15%, si es “FelipeLamparas” se hace un descuento del 10 % y si es de otra marca un 5%.

     */
    public static void main(String[] args) {
        Scanner MiEscaner = new Scanner(System.in);
        String Marca;
        Integer Cantidad;
        Integer Precio=35;
        Integer PrecioBruto;
        Double PrecioFinal;
        String DatoAux;
        
        System.out.println("Ingrese marca:");
        Marca = MiEscaner.next();
        
        System.out.println("Ingrese cantidad:");
        DatoAux = MiEscaner.next();
        Cantidad = Integer.parseInt(DatoAux);
        
        PrecioBruto = Cantidad * Precio;
        
        if(Cantidad>5)
        {
            PrecioFinal=PrecioBruto*0.6;
        }else
        {
            
        }
        
        
        
        
    }
    
}
