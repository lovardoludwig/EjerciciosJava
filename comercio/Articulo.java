/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comercio;

/**
 *
 * @author alumno
 */
public class Articulo {
    protected int _codigo;
    protected String _nombre;
    protected float _precioCosto;
    protected float _precioventa;
    protected int _stock;
    
    public Articulo(int pCodigo,String pNombre,float pPrecioCosto,int pStock)
    {
        this._codigo=pCodigo;
        this._nombre=pNombre;
        this._precioCosto=pPrecioCosto;
        this._stock=pStock;
        this._precioventa=this._precioCosto+(this._precioCosto*25/100);
    }
    
    public void MostrarArticulo()
    {
        System.out.println("todos los datos");
    }
    
    public Boolean hayStock()
    {
        //las tres funcionan
//        if(this._stock<1)
//        {
//            return false;
//        }
//        return true;
        
        //la mas recomendada
        boolean retorno=false;
        if(this._stock>0)
        {
            retorno =true;
        }
        return retorno;
        
//        return(this._stock>0);
    }
    
    //los getter siempre retornan algo
    public float GetPrecioVenta()
    {
        return this._precioventa;
    }
    
    public String GetNombreyCodigo()
    {
        String retorno="";
        retorno= this._nombre+this._codigo;
        return retorno;
    }
    
    public int GetStock()
    {
        
    }
    
    public float getGanancia()
    {
        return this._precioventa-this._precioCosto;
    }
    
    //los setter siempre tienen parametros de ingreso y retorno
    public void SetPrecioCosto(float precioCosto)
    {
        this._precioCosto=precioCosto;
    }
    
    public void SetStock(int stock)
    {
        this._stock=stock;
    }
    
    public static boolean SonIguales(Articulo uno,Articulo dos)
    {
        boolean retorno=false;
        if(uno.GetNombreyCodigo().equals(dos.GetNombreyCodigo()))
        {
            retorno=true;
        }
        
        
        
        return retorno;
    }
    
    
    
    
}
