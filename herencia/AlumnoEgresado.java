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
public class AlumnoEgresado extends Alumno{
    private Date _fechaEgreso;
    private float _promedio;
    
    public void MostrarDatos()
    {
        super.MostrarDatos();
        System.out.println("FE: "+this._fechaEgreso);
        System.out.println("P: "+this._promedio);
    }
    
    
}
