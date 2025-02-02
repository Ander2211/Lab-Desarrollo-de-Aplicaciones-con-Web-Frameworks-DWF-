package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculadoraTest {

    Calculadora calculadora = new Calculadora();

    @Test
    void testSuma(){
        assertEquals(2,calculadora.suma(1,1));
        System.out.println("Se hizo la suma correctamente");
    }

    @Test
    void testResta(){
        assertEquals(5,calculadora.resta(10,5));
        System.out.println("Se hizo la suma resta");
    }

    @Test
    void testDivision(){
        assertEquals(0,calculadora.divicion(0,0));
        System.out.println("Se hizo la divicion correctamente");
    }

    @Test
    void testMultiplicacion(){
        assertEquals(2,calculadora.multiplicacion(2,1));
        System.out.println("Se hizo la multiplicacion correctamente");
    }




}
