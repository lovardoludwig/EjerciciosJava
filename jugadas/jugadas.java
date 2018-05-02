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
public class jugadas {
    private int idJugadas;
    private juego idJuego;
    private jugador idJugador;
    private resultado resultado;

    public int getIdJugadas() {
        return idJugadas;
    }

    public juego getIdJuego() {
        return idJuego;
    }

    public jugador getIdJugador() {
        return idJugador;
    }

    public resultado getResultado() {
        return resultado;
    }

    public void setIdJugadas(int idJugadas) {
        this.idJugadas = idJugadas;
    }

    public void setIdJuego(juego idJuego) {
        this.idJuego = idJuego;
    }

    public void setIdJugador(jugador idJugador) {
        this.idJugador = idJugador;
    }

    public void setResultado(resultado resultado) {
        this.resultado = resultado;
    }

    public jugadas(int idJugadas, juego idJuego, jugador idJugador, resultado resultado) {
        this.idJugadas = idJugadas;
        this.idJuego = idJuego;
        this.idJugador = idJugador;
        this.resultado = resultado;
    }
    
    private void Agregar()
    {
        
    }
    
    private void Borrar()
    {
        
    }
    
    private void Listar()
    {
        
    }
    
    private void ListarFiltro()
    {
        
    }
}
