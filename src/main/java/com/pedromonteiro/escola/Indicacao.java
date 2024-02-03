package com.pedromonteiro.escola;

import java.time.LocalDateTime;

import com.pedromonteiro.escola.Aluno.Aluno;

public class Indicacao {

    private Aluno indicante;
    private Aluno indicado;
    private LocalDateTime dataIndicacao;


    public Indicacao(Aluno indicante, Aluno indicado) {
        this.indicante = indicante;
        this.indicado = indicado;
        this.dataIndicacao = LocalDateTime.now();
    }


    public Aluno getIndicante() {
        return indicante;
    }


    public Aluno getIndicado() {
        return indicado;
    }


    public LocalDateTime getDataIndicacao() {
        return dataIndicacao;
    }
    
}
