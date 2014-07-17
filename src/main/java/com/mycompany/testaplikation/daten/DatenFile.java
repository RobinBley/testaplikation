/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testaplikation.daten;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author rbley
 */
public class DatenFile implements DatenInterface {

    @Override
    public String load() {

        String ausgabe = null;
        try (
                BufferedReader reader = new BufferedReader(new FileReader("FileAusgabe.txt"))) {
            ausgabe = reader.readLine();
        } catch (IOException ex) {
        }
        return ausgabe;

    }

}
