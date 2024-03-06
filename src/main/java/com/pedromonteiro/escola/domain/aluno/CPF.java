package com.pedromonteiro.escola.domain.aluno;

import com.pedromonteiro.escola.domain.ValueObject;

public class CPF extends ValueObject {
    
    private String numero;

    public CPF(String numero) {
        if(numero == null || !numero.matches("[0-9]{3}\\.?[0-9]{3}\\.?[0-9]{3}\\-?[0-9]{2}")) {
            throw new IllegalArgumentException("CPF inválido. Digite um CPF válido e tente novamente");
        }
        this.numero = numero;
    }

    public static CPF from(String cpf) {
        return new CPF(cpf);
    }

    public String getNumero() {
        return numero;
    }
    

}
