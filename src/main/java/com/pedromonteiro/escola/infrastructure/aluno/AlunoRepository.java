package com.pedromonteiro.escola.infrastructure.aluno;

import org.springframework.data.jpa.repository.JpaRepository;


public interface AlunoRepository extends JpaRepository<AlunoJpaEntity, String>{
    
}
