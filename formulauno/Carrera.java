/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulauno;

import java.time.Instant;
import java.util.Calendar;

/**
 *
 * @author alumno
 */
public class Carrera {
    public Auto[] autosParticipantes;
    private String fecha;
    private String pais;
    /**
     * 1-no tiene valor de retorno
     * 2-se llama igual que la clase
     * 3-el por defecto puede estar o no
     * 4-se ejecuta una vez, solamente al crear el objeto
     */
    public Carrera()//constructor
    {
        this.fecha=Calendar.getInstance().toString();
        this.pais="Argentina";
        this.autosParticipantes=new Auto[20];
        this.CrearAutosTest();
    }
    private void CrearAutosTest()
    {
        for (int i = 0; i < this.autosParticipantes.length; i++) {
            this.autosParticipantes[i]=new Auto(i);
        }
    }
    public void CorrerCarrera(int CantidadDeVueltas)
    {
        for (int Vueltas = 0; Vueltas < CantidadDeVueltas; Vueltas++) {
            for (int i = 0; i < this.autosParticipantes.length; i++) 
            {
                int random=(int) (Math.random()*100);
                this.autosParticipantes[i].AgregarTiempoRecorrido(random);
            }            
        }
    }
    public Auto DameElGanador()
    {
        Auto retorno=new Auto(0);
        int menorRecorrido=0;
        for (int i = 10; i < this.autosParticipantes.length; i++) {
            if(i==0)
            {
                menorRecorrido=this.autosParticipantes[i].DameElTiempoRecorrido();
                retorno=this.autosParticipantes[i];
            }else
            {
                if(menorRecorrido>this.autosParticipantes[i].DameElTiempoRecorrido())
                {
                    menorRecorrido=this.autosParticipantes[i].DameElTiempoRecorrido();
                    retorno=this.autosParticipantes[i];
                }
            }
        }
        return retorno;
    }
}
