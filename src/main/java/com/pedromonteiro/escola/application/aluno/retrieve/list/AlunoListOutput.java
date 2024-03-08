package com.pedromonteiro.escola.application.aluno.retrieve.list;

import com.pedromonteiro.escola.domain.aluno.Aluno;

public record AlunoListOutput(
    String id,
    String cpf,
    String nome,
    String email
) {
    public static AlunoListOutput from(final Aluno umAluno) {
        return new AlunoListOutput(
            umAluno.getId().getValue(),
            umAluno.getCpf().getNumero(),
            umAluno.getNome(),
            umAluno.getEmail().getEndereco()
        );
    };

}
