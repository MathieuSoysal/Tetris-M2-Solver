package io.github.mathieusoysal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.github.mathieusoysal.puzzle_piece.PuzzlePieces;

public class BoardManagerTest {

    @Test
    public void testBpard_withEmptyBoard() {
        int board = 0b0;
        assertEquals("_______\n_______\n_______\n_______\n", BoardManager.toString(board));
    }

    @Test
    public void testBoard_withFilledBoard() {
        int board = 0b1000000_0000000_0000000_0000000;
        assertEquals("#______\n_______\n_______\n_______\n", BoardManager.toString(board));
    }

    @Test
    public void testBoard_withLastCellFilled() {
        int board = 0b0000000_0000000_0000000_0000001;
        assertEquals("_______\n_______\n_______\n______#\n", BoardManager.toString(board));
    }

    @Test
    public void testBoard_withAllFilledBoard() {
        int board = 0b1111111_1111111_1111111_1111111;
        assertEquals("#######\n#######\n#######\n#######\n", BoardManager.toString(board));
    }

    @Test
    public void testGenerateBoardFromString_withEmptyBoard() {
        String boardString = "_______\n_______\n_______\n_______\n";
        int excpectedBoard = 0b0;
        assertEquals(excpectedBoard, BoardManager.generateBoardFromString(boardString));
    }

    @Test
    public void testGenerateBoardFromString_withFilledBoard() {
        String boardString = "#______\n_______\n_______\n_______\n";
        int excpectedBoard = 0b1000000_0000000_0000000_0000000;
        String excpetedBitString = Long.toBinaryString(excpectedBoard);
        assertEquals(excpetedBitString, Long.toBinaryString(BoardManager.generateBoardFromString(boardString)));
    }

    @Test
    public void testGenerateBoardFromString_withLqstCellFilled() {
        String boardString = "_______\n_______\n_______\n______#\n";
        int excpectedBoard = 0b0000000_0000000_0000000_0000001;
        String excpetedBitString = Long.toBinaryString(excpectedBoard);
        assertEquals(excpetedBitString, Long.toBinaryString(BoardManager.generateBoardFromString(boardString)));
    }

    @Test
    public void testGenerateBoardFromString_withFilledBoard2() {
        String boardString = "_______\n___#___\n___#___\n______#\n";
        int excpectedBoard = 0b0000000_0001000_0001000_0000001;
        String excpetedBitString = Long.toBinaryString(excpectedBoard);
        assertEquals(excpetedBitString, Long.toBinaryString(BoardManager.generateBoardFromString(boardString)));
    }

    @Test
    public void testGenerateBoardFromString_withAllFilledBoard() {
        String boardString = "#######\n#######\n#######\n#######\n";
        int excpectedBoard = 0b1111111_1111111_1111111_1111111;
        String excpetedBitString = Long.toBinaryString(excpectedBoard);
        assertEquals(excpetedBitString, Long.toBinaryString(BoardManager.generateBoardFromString(boardString)));
    }

    @Test
    public void testCanPut_withEmptyBoard() {
        int board = 0b0;
        int piece = 0b1000000_0000000_0000000_0000000;
        assertTrue(BoardManager.canPutPieceIntoBoard(board, piece));
    }

    @Test
    public void testCanPut_withFilledBoard() {
        int board = 0b1000000_0000000_0000000_0000000;
        int piece = 0b1000000_0000000_0000000_0000000;
        assertFalse(BoardManager.canPutPieceIntoBoard(board, piece));
    }

    @Test
    public void testCanPut_withLastCellFilled() {
        int board = 0b0000000_0000000_1111111_1111111;
        int piece = 0b1111111_1111111_0000000_0000000;
        assertTrue(BoardManager.canPutPieceIntoBoard(board, piece));
    }

    @Test
    public void testPutPieceIntoBoard_withEmptyBoard() {
        int board = 0b0;
        int piece = PuzzlePieces.MINIS_SQUARE.getShape();
        int expectedBoard = 0b1000000_0000000_0000000_0000000;
        assertEquals(expectedBoard, BoardManager.putPieceIntoBoard(board, piece));
    }

    @Test
    public void testIsCompleted_withEmptyBoard() {
        int board = 0b0;
        assertFalse(BoardManager.isCompleted(board));
    }

    @Test
    public void testIsCompleted_withFilledBoard() {
        int board = 0b1111111_1111111_1111111_1111111;
        assertTrue(BoardManager.isCompleted(board));
    }

    @Test
    public void testIsCompleted_withLastCellFilled() {
        int board = 0b0000000_0000000_0000000_0000001;
        assertFalse(BoardManager.isCompleted(board));
    }

}
