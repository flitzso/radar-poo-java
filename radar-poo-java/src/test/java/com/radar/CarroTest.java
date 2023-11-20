package com.radar;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarroTest {

    // TESTANDO A PARTE DE AUTUAÇÃO
    @Test
    void testRadarAutuado() {
        // Arrange
        Carro carro = new Carro();
        carro.vel = 50;

        // Act
        carro.radar();
    }

    // TESTANDO A PARTE DE NÃO AUTUAÇÃO
    @Test
    void testRadarNaoAutuado() {
        // Arrange
        Carro carro = new Carro();
        carro.vel = 30;

        // Act
        carro.radar();
    }
}
