package br.com.confidencecambio.javabasico.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RoboTest {

    @Test
    public void testRoboHerdaPessoa() {
        Robo robo = new Robo("Douglas Nunes");

        assertEquals("Douglas", robo.getPrimeiroNome());
        assertEquals("Nunes", robo.getUltimoNome());
        assertEquals("DOUGLAS NUNES", robo.getNomeMaiusculo());
        assertEquals("Douglas N.", robo.getNomeAbreviado());
    }

    @Test
    public void testRoboHerdaPessoaNomeComposto() {
        Robo robo = new Robo("Douglas Nunes Souza");

        // Testar métodos herdados de Pessoa
        assertEquals("Douglas", robo.getPrimeiroNome());
        assertEquals("Nunes Souza", robo.getUltimoNome());
        assertEquals("DOUGLAS NUNES SOUZA", robo.getNomeMaiusculo());
        assertEquals("Douglas N. Souza", robo.getNomeAbreviado());
    }

    @Test
    public void testRoboHerdaPessoaNomeDuasPartes() {
        Robo robo = new Robo("Douglas Nunes");

        // Testar métodos herdados de Pessoa
        assertEquals("Douglas", robo.getPrimeiroNome());
        assertEquals("Nunes", robo.getUltimoNome());
        assertEquals("DOUGLAS NUNES", robo.getNomeMaiusculo());
        assertEquals("Douglas N.", robo.getNomeAbreviado());
    }

    @Test
    public void testSetNomeValido() {
        Robo robo = new Robo("Douglas Nunes");
        robo.setNome("Jane Nunes");
        assertEquals("Jane Nunes", robo.getNome());
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
        Robo robo = new Robo(" Douglas Nunes ");
        assertEquals("Douglas Nunes", robo.getNome());
    }
}