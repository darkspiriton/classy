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
public class Inscripcion {
    private Usuario alumno;
    private Clase curso;
    private List<ValorNota> notas;
    private int notaFinal;

    public Inscripcion(Usuario alumno, Clase curso, List<ValorNota> notas) {
        this.alumno = alumno;
        this.curso = curso;
        this.notas = notas;
    }

    public Usuario getAlumno() {
        return alumno;
    }

    public Clase getCurso() {
        return curso;
    }

    public List<ValorNota> getNotas() {
        return notas;
    }

    public void setAlumno(Usuario alumno) {
        this.alumno = alumno;
    }

    public void setCurso(Clase curso) {
        this.curso = curso;
    }

    public void setNotas(List<ValorNota> notas) {
        this.notas = notas;
    }
    
    public void addValorNota(ValorNota valorNota){
        if (this.notas == null){
            this.notas = new ArrayList<>();
        }
        this.notas.add(valorNota);
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }
    
    
}
