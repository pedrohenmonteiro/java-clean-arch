package com.pedromonteiro.escola.application.aluno;

import com.pedromonteiro.escola.domain.aluno.CPF;
import com.pedromonteiro.escola.domain.aluno.Email;

public record CreateAlunoCommand(
    CPF cpf,
    String nome,
    Email email 
) {
    
    public static CreateAlunoCommand with(
        final CPF umCpf,
        final String umNome,
        final Email email
    ) {
        return new CreateAlunoCommand(umCpf, umNome, email);
    }
}
