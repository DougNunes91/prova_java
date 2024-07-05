package br.com.confidencecambio.javabasico.service.impl;

import br.com.confidencecambio.javabasico.service.ImcService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ImcServiceImplTest {

    private final ImcService imcService = new ImcServiceImpl();

    @Test
    public void testCalcularIMC() {
        double peso = 70.0;
        double altura = 1.75;
        double imcEsperado = 22.857142857142858;

        double imcRetornado = imcService.calcularIMC(peso, altura);

        assertEquals(imcEsperado, imcRetornado, 0.0001);
    }

    @Test
    public void testCalcularIMCComAlturaZero() {
        double peso = 70.0;
        double altura = 0;

        assertThrows(IllegalArgumentException.class, () -> {
            imcService.calcularIMC(peso, altura);
        });
    }

    @Test
    public void testCalcularIMCComAlturaNegativa() {
        double peso = 70.0;
        double altura = -1.75;

        assertThrows(IllegalArgumentException.class, () -> {
            imcService.calcularIMC(peso, altura);
        });
    }
}
