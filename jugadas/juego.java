/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saladejuegos;

/**
 *
 * @author alumno
 */
public class juego {
    private int idJuego;
    private String nombre;
    private tipodeJuego tipo;
    
    public juego(int idJuego, String nombre, tipodeJuego tipo) {
        this.idJuego = idJuego;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public int getIdJuego() {
        return idJuego;
    }

    public String getNombre() {
        return nombre;
    }

    public tipodeJuego getTipo() {
        return tipo;
    }

    public void setIdJuego(int idJuego) {
        this.idJuego = idJuego;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(tipodeJuego tipo) {
        this.tipo = tipo;
    }

  

    
}
