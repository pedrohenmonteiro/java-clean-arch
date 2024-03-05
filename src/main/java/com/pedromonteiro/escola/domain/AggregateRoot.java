package com.pedromonteiro.escola.domain;

public abstract class AggregateRoot<ID extends Identifier> extends Entity<ID>{
    
    public AggregateRoot(final ID id) {
        super(id);
    }
}
