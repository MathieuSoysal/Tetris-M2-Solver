package io.github.mathieusoysal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.github.mathieusoysal.puzzle_piece.PuzzlePieces;

public class BoardTest {

    @Test
    public void testBpard_withEmptyBoard() {
        long board = 0b0L;
        assertEquals("_______\n_______\n_______\n_______\n", Board.toString(board));
    }

    @Test
    public void testBoard_withFilledBoard() {
        long board = 0b1000000_0000000_0000000_0000000L;
        assertEquals("#______\n_______\n_______\n_______\n", Board.toString(board));
    }

    @Test
    public void testBoard_withLastCellFilled() {
        long board = 0b0000000_0000000_0000000_0000001L;
        assertEquals("_______\n_______\n_______\n______#\n", Board.toString(board));
    }

    @Test
    public void testBoard_withAllFilledBoard() {
        long board = 0b1111111_1111111_1111111_1111111L;
        assertEquals("#######\n#######\n#######\n#######\n", Board.toString(board));
    }

    @Test
    public void testGenerateBoardFromString_withEmptyBoard() {
        String boardString = "_______\n_______\n_______\n_______\n";
        long excpectedBoard = 0b0L;
        assertEquals(excpectedBoard, Board.generateBoardFromString(boardString));
    }

    @Test
    public void testGenerateBoardFromString_withFilledBoard() {
        String boardString = "#______\n_______\n_______\n_______\n";
        long excpectedBoard = 0b1000000_0000000_0000000_0000000L;
        String excpetedBitString = Long.toBinaryString(excpectedBoard);
        assertEquals(excpetedBitString, Long.toBinaryString(Board.generateBoardFromString(boardString)));
    }

    @Test
    public void testGenerateBoardFromString_withLqstCellFilled() {
        String boardString = "_______\n_______\n_______\n______#\n";
        long excpectedBoard = 0b0000000_0000000_0000000_0000001L;
        String excpetedBitString = Long.toBinaryString(excpectedBoard);
        assertEquals(excpetedBitString, Long.toBinaryString(Board.generateBoardFromString(boardString)));
    }

    @Test
    public void testGenerateBoardFromString_withFilledBoard2() {
        String boardString = "_______\n___#___\n___#___\n______#\n";
        long excpectedBoard = 0b0000000_0001000_0001000_0000001L;
        String excpetedBitString = Long.toBinaryString(excpectedBoard);
        assertEquals(excpetedBitString, Long.toBinaryString(Board.generateBoardFromString(boardString)));
    }

    @Test
    public void testGenerateBoardFromString_withAllFilledBoard() {
        String boardString = "#######\n#######\n#######\n#######\n";
        long excpectedBoard = 0b1111111_1111111_1111111_1111111L;
        String excpetedBitString = Long.toBinaryString(excpectedBoard);
        assertEquals(excpetedBitString, Long.toBinaryString(Board.generateBoardFromString(boardString)));
    }

    @Test
    public void testCanPut_withEmptyBoard() {
        long board = 0b0L;
        long piece = 0b1000000_0000000_0000000_0000000L;
        assertTrue(Board.canPutPieceIntoBoard(board, piece));
    }

    @Test
    public void testCanPut_withFilledBoard() {
        long board = 0b1000000_0000000_0000000_0000000L;
        long piece = 0b1000000_0000000_0000000_0000000L;
        assertFalse(Board.canPutPieceIntoBoard(board, piece));
    }

    @Test
    public void testCanPut_withLastCellFilled() {
        long board = 0b0000000_0000000_1111111_1111111L;
        long piece = 0b1111111_1111111_0000000_0000000L;
        assertTrue(Board.canPutPieceIntoBoard(board, piece));
    }

    @Test
    public void testPutPieceIntoBoard_withEmptyBoard() {
        long board = 0b0L;
        long piece = PuzzlePieces.MINIS_SQUARE.getShape();
        long expectedBoard = 0b1000000_0000000_0000000_0000000L;
        assertEquals(expectedBoard, Board.putPieceIntoBoard(board, piece));
    }

    @Test
    public void testIsCompleted_withEmptyBoard() {
        long board = 0b0L;
        assertFalse(Board.isCompleted(board));
    }

    @Test
    public void testIsCompleted_withFilledBoard() {
        long board = 0b1111111_1111111_1111111_1111111L;
        assertTrue(Board.isCompleted(board));
    }

    @Test
    public void testIsCompleted_withLastCellFilled() {
        long board = 0b0000000_0000000_0000000_0000001L;
        assertFalse(Board.isCompleted(board));
    }

}
