/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author alumno
 */
public class Persona {
    private String _nombre;
    private String _apellido;
    
    public void MostrarDatos()
    {
        System.out.println("N: "+this._nombre);
        System.out.println("A: "+this._apellido);
    }
    
}
