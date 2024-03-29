/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.ulima.classy.seguridad;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;
import pe.edu.ulima.classy.seguridad.AutenticacionAdapter.NombreMail;

/**
 *
 * @author hquintana
 */
public class GestorUsuario {
    private static GestorUsuario gestor = null;
    
    private GestorUsuario(){}
    
    public static GestorUsuario getInstance(){
        if (gestor == null){
            gestor = new GestorUsuario();
        }
        return gestor;
    }
    
    public String obtenerAuthorizationURLTwitter(String callback, HttpSession session){
        AutenticacionAdapter autenticacionAdapter = new AutenticacionTwitter();
        try {
            return autenticacionAdapter.getAuthURL(callback, session);
        } catch (Exception ex) {
            Logger.getLogger(GestorUsuario.class.getName()).log(Level.SEVERE, 
                    null, ex);
            return "";
        }
    }
    
    public NombreMail obtenerDatosUsuarioFacebook(String verifier, HttpSession session){
        AutenticacionAdapter autenticacionAdapter = new AutenticacionFacebook();
        try {
            return autenticacionAdapter.getDatosPersonales(verifier, session);
        } catch (Exception ex) {
            Logger.getLogger(GestorUsuario.class.getName()).log(Level.SEVERE, 
                    null, ex);
            return null;
        }
    }
    
    public String obtenerAuthorizationURLFacebook(String callback, HttpSession session){
        AutenticacionAdapter autenticacionAdapter = new AutenticacionFacebook();
        try {
            return autenticacionAdapter.getAuthURL(callback, session);
        } catch (Exception ex) {
            Logger.getLogger(GestorUsuario.class.getName()).log(Level.SEVERE, 
                    null, ex);
            return "";
        }
    }
    
    public NombreMail obtenerDatosUsuarioTwitter(String verifier, HttpSession session){
        AutenticacionAdapter autenticacionAdapter = new AutenticacionTwitter();
        try {
            return autenticacionAdapter.getDatosPersonales(verifier, session);
        } catch (Exception ex) {
            Logger.getLogger(GestorUsuario.class.getName()).log(Level.SEVERE, 
                    null, ex);
            return null;
        }
    }
}
