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
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clase curso1 = new Clase(1, "Ingenieria Software 2", 0, null);
        Clase curso2 = new Clase(1, "Inteligencia Artificial", 1, null);
        
        Usuario alumno = new Usuario(1, "Juan" , 0, null, null);
        
        Nota nota1 = new Nota(1, 3, null);
        Nota nota2 = new Nota(2, 3, null);
        Nota nota3 = new Nota(3, 7, null);
        curso1.addNota(nota1);
        curso1.addNota(nota2);
        curso1.addNota(nota3);
        
        curso2.addNota(nota1);
        curso2.addNota(nota2);
        curso2.addNota(nota3);
        
        Inscripcion inscripcion1 = new Inscripcion(alumno, curso1, null);
        Inscripcion inscripcion2 = new Inscripcion(alumno, curso2, null);
        
        inscripcion1.addValorNota(new ValorNota(1, 13, nota1));
        inscripcion1.addValorNota(new ValorNota(1, 15, nota2));
        inscripcion1.addValorNota(new ValorNota(1, 10, nota3));
        
        inscripcion2.addValorNota(new ValorNota(1, 13, nota1));
        inscripcion2.addValorNota(new ValorNota(1, 15, nota2));
        inscripcion2.addValorNota(new ValorNota(1, 10, nota3));
        
        List<Inscripcion> inscripciones = new ArrayList<>();
        inscripciones.add(inscripcion1);
        inscripciones.add(inscripcion2);
        GestorCursos.getInstance().calcularNotas(inscripciones);
        
        for (Inscripcion inscripcion : inscripciones){
            System.out.println("Curso:" + inscripcion.getCurso().getNombre());
            System.out.println("Nota:" + inscripcion.getNotaFinal());
            System.out.println("************************");
        }
        
    }
    
}
