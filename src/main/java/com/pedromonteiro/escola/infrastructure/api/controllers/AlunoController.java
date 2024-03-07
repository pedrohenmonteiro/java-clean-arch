package com.pedromonteiro.escola.infrastructure.api.controllers;

import java.net.URI;
import java.util.Objects;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.pedromonteiro.escola.application.aluno.create.CreateAlunoCommand;
import com.pedromonteiro.escola.application.aluno.create.CreateAlunoOutput;
import com.pedromonteiro.escola.application.aluno.create.CreateAlunoUseCase;
import com.pedromonteiro.escola.infrastructure.api.AlunoApi;

@RestController
public class AlunoController implements AlunoApi {

    private final CreateAlunoUseCase createAlunoUseCase;

    

    public AlunoController(final CreateAlunoUseCase createAlunoUseCase) {
        this.createAlunoUseCase = Objects.requireNonNull(createAlunoUseCase);
    }



    @Override
    public ResponseEntity<CreateAlunoOutput> create(CreateAlunoCommand input) {

        var output = createAlunoUseCase.execute(input);

        return ResponseEntity.created(URI.create("/alunos/" + output.id())).body(output);
    }
    
}
