package com.pedromonteiro.escola;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CPFTest {

    @Test
    void deveCriarCPFSeValido() {
        var cpf = "012.345.678-91";
        var expected = new CPF(cpf);
        assertNotNull(expected);
        assertEquals(expected.getNumero(), cpf);
        assertDoesNotThrow(() -> new CPF("01234567891"));
    }

    @Test
    void naoDeveCriarUmCPFSeInvalido() {

        assertThrows(IllegalArgumentException.class, () -> new CPF("011.032.941-943"));
        assertThrows(IllegalArgumentException.class, () -> new CPF("011.032.941--3"));
        assertThrows(IllegalArgumentException.class, () -> new Email(""));
        assertThrows(IllegalArgumentException.class, () -> new CPF(null));
    }

}
