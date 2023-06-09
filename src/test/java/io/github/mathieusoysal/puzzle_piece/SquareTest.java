package io.github.mathieusoysal.puzzle_piece;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.mathieusoysal.BoardManager;

public class SquareTest {

    @Test
    public void testSquare_getShape() {
        String expected = "##_____\n##_____\n_______\n_______\n";
        String actual = BoardManager.toString(new Square().getShape());
        assertEquals(expected, actual);
    }

}
