package com.pedromonteiro.escola.domain.aluno;

public class Telefone {
    
    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {
        if (ddd == null || !ddd.matches("(?:(^\\+\\d{2})?)(?:([1-9]{2})|([0-9]{3})?)")) {
            throw new IllegalArgumentException("DDD inválido. Digite um DDD válido e tente novamente");
        }

        if (numero == null || !numero.matches("(\\d{4,5})(\\d{4})")) {
            throw new IllegalArgumentException("Telefone inválido. Digite um telefone válido e tente novamente");
        }

        this.ddd = ddd;
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }

    


}
