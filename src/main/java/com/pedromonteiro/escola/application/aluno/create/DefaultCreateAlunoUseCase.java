package com.pedromonteiro.escola.application.aluno.create;

import com.pedromonteiro.escola.domain.aluno.Aluno;
import com.pedromonteiro.escola.domain.aluno.AlunoGateway;

public class DefaultCreateAlunoUseCase extends CreateAlunoUseCase{
    
    private AlunoGateway alunoGateway;

    public DefaultCreateAlunoUseCase(AlunoGateway alunoGateway) {
        this.alunoGateway = alunoGateway;
    }

    @Override
    public CreateAlunoOutput execute(CreateAlunoCommand umCommand) {

        final var umAluno = Aluno.newAluno(
            umCommand.cpf(),
            umCommand.nome(),
            umCommand.email()
        );

        return CreateAlunoOutput.from(this.alunoGateway.create(umAluno));

    }


}
