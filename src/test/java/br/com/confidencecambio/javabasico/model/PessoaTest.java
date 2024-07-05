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
        Pessoa pessoa = new PessoaTeste("John Doe");
        assertEquals("John", pessoa.getPrimeiroNome());
    }

    @Test
    public void testGetUltimoNome() {
        Pessoa pessoa = new PessoaTeste("John Doe");
        assertEquals("Doe", pessoa.getUltimoNome());
    }

    @Test
    public void testGetNomeMaiusculo() {
        Pessoa pessoa = new PessoaTeste("John Doe");
        assertEquals("JOHN DOE", pessoa.getNomeMaiusculo());
    }

    @Test
    public void testGetNomeAbreviado() {
        Pessoa pessoa = new PessoaTeste("John Michael Doe");
        assertEquals("John M. Doe", pessoa.getNomeAbreviado());
    }

    @Test
    public void testGetNomeAbreviadoNomeSimples() {
        Pessoa pessoa = new PessoaTeste("John");
        assertEquals("John", pessoa.getNomeAbreviado());
    }

    @Test
    public void testSetNomeValido() {
        Pessoa pessoa = new PessoaTeste("John Doe");
        pessoa.setNome("Jane Doe");
        assertEquals("Jane Doe", pessoa.getNome());
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
        Pessoa pessoa = new PessoaTeste(" John Doe ");
        assertEquals("John Doe", pessoa.getNome());
    }
}
