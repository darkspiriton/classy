/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.ulima.classy.cursos;

import java.util.List;

/**
 *
 * @author hquintana
 */
public class Nota {
    private int idNota;
    private int peso;
    private List<Nota> notas;

    public Nota(int idNota, int peso, List<Nota> notas) {
        this.idNota = idNota;
        this.peso = peso;
        this.notas = notas;
    }

    
    public int getIdNota() {
        return idNota;
    }

    public int getPeso() {
        return peso;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }
    
    
}
