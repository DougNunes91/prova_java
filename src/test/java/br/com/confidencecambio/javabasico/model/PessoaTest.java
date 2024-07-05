package br.com.confidencecambio.javabasico.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

    private static class PessoaTeste extends Pessoa {
        public PessoaTeste(String nome) {
            super(nome);
        }
    }

    @Test
    public void testGetPrimeiroNome() {
        Pessoa pessoa = new PessoaTeste("Douglas Nunes");
        assertEquals("Douglas", pessoa.getPrimeiroNome());
    }

    @Test
    public void testGetUltimoNome() {
        Pessoa pessoa = new PessoaTeste("Douglas Nunes");
        assertEquals("Nunes", pessoa.getUltimoNome());
    }

    @Test
    public void testGetNomeMaiusculo() {
        Pessoa pessoa = new PessoaTeste("Douglas Nunes");
        assertEquals("DOUGLAS NUNES", pessoa.getNomeMaiusculo());
    }

    @Test
    public void testGetNomeAbreviado() {
        Pessoa pessoa = new PessoaTeste("Douglas Souza Nunes");
        assertEquals("Douglas S. Nunes", pessoa.getNomeAbreviado());
    }

    @Test
    public void testGetNomeAbreviadoNomeSimples() {
        Pessoa pessoa = new PessoaTeste("Douglas");
        assertEquals("Douglas", pessoa.getNomeAbreviado());
    }

    @Test
    public void testSetNomeValido() {
        Pessoa pessoa = new PessoaTeste("Douglas Nunes");
        pessoa.setNome("Jane Nunes");
        assertEquals("Jane Nunes", pessoa.getNome());
    }

    @Test
    public void testSetNomeNulo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new PessoaTeste(null);
        });
    }

    @Test
    public void testSetNomeVazio() {
        assertThrows(IllegalArgumentException.class, () -> {
            new PessoaTeste(" ");
        });
    }

    @Test
    public void testSetNomeComEspacosExtras() {
        Pessoa pessoa = new PessoaTeste(" Douglas Nunes ");
        assertEquals("Douglas Nunes", pessoa.getNome());
    }
}