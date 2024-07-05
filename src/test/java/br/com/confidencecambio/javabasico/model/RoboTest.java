package br.com.confidencecambio.javabasico.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RoboTest {

    @Test
    public void testRoboHerdaPessoa() {
        Robo robo = new Robo("John Doe");

        // Testar métodos herdados de Pessoa
        assertEquals("John", robo.getPrimeiroNome());
        assertEquals("Doe", robo.getUltimoNome());
        assertEquals("JOHN DOE", robo.getNomeMaiusculo());
        assertEquals("John D. Doe", robo.getNomeAbreviado());
    }

    @Test
    public void testSetNomeValido() {
        Robo robo = new Robo("John Doe");
        robo.setNome("Jane Doe");
        assertEquals("Jane Doe", robo.getNome());
    }

    @Test
    public void testSetNomeNulo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Robo(null);
        });
    }

    @Test
    public void testSetNomeVazio() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Robo(" ");
        });
    }

    @Test
    public void testSetNomeComEspacosExtras() {
        Robo robo = new Robo(" John Doe ");
        assertEquals("John Doe", robo.getNome());
    }
}
