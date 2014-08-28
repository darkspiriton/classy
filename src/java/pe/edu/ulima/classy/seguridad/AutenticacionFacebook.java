/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.ulima.classy.seguridad;

import facebook4j.Facebook;
import facebook4j.FacebookFactory;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hquintana
 */
public class AutenticacionFacebook implements AutenticacionAdapter{
    private static final String CONSUMER_KEY = "359926800824064";
    private static final String CONSUMER_SECRET = "3195493cb87abc89bbdd8076d9851fb3";
    
    @Override
    public String getAuthURL(String callback, HttpSession session) {
        Facebook facebook = new FacebookFactory().getInstance();
        facebook.setOAuthAppId(CONSUMER_KEY, CONSUMER_SECRET);
        facebook.setOAuthPermissions("public_profile, email");
        //facebook.setOAuthAccessToken(new AccessToken(accessToken, null));
        session.setAttribute("facebook", facebook);
        return facebook.getOAuthAuthorizationURL(callback);
    }

    @Override
    public NombreMail getDatosPersonales(String verifier, HttpSession session) throws Exception{
        Facebook facebook = (Facebook) session.getAttribute("facebook");
        //String oauthCode = request.getParameter("code");
        facebook.getOAuthAccessToken(verifier);
        NombreMail nombreMail = new NombreMail();
        nombreMail.nombre = facebook.users().getMe().getName();
        nombreMail.mail = facebook.users().getMe().getEmail();
        
        return nombreMail;
    }
    
}
