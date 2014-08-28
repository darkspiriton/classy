/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.ulima.classy.seguridad;

import javax.servlet.http.HttpSession;

/**
 *
 * @author hquintana
 */
public interface AutenticacionAdapter {
    public String getAuthURL(String callback, HttpSession session) throws Exception;
    public NombreMail getDatosPersonales(String verifier, HttpSession session) 
            throws Exception;
    public class NombreMail{
        public String nombre;
        public String mail;
    }
}
