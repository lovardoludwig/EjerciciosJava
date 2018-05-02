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
public class jugador {
    private int id;
    private String nombre;
    private String alias;

    public String getNombre() {
        return nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public jugador(int id, String nombre, String alias) {
        this.id = id;
        this.nombre = nombre;
        this.alias = alias;
    }
}
