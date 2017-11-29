/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploproductocontainer;

/**
 *
 * @author alumno
 */
public class Importado extends Producto{
    private String _pais;
    private float _impuesto;
    public Importado(int id,String nombre, float precio,String pais,float impuesto)
    {
        super(id, nombre, precio);
        this._pais=pais;
        this._impuesto=impuesto;
    }
    public float getterPrecio()
    {
        return this._precio+this._impuesto;
    }
    public void mostrarProducto()
    {
        super.mostrarProducto();
        System.out.println("pais: "+this._pais+" impuesto: "+this._impuesto);
    }
    public String toString()
    {
        return "esto es importado";
    }
    
    
    
}