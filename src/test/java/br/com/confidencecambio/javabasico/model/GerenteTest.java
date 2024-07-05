package br.com.confidencecambio.javabasico.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GerenteTest {

    @Test
    public void testGerenteHerdaPessoa() {
        Gerente gerente = new Gerente("Douglas Nunes");

        assertEquals("Douglas", gerente.getPrimeiroNome());
        assertEquals("Nunes", gerente.getUltimoNome());
        assertEquals("DOUGLAS NUNES", gerente.getNomeMaiusculo());
        assertEquals("Douglas N.", gerente.getNomeAbreviado());
    }

    @Test
    public void testGerenteHerdaPessoaNomeComposto() {
        Gerente gerente = new Gerente("Douglas Nunes Souza");

        // Testar métodos herdados de Pessoa
        assertEquals("Douglas", gerente.getPrimeiroNome());
        assertEquals("Nunes Souza", gerente.getUltimoNome());
        assertEquals("DOUGLAS NUNES SOUZA", gerente.getNomeMaiusculo());
        assertEquals("Douglas N. Souza", gerente.getNomeAbreviado());
    }

    @Test
    public void testGerenteHerdaPessoaNomeDuasPartes() {
        Gerente gerente = new Gerente("Douglas Nunes");

        // Testar métodos herdados de Pessoa
        assertEquals("Douglas", gerente.getPrimeiroNome());
        assertEquals("Nunes", gerente.getUltimoNome());
        assertEquals("DOUGLAS NUNES", gerente.getNomeMaiusculo());
        assertEquals("Douglas N.", gerente.getNomeAbreviado());
    }

    @Test
    public void testSetNomeValido() {
        Gerente gerente = new Gerente("Douglas Nunes");
        gerente.setNome("Jane Nunes");
        assertEquals("Jane Nunes", gerente.getNome());
    }

    @Test
    public void testSetNomeNulo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Gerente(null);
        });
    }

    @Test
    public void testSetNomeVazio() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Gerente(" ");
        });
    }

    @Test
    public void testSetNomeComEspacosExtras() {
        Gerente gerente = new Gerente(" Douglas Nunes ");
        assertEquals("Douglas Nunes", gerente.getNome());
    }
}