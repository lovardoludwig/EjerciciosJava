/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejfacturacion;

/**
 *
 * @author alumno
 */
public class Producto {
    private String _descripcion;
    private float _precio;
    private int _cantidad;
    
    public void SetterDescrip(String des)
    {
        this._descripcion=des;
    }
    public void SetterPrecio(float precio)
    {
        this._precio=precio;
    }
    public void SetterCantidad(int cantidad)
    {
        this._cantidad=cantidad;
    }
    public void MostrarProducto()
    {
        System.out.println("El producto es: "+this._descripcion);
        System.out.println("Cantidad del producto: "+this._cantidad);
        System.out.println("Precio del producto: "+this._precio);
    }
    public float DamePrecioFinal()
    {
        float retorno=this._precio*this._cantidad;
        return retorno;
    }
    public static Producto RetornarProductoRandom()
    {
        Producto retorno=new Producto();
        retorno._cantidad=9;
        retorno._precio=10;
        retorno._descripcion="chocolate";
        return retorno;
    }
}
