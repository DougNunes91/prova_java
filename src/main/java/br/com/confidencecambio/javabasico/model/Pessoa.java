package br.com.confidencecambio.javabasico.model;

public abstract class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio");
        }
        this.nome = nome.trim();
    }

    public String getPrimeiroNome() {
        String[] partes = nome.split(" ");
        return partes[0];
    }

    public String getUltimoNome() {
        int primeiroEspaco = nome.indexOf(' ');
        if (primeiroEspaco == -1) {
            return nome;
        }
        return nome.substring(primeiroEspaco + 1);
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }

    public String getNomeAbreviado() {
        String[] partes = nome.split(" ");
        if (partes.length == 1) {
            return partes[0];
        } else if (partes.length == 2) {
            return partes[0] + " " + partes[1].charAt(0) + ".";
        } else {
            StringBuilder abreviado = new StringBuilder();
            abreviado.append(partes[0]);
            for (int i = 1; i < partes.length - 1; i++) {
                abreviado.append(" ").append(partes[i].charAt(0)).append(".");
            }
            abreviado.append(" ").append(partes[partes.length - 1]);
            return abreviado.toString();
        }
    }
}