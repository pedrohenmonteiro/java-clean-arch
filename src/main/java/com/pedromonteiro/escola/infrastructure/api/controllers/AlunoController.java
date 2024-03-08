package com.pedromonteiro.escola.infrastructure.api.controllers;

import java.net.URI;
import java.util.List;
import java.util.Objects;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.pedromonteiro.escola.application.aluno.create.CreateAlunoCommand;
import com.pedromonteiro.escola.application.aluno.create.CreateAlunoOutput;
import com.pedromonteiro.escola.application.aluno.create.CreateAlunoUseCase;
import com.pedromonteiro.escola.application.aluno.delete.DeleteAlunoUseCase;
import com.pedromonteiro.escola.application.aluno.retrieve.get.AlunoOutput;
import com.pedromonteiro.escola.application.aluno.retrieve.get.GetAlunoByIdUseCase;
import com.pedromonteiro.escola.application.aluno.retrieve.list.AlunoListOutput;
import com.pedromonteiro.escola.application.aluno.retrieve.list.ListAlunosUseCase;
import com.pedromonteiro.escola.application.aluno.update.UpdateAlunoCommand;
import com.pedromonteiro.escola.application.aluno.update.UpdateAlunoOutput;
import com.pedromonteiro.escola.application.aluno.update.UpdateAlunoUseCase;
import com.pedromonteiro.escola.infrastructure.api.AlunoApi;

@RestController
public class AlunoController implements AlunoApi {

    private final CreateAlunoUseCase createAlunoUseCase;
    private final GetAlunoByIdUseCase getAlunoByIdUseCase;
    private final UpdateAlunoUseCase updateAlunoUseCase;
    private final DeleteAlunoUseCase deleteAlunoUseCase;
    private final ListAlunosUseCase listAlunosUseCase;

    

    public AlunoController(
        final CreateAlunoUseCase createAlunoUseCase,
        final GetAlunoByIdUseCase getAlunoByIdUseCase,
        final UpdateAlunoUseCase updateAlunoUseCase,
        final DeleteAlunoUseCase deleteAlunoUseCase,
        final ListAlunosUseCase listAlunosUseCase
        ) {
        this.createAlunoUseCase = Objects.requireNonNull(createAlunoUseCase);
        this.getAlunoByIdUseCase = Objects.requireNonNull(getAlunoByIdUseCase);
        this.updateAlunoUseCase = Objects.requireNonNull(updateAlunoUseCase);
        this.deleteAlunoUseCase = Objects.requireNonNull(deleteAlunoUseCase);
        this.listAlunosUseCase = Objects.requireNonNull(listAlunosUseCase);
    }



    @Override
    public ResponseEntity<CreateAlunoOutput> create(CreateAlunoCommand input) {

        var output = createAlunoUseCase.execute(input);

        return ResponseEntity.created(URI.create("/alunos/" + output.id())).body(output);
    }



    @Override
    public ResponseEntity<AlunoOutput> getById(String id) {
        var output = getAlunoByIdUseCase.execute(id);

        return ResponseEntity.ok(output);
    }



    @Override
    public ResponseEntity<UpdateAlunoOutput> updateById(String id, UpdateAlunoCommand input) {
        var aCommand = new UpdateAlunoCommand(id, input.cpf(), input.nome(), input.email());

        var output = updateAlunoUseCase.execute(aCommand);

        return ResponseEntity.ok(output);

    }



    @Override
    public ResponseEntity<Void> deleteById(String id) {
        deleteAlunoUseCase.execute(id);

        return ResponseEntity.noContent().build();
    }



    @Override
    public ResponseEntity<List<AlunoListOutput>> findAll() {
        var output = listAlunosUseCase.execute();
        return ResponseEntity.ok(output);
    }

    



}
