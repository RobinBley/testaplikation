package com.mycompany.testaplikation.ausgabe.aenderer;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rbley
 */
public class GrossKleinAendererTest {

    private AendererInterface aenderer;

    @Before
    public void setup() {
        aenderer = new GrossKleinAenderer();
    }

    @Test
    public void testUppercase() {
        assertEquals("HaLlO wElT", aenderer.textAendern("Hallo Welt"));
    }

    @Test
    public void testNull() {
        assertEquals("", aenderer.textAendern(null));
    }

}
