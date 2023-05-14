package io.github.mathieusoysal.puzzle_piece;

import org.junit.Test;

import io.github.mathieusoysal.BoardManager;

public class MiniSquareTest {

    @Test
    public void testMiniSquare_getShape() {
        String expected = "#______\n_______\n_______\n_______\n";
        String actual = BoardManager.toString(new MiniSquare().getShape());
        org.junit.Assert.assertEquals(expected, actual);
    }

}
