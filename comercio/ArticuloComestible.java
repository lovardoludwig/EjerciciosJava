/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comercio;

import java.util.Date;

/**
 *
 * @author alumno
 */
public class ArticuloComestible extends Articulo{
    private Date fechaVencimiento;
    public ArticuloComestible(int pCodigo,String pNombre,float pPrecioCosto,int pStock, Date pFechaVencimiento)
    {
        super(pCodigo, pNombre, pPrecioCosto, pStock);
        this.fechaVencimiento=pFechaVencimiento;
    }
}
