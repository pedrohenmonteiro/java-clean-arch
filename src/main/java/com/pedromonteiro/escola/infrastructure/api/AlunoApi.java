package com.pedromonteiro.escola.infrastructure.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pedromonteiro.escola.application.aluno.create.CreateAlunoCommand;
import com.pedromonteiro.escola.application.aluno.create.CreateAlunoOutput;

@RequestMapping(path = "alunos")
public interface AlunoApi {

    @PostMapping
    ResponseEntity<CreateAlunoOutput> create(@RequestBody CreateAlunoCommand input);
    
}

