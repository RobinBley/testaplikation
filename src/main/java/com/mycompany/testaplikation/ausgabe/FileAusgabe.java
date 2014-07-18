/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testaplikation.ausgabe;

import com.mycompany.testaplikation.daten.Datenbank;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.log4j.Logger;

/**
 *
 * @author rbley
 */
public class FileAusgabe implements AusgabeInterface {
    
    private final static transient Logger log = Logger.getLogger(FileAusgabe.class);

    @Override
    public void ausgabe(String ausgabe) {
           
        try {
            BufferedWriter writer =new BufferedWriter(new FileWriter("FileAusgabe.txt"));
            writer.write(ausgabe);
            writer.close();
            
            
        } catch (IOException ex) {
            log.fatal("filereading exeption", ex);
        }
    }

}
