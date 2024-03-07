package com.pedromonteiro.escola.application.aluno.create;

import com.pedromonteiro.escola.domain.aluno.Aluno;

public record CreateAlunoOutput(
    String id,
    String cpf,
    String nome,
    String email
) {
    
    public static CreateAlunoOutput from(final Aluno umAluno) {
        return new CreateAlunoOutput(
            umAluno.getId().getValue(),
            umAluno.getCpf().getNumero(),
            umAluno.getNome(),
            umAluno.getEmail().getEndereco()
        );
    }
}
