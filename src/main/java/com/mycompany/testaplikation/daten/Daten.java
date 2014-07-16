package com.mycompany.testaplikation.daten;

/**
 *
 * @author rbley
 */
public class Daten implements DatenInterface {

    private String daten = "Hallo Welt";

    public String getDaten() {
        return daten;
    }

    public void setDaten(String daten) {
        this.daten = daten;
    }

    @Override
    public String load() {
        return getDaten();
    }

}
