package io.github.mathieusoysal.puzzle_piece;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.mathieusoysal.BoardManager;

public class ZTest {

    @Test
    public void testZ_getShape() {
        assertEquals("##_____\n_##____\n_______\n_______\n", BoardManager.toString(new Z().getShape()));
    }

}
