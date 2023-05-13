package io.github.mathieusoysal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BoardTest {

    @Test
    void testBpard_withEmptyBoard() {
        long board = 0b0L;
        assertEquals("_______\n_______\n_______\n_______\n", Board.toString(board));
    }

    @Test
    void testBoard_withFilledBoard() {
        long board = 0b1000000_0000000_0000000_0000000L;
        assertEquals("#______\n_______\n_______\n_______\n", Board.toString(board));
    }

}
