package io.github.mathieusoysal.puzzle_piece;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.mathieusoysal.BoardManager;

public class InversedLTest {

    @Test
    public void testInversedL_getShape() {
        String expected = "##_____\n_#_____\n_______\n_______\n";
        String actual = BoardManager.toString(new InversedL().getShape());
        assertEquals(expected, actual);
    }

}
