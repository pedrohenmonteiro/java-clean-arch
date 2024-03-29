package com.pedromonteiro.escola.infrastructure.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pedromonteiro.escola.application.aluno.create.CreateAlunoCommand;
import com.pedromonteiro.escola.application.aluno.create.CreateAlunoOutput;
import com.pedromonteiro.escola.application.aluno.retrieve.get.AlunoOutput;
import com.pedromonteiro.escola.application.aluno.retrieve.list.AlunoListOutput;
import com.pedromonteiro.escola.application.aluno.update.UpdateAlunoCommand;
import com.pedromonteiro.escola.application.aluno.update.UpdateAlunoOutput;

@RequestMapping(path = "alunos")
public interface AlunoApi {

    @PostMapping
    ResponseEntity<CreateAlunoOutput> create(@RequestBody CreateAlunoCommand input);
    
    @GetMapping(value = "{id}")
    ResponseEntity<AlunoOutput> getById(@PathVariable(name = "id") String id);

    @GetMapping
    ResponseEntity<List<AlunoListOutput>> findAll();

    @PutMapping(value = "{id}")
    ResponseEntity<UpdateAlunoOutput> updateById(@PathVariable(name = "id") String id, @RequestBody UpdateAlunoCommand input);

    @DeleteMapping(value = "{id}")
    ResponseEntity<Void> deleteById(@PathVariable(name = "id") String id);
}

