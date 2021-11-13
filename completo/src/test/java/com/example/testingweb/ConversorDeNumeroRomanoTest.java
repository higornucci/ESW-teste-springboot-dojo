package com.example.testingweb;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ConversorDeNumeroRomanoTest {
    
    @Test
    public void deve_entender_o_simbolo_I() {
        String simbolo = "I";
        int resultadoEsperado = 1;
        int resultadoObtido = new ConversorDeNumeroRomano().converte(simbolo);
        assertThat(resultadoObtido).isEqualTo(resultadoEsperado);
    }

    @Test
    public void deve_entender_o_simbolo_V() {
        String simbolo = "V";
        int resultadoEsperado = 5;
        int resultadoObtido = new ConversorDeNumeroRomano().converte(simbolo);
        assertThat(resultadoObtido).isEqualTo(resultadoEsperado);
    }
}
