package com.pedromonteiro.escola.application.aluno.retrieve.get;

import com.pedromonteiro.escola.domain.aluno.AlunoGateway;
import com.pedromonteiro.escola.domain.aluno.AlunoID;

public class DefaultGetAlunoByIdUseCase extends GetAlunoByIdUseCase {

    private final AlunoGateway alunoGateway;

    public DefaultGetAlunoByIdUseCase(AlunoGateway alunoGateway) {
        this.alunoGateway = alunoGateway;
    }

    @Override
    public AlunoOutput execute(String anIn) {

    final var alunoId = AlunoID.from(anIn);

    return this.alunoGateway.findById(alunoId).map(AlunoOutput::from).orElseThrow();
    }
    
}
