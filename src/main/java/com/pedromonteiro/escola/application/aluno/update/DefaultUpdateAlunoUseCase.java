package com.pedromonteiro.escola.application.aluno.update;

import java.util.Objects;

import com.pedromonteiro.escola.domain.aluno.AlunoGateway;
import com.pedromonteiro.escola.domain.aluno.AlunoID;
import com.pedromonteiro.escola.domain.aluno.CPF;
import com.pedromonteiro.escola.domain.aluno.Email;

public class DefaultUpdateAlunoUseCase extends UpdateAlunoUseCase{

    private final AlunoGateway alunoGateway;

    public DefaultUpdateAlunoUseCase(AlunoGateway alunoGateway) {
        this.alunoGateway = Objects.requireNonNull(alunoGateway);
    }

    @Override
    public UpdateAlunoOutput execute(UpdateAlunoCommand umCommand) {
        var anId = AlunoID.from(umCommand.id());
        var umCpf = CPF.from(umCommand.cpf());
        var umNome = umCommand.nome();
        var umEmail = Email.from(umCommand.email());


        final var umAluno = alunoGateway.findById(anId).orElseThrow();

        umAluno.update(umCpf, umNome, umEmail);

        return UpdateAlunoOutput.from(this.alunoGateway.update(umAluno));
    }
    
}
