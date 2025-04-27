package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private Main main;

    @BeforeEach
    void setUp() {
        main = new Main();
    }

    @Test
    void testSuma() {
        assertEquals(5, main.suma(2, 3));
        assertEquals(0, main.suma(2, -2));
        assertEquals(-5, main.suma(-2, -3));
        assertEquals(2, main.suma(2, 0));
    }

    @Test
    void testResta() {
        assertEquals(-1, main.resta(2, 3));
        assertEquals(4, main.resta(2, -2));
        assertEquals(1, main.resta(-2, -3));
        assertEquals(2, main.resta(2, 0));
    }

    @Test
    void testMultiplicacion() {
        assertEquals(6, main.multiplicacion(2, 3));
        assertEquals(-4, main.multiplicacion(2, -2));
        assertEquals(6, main.multiplicacion(-2, -3));
        assertEquals(0, main.multiplicacion(2, 0));
    }

}
