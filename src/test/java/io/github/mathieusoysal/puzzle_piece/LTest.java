package io.github.mathieusoysal.puzzle_piece;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.mathieusoysal.BoardManager;

public class LTest {

    @Test
    public void testL_getShape() {
        assertEquals("#______\n##_____\n_______\n_______\n", BoardManager.toString(new L().getShape()));
    }

}
