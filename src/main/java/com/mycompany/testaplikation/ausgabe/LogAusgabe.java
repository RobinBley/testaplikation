package com.mycompany.testaplikation.ausgabe;

import org.apache.log4j.Logger;

/**
 *
 * @author rbley
 */
public class LogAusgabe implements AusgabeInterface {

    private final static transient Logger log = Logger.getLogger(LogAusgabe.class);

    @Override
    public void ausgabe(String ausgabe) {
        log.debug(ausgabe);
    }

}
