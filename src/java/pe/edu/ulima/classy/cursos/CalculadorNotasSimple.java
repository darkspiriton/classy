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
public class CalculadorNotasSimple implements CalculadorNotasStrategy{

    @Override
    public int calcular(Inscripcion inscripcion) {
        List<ValorNota> notas = inscripcion.getNotas();
        
        int suma = 0;
        for (int i=0; i<notas.size(); i++){
            suma += notas.get(i).getValor();
        }
        
        return suma / notas.size();
    }
}
