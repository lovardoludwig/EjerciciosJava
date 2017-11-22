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
public class Remito extends Documento{
    protected Date fechaEnt;
    public Remito(int numero)
    {
        super(numero);
    }
    public void MostrarDatosCompletos()
    {
        
        System.out.println("Fecha ent: "+this.fechaEnt);
    }
    
}
