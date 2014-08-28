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
public class ValorNota {
    private int id;
    private int valor;
    private Nota nota;

    public ValorNota(int id, int valor, Nota nota) {
        this.id = id;
        this.valor = valor;
        this.nota = nota;
    }

    public int getId() {
        return id;
    }

    public int getValor() {
        return valor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nota getNota() {
        return nota;
    }

    public void setNota(Nota nota) {
        this.nota = nota;
    }
    
    
}
