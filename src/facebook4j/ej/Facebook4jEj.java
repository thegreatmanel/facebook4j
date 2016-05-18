/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facebook4j.ej;

import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;


import facebook4j.conf.ConfigurationBuilder;
import java.net.MalformedURLException;


/**
 *
 * @author igonzalezcastro
 */
public class Facebook4jEj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FacebookException, MalformedURLException {
       Interfaz ventana = new Interfaz();
        ventana.setVisible(true);

        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthAppId("1100205883375268")
                .setOAuthAppSecret("48c52d059781a358e6774f7b5f346d21")
                .setOAuthAccessToken("EAALp9BkJruMBAMcLZAbNYKDCYZCXNyyLQG5c3HZCI0LtHOD8UduofStKQhehkSl3O0T0EjXDMCejxjAv8VRrT6JYYnaoPcIZAl0MoTjLvo0UQY6fA7b2F24pBlggxpxqFVvWt02IgUck1MOZC1NyHvNzZCVJn1h9T9cZCuj1pNaLQZDZD")
                .setOAuthPermissions("email,publish_stream,...");
        FacebookFactory ff = new FacebookFactory(cb.build());
        Facebook facebook = ff.getInstance();
        

     
       
    }

}
