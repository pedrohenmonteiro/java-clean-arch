package com.pedromonteiro.escola.aluno;

public class CPF {
    
    private String numero;

    public CPF(String numero) {
        if(numero == null || !numero.matches("[0-9]{3}\\.?[0-9]{3}\\.?[0-9]{3}\\-?[0-9]{2}")) {
            throw new IllegalArgumentException("CPF inválido. Digite um CPF válido e tente novamente");
        }
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }
    

}
