/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testaplikation.ausgabe;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author rbley
 */
public class FileAusgabe implements AusgabeInterface {

    @Override
    public void ausgabe(String ausgabe) {
           
        try {
            BufferedWriter writer =new BufferedWriter(new FileWriter("FileAusgabe.txt"));
            writer.write(ausgabe);
            writer.close();
            
            
        } catch (IOException ex) {
        }
    }

}
