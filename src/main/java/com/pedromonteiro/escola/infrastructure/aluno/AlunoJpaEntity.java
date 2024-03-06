package com.pedromonteiro.escola.infrastructure.aluno;

import com.pedromonteiro.escola.domain.aluno.Aluno;
import com.pedromonteiro.escola.domain.aluno.AlunoID;
import com.pedromonteiro.escola.domain.aluno.CPF;
import com.pedromonteiro.escola.domain.aluno.Email;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Aluno")
@Table(name = "aluno")
public class AlunoJpaEntity {
    
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "cpf", nullable = false, length = 9)
    private String cpf;

    @Column(name = "nome", nullable = false)
    private String nome;


    @Column(name = "email", nullable = false)
    private String email;

    

    public AlunoJpaEntity() {
    }

    

    private AlunoJpaEntity(final String id, final String cpf, final String nome, final String email) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }



    public static AlunoJpaEntity from(final Aluno umAluno) {
        return new AlunoJpaEntity(
            umAluno.getId().getValue(),
            umAluno.getCpf().getNumero(),
            umAluno.getNome(),
            umAluno.getEmail().getEndereco()
        );
    }

    public Aluno toAggregate() {
        return Aluno.with(
            AlunoID.from(getId()),
            CPF.from(cpf),
            getNome(),
            Email.from(getEmail())
        );
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public String getCPF() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    
}
