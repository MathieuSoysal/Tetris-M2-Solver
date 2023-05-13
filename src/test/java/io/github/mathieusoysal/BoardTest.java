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

    @Test
    void testGenerateBoardFromString_withEmptyBoard() {
        String boardString = "_______\n_______\n_______\n_______\n";
        long excpectedBoard = 0b0L;
        assertEquals(excpectedBoard, Board.generateBoardFromString(boardString));
    }

    @Test
    void testGenerateBoardFromString_withFilledBoard() {
        String boardString = "#______\n_______\n_______\n_______\n";
        long excpectedBoard = 0b1000000_0000000_0000000_0000000L;
        String excpetedBitString = Long.toBinaryString(excpectedBoard);
        assertEquals(excpetedBitString, Long.toBinaryString(Board.generateBoardFromString(boardString)));
    }

}
