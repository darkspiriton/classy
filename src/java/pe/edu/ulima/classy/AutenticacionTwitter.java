/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.ulima.classy;

import javax.servlet.http.HttpSession;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.RequestToken;

/**
 *
 * @author hquintana
 */
public class AutenticacionTwitter implements AutenticacionAdapter{
    private static final String CONSUMER_KEY = "kqpGWWje3zCidztrqnL9UZIbP";
    private static final String CONSUMER_SECRET = "QFpfF9qZN6jEl8ZwyW8vgzc5iSbv4dOIzRVnEIn7nbFu4nAh6H";
    @Override
    public String getAuthURL(String callback, HttpSession session) throws Exception{
        Twitter twitter = TwitterFactory.getSingleton();
        twitter.setOAuthConsumer(CONSUMER_KEY, CONSUMER_SECRET);
        RequestToken requestToken = twitter.getOAuthRequestToken(callback);
        session.setAttribute("requestToken", requestToken);
        
        return requestToken.getAuthorizationURL();
    }

    @Override
    public NombreMail getDatosPersonales(String verifier, HttpSession session) throws Exception {
        Twitter twitter = TwitterFactory.getSingleton();
        //twitter.setOAuthConsumer(CONSUMER_KEY, CONSUMER_SECRET);
        //RequestToken requestToken = twitter.getOAuthRequestToken();
        RequestToken requestToken = 
                (RequestToken)session.getAttribute("requestToken");
        twitter.getOAuthAccessToken(
                requestToken, verifier);
        
        NombreMail nombreMail = new NombreMail();
        nombreMail.nombre = twitter.getScreenName();
        nombreMail.mail = twitter.verifyCredentials().getName();
        return nombreMail;
    }

    
}
