/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.ulima.classy.cursos;

/**
 *
 * @author hquintana
 */
public class Usuario {
    private int id;
    private String nombre;
    private int tipo; // 0: Alumno 1: Profesor
    private String idFb;
    private String idTw;

    public Usuario(int id, String nombre, int tipo, String idFb, String idTw) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.idFb = idFb;
        this.idTw = idTw;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public String getIdFb() {
        return idFb;
    }

    public String getIdTw() {
        return idTw;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setIdFb(String idFb) {
        this.idFb = idFb;
    }

    public void setIdTw(String idTw) {
        this.idTw = idTw;
    }
    
    
}
