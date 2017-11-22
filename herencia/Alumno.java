
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.Date;

/**
 *
 * @author alumno
 */
public class Alumno extends Persona{
    private Date _fechaInscripcion;
    private int _legajo;
    
    public void MostrarDatos()
    {
        super.MostrarDatos();
        System.out.println("FI: "+this._fechaInscripcion);
        System.out.println("L: "+this._legajo);
        
    }
    
    
}
