package com.pedromonteiro.escola.application.aluno;

import com.pedromonteiro.escola.domain.aluno.Aluno;
import com.pedromonteiro.escola.domain.aluno.AlunoID;
import com.pedromonteiro.escola.domain.aluno.CPF;
import com.pedromonteiro.escola.domain.aluno.Email;

public record CreateAlunoOutput(
    AlunoID id,
    CPF cpf,
    String nome,
    Email email
) {
    
    public static CreateAlunoOutput from(final Aluno umAluno) {
        return new CreateAlunoOutput(
            umAluno.getId(),
            umAluno.getCpf(),
            umAluno.getNome(),
            umAluno.getEmail()
        );
    }
}
