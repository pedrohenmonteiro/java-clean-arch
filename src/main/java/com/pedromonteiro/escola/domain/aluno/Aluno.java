package com.pedromonteiro.escola.domain.aluno;

import java.util.ArrayList;
import java.util.List;

import com.pedromonteiro.escola.domain.AggregateRoot;

public class Aluno extends AggregateRoot<AlunoID> {
    
    private CPF cpf;
    private String nome;
    private Email email;
    
    private List<Telefone> telefones = new ArrayList<>();


    private Aluno(AlunoID id ,CPF cpf, String nome, Email email) {
        super(id);
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public static Aluno newAluno(CPF umCpf, String umNome, Email umEmail) {
        return new Aluno(AlunoID.unique(), umCpf, umNome, umEmail);
    }

    public static Aluno with(AlunoID id, CPF cpf, String nome, Email email) {
        return new Aluno(id, cpf, nome, email);
    }


    public Aluno update(final CPF umCpf, final String umNome, final Email umEmail) {
        this.cpf = umCpf;
        this.nome = umNome;
        this.email = umEmail;

        return this;
    }

    public void adicionarTelefone(String ddd, String numero) {
        this.telefones.add(new Telefone(ddd, numero));
    }

    public CPF getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public Email getEmail() {
        return email;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }
    

    
}
