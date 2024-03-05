package com.pedromonteiro.escola.domain.aluno;

import java.util.UUID;

import com.pedromonteiro.escola.domain.Identifier;

public class AlunoID extends Identifier{

    private final String value;


    private AlunoID(final String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }

    public static AlunoID unique() {
        return AlunoID.from(UUID.randomUUID());
    }

    public static AlunoID from(String anId) {
        return new AlunoID(anId);
    }

    public static AlunoID from(UUID anId) {
        return new AlunoID(anId.toString().toLowerCase());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AlunoID other = (AlunoID) obj;
        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }

    
    
}
