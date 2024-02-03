package com.pedromonteiro.escola;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.pedromonteiro.escola.aluno.Telefone;

public class TelefoneTest {
    
    @Test
    void deveCriarTelefonelSeValido() {
        var ddd = "51";
        var telefone = "912344341";
        var expected = new Telefone(ddd, telefone);
        assertNotNull(expected);
        assertEquals(expected.getNumero(), telefone);
        assertEquals(expected.getDdd(), ddd);
    }

    @Test
    void naoDeveCriarTelefoneSeInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Telefone("030", "4994944"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("11", ""));
        assertThrows(IllegalArgumentException.class, () -> new Telefone(null, "933334444"));
    }
}
