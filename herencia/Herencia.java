/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author alumno
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FacturaA miFactura=new FacturaA(66);
        //miFactura.SetterNumero(66);
        miFactura.MostrarNumero();
        
//        AlumnoEgresado miEgresado = new AlumnoEgresado();
//        miEgresado.MostrarDatos();

        ArrayList<Persona> listadoPersonas;
        listadoPersonas= new ArrayList<Persona>();
        
        AlumnoEgresado miEgresado = new AlumnoEgresado();
        listadoPersonas.add(miEgresado);
        
        Alumno miAlumno= new Alumno();
        listadoPersonas.add(miAlumno);
        
        Persona unaPersona = new Persona();
        listadoPersonas.add(unaPersona);
        
//        for (int i = 0; i < listadoPersonas.size(); i++) {
//            listadoPersonas.get(i).MostrarDatos();
//        }
        
        for (Persona alguno : listadoPersonas) {
            alguno.MostrarDatos();
        }
        
//        Iterator<Persona> iterador =listadoPersonas.iterator();
//        
//        while(iterador.hasNext())//booleano
//        {
//            Persona nueva = iterador.next();
//            nueva.MostrarDatos();
//        }
        //no anda por ahora
        System.out.println("listado "+listadoPersonas);
        
        
        
        
    }
    
}
