package com.pedromonteiro.escola.infrastructure.aluno;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pedromonteiro.escola.domain.aluno.Aluno;
import com.pedromonteiro.escola.domain.aluno.AlunoGateway;
import com.pedromonteiro.escola.domain.aluno.AlunoID;

@Service
public class AlunoMySQLGateway implements AlunoGateway{

    private final AlunoRepository alunoRepository;


    public AlunoMySQLGateway(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @Override
    public Aluno create(final Aluno umAluno) {
        return save(umAluno);
    }

    @Override
    public Aluno update(final Aluno umAluno) {
        return save(umAluno);
    }

    @Override
    public Optional<Aluno> findById(final AlunoID umId) {
        return this.alunoRepository.findById(umId.getValue()).map(jpaEntity -> jpaEntity.toAggregate());
    }

    @Override
    public void deleteById(final AlunoID umId) {
        this.alunoRepository.deleteById(umId.getValue());
    }

    @Override
    public List<Aluno> findAll() {
        return this.alunoRepository.findAll().stream().map(jpaEntity -> jpaEntity.toAggregate()).toList();
    }


    private Aluno save(final Aluno umAluno) {
        return this.alunoRepository.save(AlunoJpaEntity.from(umAluno)).toAggregate();
    }
    
}
