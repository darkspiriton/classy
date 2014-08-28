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
public class CalculadorNotasFactory {
    //Singleton
    public static CalculadorNotasFactory factory = null;
    
    private CalculadorNotasFactory(){};
    
    public static CalculadorNotasFactory getInstance(){
        if (factory == null){
            factory = new CalculadorNotasFactory();
        }
        return factory;
    }
    
    public CalculadorNotasStrategy obtenerCalculadorNotas(Clase clase){
        switch(clase.getTipo()){
            case 0:
                return new CalculadorNotasSimple();
            case 1:
                return new CalculadorNotasPonderado();
        }
        return null;
    }
}
