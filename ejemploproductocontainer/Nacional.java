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
public class Nacional extends Producto{
    private String _provincia;
    public Nacional(int id,String nombre, float precio,String provincia)
    {
        super(id, nombre, precio);
        this._provincia=provincia;
    }
    public float getterPrecio()
    {
        return super.getterPrecio();
    }
    public void mostrarProducto()
    {
        super.mostrarProducto();
        System.out.println("provincia: "+this._provincia);
    }
}
