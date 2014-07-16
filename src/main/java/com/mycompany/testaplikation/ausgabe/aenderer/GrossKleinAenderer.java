package com.mycompany.testaplikation.ausgabe.aenderer;

import java.util.ArrayList;

/**
 *
 * @author rbley
 */
public class GrossKleinAenderer implements AendererInterface {

    @Override
    public String textAendern(String text) {

        if (text == null) {
            return "";
        }

        ArrayList<Integer> spaces = new ArrayList<>();
        StringBuilder buffer = new StringBuilder();

        //Position der Spaces in eine ArrayList schreiben
        //und aus dem String entfernden
        for (int i = 0; i < text.length(); i++) {
            if (String.valueOf(text.charAt(i)).equals(" ")) {
                spaces.add(i);
            } else {
                buffer.append(String.valueOf(text.charAt(i)));
            }
        }

        text = buffer.toString();
        buffer = new StringBuilder();

        //Lower-Upper-Case anwenden
        for (int i = 0; i < text.length(); i++) {
            if (i % 2 == 0) {
                buffer.append(String.valueOf(text.charAt(i)).toUpperCase());
            } else {
                buffer.append(String.valueOf(text.charAt(i)).toLowerCase());
            }
        }
        //Spaces wieder einfuegen
        for (int i : spaces) {
            buffer.insert(i, " ");
        }

        return buffer.toString();
    }

}
