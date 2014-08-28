/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.ulima.classy.cursos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hquintana
 */
public class Clase {
    private int id;
    private String nombre;
    private int tipo; //0: Clase simple 1: Clase compuesta
    private Usuario profesor;
    private List<Nota> notasEstructura;

    public Clase(int id, String nombre, int tipo, Usuario profesor) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.profesor = profesor;
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

    public Usuario getProfesor() {
        return profesor;
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

    public void setProfesor(Usuario profesor) {
        this.profesor = profesor;
    }
    
    public void addNota(Nota nota){
        if (this.notasEstructura == null){
            notasEstructura = new ArrayList<>();
        }
        notasEstructura.add(nota);
    }
    
    public List<Nota> getNotasEstructura(){
        return this.notasEstructura;
    }
}
