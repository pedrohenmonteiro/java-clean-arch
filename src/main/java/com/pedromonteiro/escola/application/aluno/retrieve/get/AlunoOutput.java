package com.pedromonteiro.escola.application.aluno.retrieve.get;

import com.pedromonteiro.escola.domain.aluno.Aluno;

public record AlunoOutput(
    String id,
    String cpf,
    String nome,
    String email
) {
    
    public static AlunoOutput from(final Aluno umAluno) {
        return new AlunoOutput(
            umAluno.getId().getValue(),
            umAluno.getCpf().getNumero(),
            umAluno.getNome(),
            umAluno.getEmail().getEndereco()
        );
    }
}
