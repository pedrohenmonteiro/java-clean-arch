package com.pedromonteiro.escola.application.aluno.retrieve.list;

import java.util.Objects;
import java.util.List;

import com.pedromonteiro.escola.domain.aluno.AlunoGateway;

public class DefaultListAlunosUseCase extends ListAlunosUseCase {

    private final AlunoGateway alunoGateway;

    
    public DefaultListAlunosUseCase(AlunoGateway alunoGateway) {
        this.alunoGateway = Objects.requireNonNull(alunoGateway);
    }

    @Override
    public List<AlunoListOutput> execute() {
        return this.alunoGateway.findAll().stream().map(AlunoListOutput::from).toList();
    }
    
}
