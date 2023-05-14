package io.github.mathieusoysal.puzzle_piece;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.mathieusoysal.Board;

public class StickTest {

    @Test
    public void testStick_getShape() {
        assertEquals("#______\n#______\n#______\n_______\n", Board.toString(new Stick().getShape()));
    }

}
