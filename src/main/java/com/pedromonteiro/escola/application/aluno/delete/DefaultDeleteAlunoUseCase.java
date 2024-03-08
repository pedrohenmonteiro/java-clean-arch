package com.pedromonteiro.escola.application.aluno.delete;

import java.util.Objects;

import com.pedromonteiro.escola.domain.aluno.AlunoGateway;
import com.pedromonteiro.escola.domain.aluno.AlunoID;

public class DefaultDeleteAlunoUseCase extends DeleteAlunoUseCase{

    private final AlunoGateway alunoGateway;

    public DefaultDeleteAlunoUseCase(final AlunoGateway alunoGateway) {
        this.alunoGateway = Objects.requireNonNull(alunoGateway);
    }

    @Override
    public void execute(String anIn) {
    this.alunoGateway.deleteById(AlunoID.from(anIn));
    }
    
}
