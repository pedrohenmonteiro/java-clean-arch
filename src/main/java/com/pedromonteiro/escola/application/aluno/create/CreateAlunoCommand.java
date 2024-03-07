package com.pedromonteiro.escola.application.aluno.create;

public record CreateAlunoCommand(
    String cpf,
    String nome,
    String email 
) {
    
    public static CreateAlunoCommand with(
        final String umCpf,
        final String umNome,
        final String email
    ) {
        return new CreateAlunoCommand(umCpf, umNome, email);
    }
}
