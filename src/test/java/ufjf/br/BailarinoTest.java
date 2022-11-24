package ufjf.br;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BailarinoTest {
    @Test
    void deveRetornarConceitoAluno() {
        Bailarino bailarino = new Bailarino();
        bailarino.setExame("Distinction");

        assertEquals("Distinction", bailarino.getExame());
    }

    @Test
    void deveRetornarNotaAluno() {
        Bailarino bailarino = new Bailarino();
        bailarino.setExame("Distinction");

        assertEquals(75, bailarino.getNota());
    }

}