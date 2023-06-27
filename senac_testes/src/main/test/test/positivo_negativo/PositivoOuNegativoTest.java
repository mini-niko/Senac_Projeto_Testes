package test.positivo_negativo;

import org.example.PositivoOuNegativo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositivoOuNegativoTest {

    @Test
    void avaliaPositivo() {
        String positivo = PositivoOuNegativo.avalia(1.0);
        Assertions.assertEquals("Positivo", positivo);

        String negativo = PositivoOuNegativo.avalia(-1.0);
        Assertions.assertEquals("Negativo", negativo);

        String zero = PositivoOuNegativo.avalia(0.0);
        Assertions.assertEquals("Zero", zero);
    };

    @Test
    void avaliaNegativo() {
        String positivo = PositivoOuNegativo.avalia(1.0);
        Assertions.assertEquals("Positivo", positivo);

        String negativo = PositivoOuNegativo.avalia(-1.0);
        Assertions.assertEquals("Negativo", negativo);

        String zero = PositivoOuNegativo.avalia(0.0);
        Assertions.assertEquals("Zero", zero);
    };

    @Test
    void avaliaZero() {
        String positivo = PositivoOuNegativo.avalia(1.0);
        Assertions.assertEquals("Positivo", positivo);

        String negativo = PositivoOuNegativo.avalia(-1.0);
        Assertions.assertEquals("Negativo", negativo);

        String zero = PositivoOuNegativo.avalia(0.0);
        Assertions.assertEquals("Zero", zero);
    };
}