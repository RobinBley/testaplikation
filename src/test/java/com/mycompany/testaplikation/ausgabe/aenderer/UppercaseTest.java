package com.mycompany.testaplikation.ausgabe.aenderer;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rbley
 */
public class UppercaseTest {

    private AendererInterface aenderer;

    @Before
    public void setup() {
        aenderer = new Uppercase();
    }

    @Test
    public void testUppercase() {
        assertEquals("HALLO", aenderer.textAendern("hallo"));
    }

}
