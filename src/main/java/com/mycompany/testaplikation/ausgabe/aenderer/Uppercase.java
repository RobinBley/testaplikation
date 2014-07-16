package com.mycompany.testaplikation.ausgabe.aenderer;

/**
 *
 * @author rbley
 */
public class Uppercase implements AendererInterface {

    @Override
    public String textAendern(String text) {
        return text.toUpperCase();
    }

}
