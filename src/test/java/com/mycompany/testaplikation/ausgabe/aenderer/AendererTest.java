package com.mycompany.testaplikation.ausgabe.aenderer;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author rbley
 */
public class AendererTest {

    Aenderer aenderer = new Aenderer();

    @Test
    public void testTextAendern() {
        assertEquals("Hallo", aenderer.textAendern("Hall"));

    }

}
