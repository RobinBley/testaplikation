package com.mycompany.testaplikation;

import com.mycompany.testaplikation.ausgabe.AusgabeInterface;
import com.mycompany.testaplikation.ausgabe.aenderer.AendererInterface;
import com.mycompany.testaplikation.daten.DatenInterface;
import com.mycompany.testaplikation.properties.MyProperties;

/**
 *
 * @author rbley
 */
public class App {

    private DatenInterface daten;
    private AusgabeInterface ausgabe;
    private AendererInterface aenderer;

    public DatenInterface getDateninterface() {
        return daten;
    }

    public void setDateninterface(DatenInterface dateninterface) {
        this.daten = dateninterface;
    }

    public AusgabeInterface getAusgabeInterface() {
        return ausgabe;
    }

    public void setAusgabeInterface(AusgabeInterface ausgabe) {
        this.ausgabe = ausgabe;
    }

    public AendererInterface getAendererInterface() {
        return aenderer;
    }

    public void setAendererInterface(AendererInterface aenderer) {
        this.aenderer = aenderer;
    }

    public App() {
        //Properties auslesen
        MyProperties properties = new MyProperties();
        setAusgabeInterface((AusgabeInterface)properties.getBean("ausgabe"));
        setDateninterface((DatenInterface)properties.getBean("daten"));
        setAendererInterface((AendererInterface)properties.getBean("aenderer"));
        //Text ausgeben
        getAusgabeInterface().ausgabe(aenderer.textAendern(getDateninterface().load()));

    }

    public static void main(String[] args) {
        new App();
    }
}
