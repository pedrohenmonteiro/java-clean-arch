package com.pedromonteiro.escola;

public class CPF {
    
    private String numero;

    public CPF(String numero) {
        if(numero == null || !numero.matches("[0-9]{3}\\.?[0-9]{3}\\.?[0-9]{3}\\-?[0-9]{2}"))
        this.numero = numero;
    }
    

}
