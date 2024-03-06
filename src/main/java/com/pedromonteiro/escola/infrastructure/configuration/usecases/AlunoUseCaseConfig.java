package com.pedromonteiro.escola.infrastructure.configuration.usecases;

import java.util.Objects;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pedromonteiro.escola.application.aluno.create.CreateAlunoUseCase;
import com.pedromonteiro.escola.application.aluno.create.DefaultCreateAlunoUseCase;
import com.pedromonteiro.escola.domain.aluno.AlunoGateway;

@Configuration
public class AlunoUseCaseConfig {
    
    private final AlunoGateway alunoGateway;


    public AlunoUseCaseConfig(AlunoGateway alunoGateway) {
        this.alunoGateway = Objects.requireNonNull(alunoGateway);
    }

    @Bean
    public CreateAlunoUseCase createAlunoUseCase() {
        return new DefaultCreateAlunoUseCase(alunoGateway);
    }
}
