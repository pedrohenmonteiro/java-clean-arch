package com.pedromonteiro.escola.infrastructure.configuration.usecases;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pedromonteiro.escola.application.aluno.create.CreateAlunoUseCase;
import com.pedromonteiro.escola.application.aluno.create.DefaultCreateAlunoUseCase;
import com.pedromonteiro.escola.application.aluno.delete.DefaultDeleteAlunoUseCase;
import com.pedromonteiro.escola.application.aluno.delete.DeleteAlunoUseCase;
import com.pedromonteiro.escola.application.aluno.retrieve.get.DefaultGetAlunoByIdUseCase;
import com.pedromonteiro.escola.application.aluno.retrieve.get.GetAlunoByIdUseCase;
import com.pedromonteiro.escola.application.aluno.retrieve.list.DefaultListAlunosUseCase;
import com.pedromonteiro.escola.application.aluno.retrieve.list.ListAlunosUseCase;
import com.pedromonteiro.escola.application.aluno.update.DefaultUpdateAlunoUseCase;
import com.pedromonteiro.escola.application.aluno.update.UpdateAlunoUseCase;
import com.pedromonteiro.escola.domain.aluno.AlunoGateway;

@Configuration
public class AlunoUseCaseConfig {
    
    private final AlunoGateway alunoGateway;

    public AlunoUseCaseConfig(AlunoGateway alunoGateway) {
        this.alunoGateway = alunoGateway;
    }


    @Bean
    public CreateAlunoUseCase createAlunoUseCase() {
        return new DefaultCreateAlunoUseCase(alunoGateway);
    }

    @Bean
    public GetAlunoByIdUseCase getAlunoByIdUseCase() {
        return new DefaultGetAlunoByIdUseCase(alunoGateway);
    }

    @Bean
    public UpdateAlunoUseCase updateAlunoUseCase() {
        return new DefaultUpdateAlunoUseCase(alunoGateway);
    }

    @Bean
    public DeleteAlunoUseCase deleteAlunoUseCase() {
        return new DefaultDeleteAlunoUseCase(alunoGateway);
    }

    @Bean
    public ListAlunosUseCase listAlunosUseCase() {
        return new DefaultListAlunosUseCase(alunoGateway);
    }
}
