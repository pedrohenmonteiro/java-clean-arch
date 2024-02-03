package com.pedromonteiro.escola;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.pedromonteiro.escola.aluno.Email;

public class EmailTest {
    
    @Test
    void deveCriarEmailSeValido() {
        var email = "email@valido.com";
        var expected = new Email(email);
        assertNotNull(expected);
        assertEquals(expected.getEndereco(), email);
    }

    @Test
    void naoDeveCriarEmailSeInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Email(null));
        assertThrows(IllegalArgumentException.class, () -> new Email(""));
        assertThrows(IllegalArgumentException.class, () -> new Email("teste.teste.com"));
    }
}
