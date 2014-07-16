package com.mycompany.testaplikation.ausgabe;

/**
 *
 * @author rbley
 */
public class Ausgabe implements AusgabeInterface {

    @Override
    public void ausgabe(String ausgabe) {
        System.out.println(ausgabe);
    }

}
