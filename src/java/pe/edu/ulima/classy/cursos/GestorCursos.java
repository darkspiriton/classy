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
public class GestorCursos {
    private static GestorCursos gestor = null;
    private GestorCursos(){}
    
    public static GestorCursos getInstance(){
        if (gestor == null){
            gestor = new GestorCursos();
        }
        return gestor;
    }
    
    public void calcularNotas(List<Inscripcion> inscripciones){
        for (Inscripcion inscripcion : inscripciones){
            CalculadorNotasStrategy calculador = 
                    CalculadorNotasFactory.getInstance().obtenerCalculadorNotas(
                        inscripcion.getCurso());
            int nota = calculador.calcular(inscripcion);
            inscripcion.setNotaFinal(nota);
        }
    }
}
