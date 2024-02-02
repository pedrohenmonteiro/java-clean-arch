package com.pedromonteiro.escola;

public class Email {
    
    //Value

    private String endereco;

    public Email(String endereco) {
        if (endereco == null || 
            !endereco.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
                throw new IllegalArgumentException("E-mail inválido. Digite um e-mail válido e tente novamente");
            };

        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    
}
