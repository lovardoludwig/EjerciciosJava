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
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer Opcion;
        Scanner MiEscaner = new Scanner(System.in);
        System.out.println("Que ejercicio queres probar del 1 al 34?");
        String Aux=MiEscaner.next();
        Opcion=Integer.parseInt(Aux);
        switch(Opcion)
        {
            case 1:
                GuiaInicial.HacerEjercicio1();
                break;
            case 2:
                GuiaInicial.HacerEjercicio2();
                break;
            case 3:
                GuiaInicial.HacerEjercicio3();
                break;
            case 4:
                GuiaInicial.HacerEjercicio5();
                break;
            case 5:
                GuiaInicial.HacerEjercicio7();
                break;
            case 6:
                GuiaInicial.HacerEjercicio9();
                break;
            case 7:
                GuiaInicial.HacerEjercicio11();
                break;
            case 8:
                GuiaInicial.HacerEjercicio14();
                break;
            case 9:
                GuiaInicial.HacerEjercicio16();
                break;
            case 10:
                GuiaInicial.HacerEjercicio18();
                break;
            case 11:
                GuiaInicial.HacerEjercicio20();
                break;
            case 12:
                GuiaInicial.HacerEjercicio22();
                break;
            case 13:
                GuiaSwitch.HacerEjercicio28();
                break;
            case 14:
                GuiaSwitch.HacerEjercicio29();
                break;
            case 15:
                GuiaSwitch.HacerEjercicio30();
                break;
            case 16:
                GuiaSwitch.HacerEjercicio31();
                break;
            case 17:
                GuiaSwitch.HacerEjercicio32();
                break;
            case 18:
                GuiaSwitch.HacerEjercicio33();
                break;
            case 19:
                GuiaSwitch.HacerEjercicio34();
                break;
            case 20:
                GuiaSwitch.HacerEjercicio35();
                break;
                            
        }
    
    }
}
