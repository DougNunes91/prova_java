package br.com.confidencecambio.javabasico.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    public void testClienteHerdaPessoa() {
        Cliente cliente = new Cliente("Douglas Nunes");

        assertEquals("Douglas", cliente.getPrimeiroNome());
        assertEquals("Nunes", cliente.getUltimoNome());
        assertEquals("DOUGLAS NUNES", cliente.getNomeMaiusculo());
        assertEquals("Douglas N.", cliente.getNomeAbreviado());
    }

    @Test
    public void testClienteHerdaPessoaNomeComposto() {
        Cliente cliente = new Cliente("Douglas Nunes Souza");

        // Testar métodos herdados de Pessoa
        assertEquals("Douglas", cliente.getPrimeiroNome());
        assertEquals("Nunes Souza", cliente.getUltimoNome());
        assertEquals("DOUGLAS NUNES SOUZA", cliente.getNomeMaiusculo());
        assertEquals("Douglas N. Souza", cliente.getNomeAbreviado());
    }

    @Test
    public void testClienteHerdaPessoaNomeDuasPartes() {
        Cliente cliente = new Cliente("Douglas Nunes");

        // Testar métodos herdados de Pessoa
        assertEquals("Douglas", cliente.getPrimeiroNome());
        assertEquals("Nunes", cliente.getUltimoNome());
        assertEquals("DOUGLAS NUNES", cliente.getNomeMaiusculo());
        assertEquals("Douglas N.", cliente.getNomeAbreviado());
    }

    @Test
    public void testSetNomeValido() {
        Cliente cliente = new Cliente("Douglas Nunes");
        cliente.setNome("Jane Nunes");
        assertEquals("Jane Nunes", cliente.getNome());
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
        Cliente cliente = new Cliente(" Douglas Nunes ");
        assertEquals("Douglas Nunes", cliente.getNome());
    }
}