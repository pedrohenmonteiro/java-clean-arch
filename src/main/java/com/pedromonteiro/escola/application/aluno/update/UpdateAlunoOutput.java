package com.pedromonteiro.escola.application.aluno.update;

import com.pedromonteiro.escola.domain.aluno.Aluno;

public record UpdateAlunoOutput(
    String id,
    String cpf,
    String nome,
    String email
) {
    
    public static UpdateAlunoOutput from(final Aluno umAluno) {
        return new UpdateAlunoOutput(
            umAluno.getId().getValue(),
            umAluno.getCpf().getNumero(),
            umAluno.getNome(),
            umAluno.getEmail().getEndereco()
        );
    }
}
