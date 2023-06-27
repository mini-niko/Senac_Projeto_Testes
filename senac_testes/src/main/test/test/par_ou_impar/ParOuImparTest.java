package test.par_ou_impar;

import org.example.ParOuImpar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParOuImparTest {

    @Test
    void par() {
        boolean x = ParOuImpar.ePar(2);
        Assertions.assertTrue(x);
    }

    @Test
    void impar() {
        boolean x = ParOuImpar.eImpar(3);
        Assertions.assertTrue(x);
    }
}