package com.pedromonteiro.escola.domain.aluno;

import java.util.Optional;
import java.util.List;

public interface AlunoGateway {

    Aluno create(Aluno umAluno);
    
    Aluno update(Aluno umAluno);
    
    Optional<Aluno> findById(AlunoID umId);
    
    void deleteById(AlunoID umId);

    List<Aluno> findAll();

}
