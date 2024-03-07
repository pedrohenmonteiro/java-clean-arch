package com.pedromonteiro.escola.application.aluno.create;

import java.util.Objects;

import com.pedromonteiro.escola.domain.aluno.Aluno;
import com.pedromonteiro.escola.domain.aluno.AlunoGateway;
import com.pedromonteiro.escola.domain.aluno.CPF;
import com.pedromonteiro.escola.domain.aluno.Email;

public class DefaultCreateAlunoUseCase extends CreateAlunoUseCase{
    
    private AlunoGateway alunoGateway;

    public DefaultCreateAlunoUseCase(AlunoGateway alunoGateway) {
        this.alunoGateway = Objects.requireNonNull(alunoGateway);
    }

    @Override
    public CreateAlunoOutput execute(CreateAlunoCommand umCommand) {

        final var umAluno = Aluno.newAluno(
            CPF.from(umCommand.cpf()),
            umCommand.nome(),
            Email.from(umCommand.email())
        );

        return CreateAlunoOutput.from(this.alunoGateway.create(umAluno));

    }


}
