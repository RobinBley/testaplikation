package com.mycompany.testaplikation.properties;

import com.mycompany.testaplikation.App;
import com.mycompany.testaplikation.ausgabe.Ausgabe;
import com.mycompany.testaplikation.ausgabe.AusgabeInterface;
import com.mycompany.testaplikation.ausgabe.LogAusgabe;
import com.mycompany.testaplikation.ausgabe.aenderer.Aenderer;
import com.mycompany.testaplikation.ausgabe.aenderer.AendererInterface;
import com.mycompany.testaplikation.daten.Daten;
import com.mycompany.testaplikation.daten.DatenInterface;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rbley
 */
public class MyProperties {
    
    private Properties prop = new Properties();
    private final static transient org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(MyProperties.class);
    
    public MyProperties() {
    
            InputStream input = this.getClass().getClassLoader().getResourceAsStream("config.properties");
        try {
            prop.load(input);
        } catch (IOException ex) {
            log.fatal("Laden der Propertie fehlgeschlagen", ex);
            throw new IllegalStateException("Laden der Propertie fehlgeschlagen", ex);
        }
    
    }
    
    

    
    public Object getBean(String name){
        
        try {
            return Class.forName(prop.getProperty(name)).newInstance();
            
            
        } catch (SecurityException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            log.fatal("Instanzieren der Bean " + name +  " fehlgeschlagen", ex);
            throw new IllegalStateException("Instanzieren der Bean " + name +  " fehlgeschlagen", ex);
        }
        
        
    }
    
}
 