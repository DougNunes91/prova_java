package br.com.confidencecambio.javabasico.controller;

import br.com.confidencecambio.javabasico.service.ImcService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ImcControllerTest {

    @InjectMocks
    private ImcController imcController;

    @Mock
    private ImcService imcService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testCalcularIMC() {
        double peso = 70.0;
        double altura = 1.75;
        double imcEsperado = 22.86;

        when(imcService.calcularIMC(peso, altura)).thenReturn(imcEsperado);

        double imcRetornado = imcController.calcularIMC(peso, altura);

        assertEquals(imcEsperado, imcRetornado);
    }
}

