package br.com.confidencecambio.javabasico.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    public void testClienteHerdaPessoa() {
        Cliente cliente = new Cliente("John Doe");

        // Testar métodos herdados de Pessoa
        assertEquals("John", cliente.getPrimeiroNome());
        assertEquals("Doe", cliente.getUltimoNome());
        assertEquals("JOHN DOE", cliente.getNomeMaiusculo());
        assertEquals("John D. Doe", cliente.getNomeAbreviado());
    }

    @Test
    public void testSetNomeValido() {
        Cliente cliente = new Cliente("John Doe");
        cliente.setNome("Jane Doe");
        assertEquals("Jane Doe", cliente.getNome());
    }

    @Test
    public void testSetNomeNulo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Cliente(null);
        });
    }

    @Test
    public void testSetNomeVazio() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Cliente(" ");
        });
    }

    @Test
    public void testSetNomeComEspacosExtras() {
        Cliente cliente = new Cliente(" John Doe ");
        assertEquals("John Doe", cliente.getNome());
    }
}
