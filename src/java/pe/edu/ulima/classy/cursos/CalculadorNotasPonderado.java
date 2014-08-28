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
public class CalculadorNotasPonderado implements CalculadorNotasStrategy{

    @Override
    public int calcular(Inscripcion inscripcion) {
        List<ValorNota> notas = inscripcion.getNotas();
        
        int pesos = 0;
        int valores = 0;
        for (int i=0; i<notas.size(); i++){
            pesos += notas.get(i).getNota().getPeso();
            valores += 
                    notas.get(i).getValor() * notas.get(i).getNota().getPeso();
            
        }
        
        return valores / pesos;
    }
    
}
