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
public class ArticuloLiquido extends Articulo{
    private int _litros;
    public ArticuloLiquido(int pCodigo,String pNombre,float pPrecioCosto,int pStock, int pLitros)
    {
        super(pCodigo, pNombre, pPrecioCosto, pStock);
        this._litros=pLitros;
    }
}
