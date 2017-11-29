/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploproductocontainer;

import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Conteiner {
    private int capacidad;
    private ArrayList<Producto> _listadoProductos;
    public Conteiner(int capacidad)
    {
        this.capacidad=capacidad;
        this._listadoProductos=new ArrayList<Producto>();
    }
    public float getterPrecioTotal()
    {
        float retorno=1;
        return retorno;
    }
    public int getterCantidadLugaresLibres()
    {
        int retorno=this.capacidad-this._listadoProductos.size();
        return retorno;
    }
    public int getterCantidadElementos()
    {
        int retorno=0;
        return retorno;
    }
    public void mostrarContainer()
    {
        System.out.println("aca muestro todos los datos");
        System.out.println("capacidad maxima: "+this.capacidad);
        System.out.println("lugares libres: "+this.getterCantidadLugaresLibres());
        System.out.println("lugares ocupados: "+this.getterCantidadElementos());
        System.out.println("listado de productos");
        int contador=1;
        for (Producto aux : this._listadoProductos) {
            System.out.println(contador);
            aux.mostrarProducto();
            System.out.println("el precio es: "+aux.getterPrecio());
            contador++;
        }
    }
    public boolean CargarProducto(Producto algunProducto)
    {
        if(this.getterCantidadLugaresLibres()>0)
        {
            this._listadoProductos.add(algunProducto);
            return true;
        }
        return false;
    }
    public void Ordenar()
    {
        for (int i = 0; i < this._listadoProductos.size(); i++) {
            for (int j = 0; j < this._listadoProductos.size()-1; j++) {
                if(this._listadoProductos.get(j)._precio<this._listadoProductos.get(j+1)._precio)
                {
                    Producto aux;
                    aux=this._listadoProductos.get(j);
                    this._listadoProductos.set(j, this._listadoProductos.get(j-1));
                    this._listadoProductos.set(j-1, aux);
                }
            }
        }
    }
    public void OrdenarPorNombre()
    {
        String Orden="";
        //getclass
        //instantoff
    
    }
}
