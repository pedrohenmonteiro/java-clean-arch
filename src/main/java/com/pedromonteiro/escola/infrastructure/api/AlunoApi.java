package com.pedromonteiro.escola.infrastructure.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pedromonteiro.escola.application.aluno.create.CreateAlunoCommand;
import com.pedromonteiro.escola.application.aluno.create.CreateAlunoOutput;
import com.pedromonteiro.escola.application.aluno.retrieve.get.AlunoOutput;

@RequestMapping(path = "alunos")
public interface AlunoApi {

    @PostMapping
    ResponseEntity<CreateAlunoOutput> create(@RequestBody CreateAlunoCommand input);
    
    @GetMapping(value = "{id}")
    ResponseEntity<AlunoOutput> getById(@PathVariable(name = "id") String id);
}

