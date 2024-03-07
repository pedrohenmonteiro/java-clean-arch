package com.pedromonteiro.escola.application.aluno.update;

public record UpdateAlunoCommand(
    String id,
    String cpf,
    String nome,
    String email
) {
    
    public static UpdateAlunoCommand with(
        final String umId,
        final String umCpf,
        final String umNome,
        final String umEmail 
    ) {
        return new UpdateAlunoCommand(umId, umCpf, umNome, umEmail);
    };
}
