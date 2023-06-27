package test.calculadora;

import org.example.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void soma() {
        int resultado = Calculadora.soma(2, 2);
        Assertions.assertEquals(4, resultado);
    }

    @Test
    void subtracao() {
        int resultado = Calculadora.subtracao(2, 2);
        Assertions.assertEquals(0, resultado);
    }

    @Test
    void multiplicacao() {
        int resultado = Calculadora.multiplicacao(4, 3);
        Assertions.assertEquals(12, resultado);
    }

    @Test
    void divisao() {
        int resultado = Calculadora.divisao(9, 3);
        Assertions.assertEquals(3, resultado);
    }
}