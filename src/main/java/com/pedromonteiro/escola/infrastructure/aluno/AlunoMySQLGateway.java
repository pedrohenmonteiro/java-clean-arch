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
    public Aluno create(Aluno umAluno) {
        return save(umAluno);
    }

    @Override
    public Aluno update(Aluno umAluno) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Optional<Aluno> findById(AlunoID umId) {
        return this.alunoRepository.findById(umId.getValue()).map(jpa -> jpa.toAggregate());
    }

    @Override
    public void deleteById(AlunoID umId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

    @Override
    public List<Aluno> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }


    private Aluno save(final Aluno umAluno) {
        return this.alunoRepository.save(AlunoJpaEntity.from(umAluno)).toAggregate();
    }
    
}
