package br.com.confidencecambio.javabasico.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GerenteTest {

    @Test
    public void testGerenteHerdaPessoa() {
        Gerente gerente = new Gerente("John Doe");

        // Testar métodos herdados de Pessoa
        assertEquals("John", gerente.getPrimeiroNome());
        assertEquals("Doe", gerente.getUltimoNome());
        assertEquals("JOHN DOE", gerente.getNomeMaiusculo());
        assertEquals("John D. Doe", gerente.getNomeAbreviado());
    }

    @Test
    public void testSetNomeValido() {
        Gerente gerente = new Gerente("John Doe");
        gerente.setNome("Jane Doe");
        assertEquals("Jane Doe", gerente.getNome());
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
        Gerente gerente = new Gerente(" John Doe ");
        assertEquals("John Doe", gerente.getNome());
    }
}
