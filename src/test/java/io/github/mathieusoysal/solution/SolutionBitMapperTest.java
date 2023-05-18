package io.github.mathieusoysal.solution;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.mathieusoysal.puzzle_piece.PuzzlePieces;

public class SolutionBitMapperTest {

    @Test
    public void testMapBoardAndPuzzlePieceIntoInt() {
        int board = 0;
        int puzzlePiece = 1;

        int expected = 0b001_0000000_0000000_0000000_0000000;
        int actual = SolutionBitMapper.mapBoardAndPuzzlePieceIntoInt(board, puzzlePiece);
        assertEquals(Integer.toBinaryString(expected), Integer.toBinaryString(actual));
    }

    @Test
    public void testMapBoardAndPuzzlePieceIntoInt_withBoardAndPuzzlePiece() {
        int board = 0b1111111_1100111_1100111_1111111;
        int puzzlePiece = 3;

        int expected = 0b11_1111111_1100111_1100111_1111111;
        int actual = SolutionBitMapper.mapBoardAndPuzzlePieceIntoInt(board, puzzlePiece);
        assertEquals(Integer.toBinaryString(expected), Integer.toBinaryString(actual));
    }

    @Test
    public void testMapBoardAndPuzzlePieceIntoInt_withBoardAndPuzzlePiece_6() {
        int board = 0b1111111_1100111_1100111_1111111;
        int puzzlePiece = 6;

        int expected = 0b110_1111111_1100111_1100111_1111111;
        int actual = SolutionBitMapper.mapBoardAndPuzzlePieceIntoInt(board, puzzlePiece);
        assertEquals(Integer.toBinaryString(expected), Integer.toBinaryString(actual));
    }

    @Test
    public void testGetBoardFromSolutionBitMap() {
        int solutionBitMap = 0b111_0000000_0000000_0000000_0000000;

        int expected = 0;
        int actual = SolutionBitMapper.getBoardFromSolutionBitMap(solutionBitMap);
        assertEquals(Integer.toBinaryString(expected), Integer.toBinaryString(actual));
    }

    @Test
    public void testGetBoardFromSolutionBitMap_2() {
        int solutionBitMap = 0b00_1111111_1111111_1111111_1111111;

        int expected = 0b1111111_1111111_1111111_1111111;
        int actual = SolutionBitMapper.getBoardFromSolutionBitMap(solutionBitMap);
        assertEquals(Integer.toBinaryString(expected), Integer.toBinaryString(actual));
    }

    @Test
    public void testGetPuzzlePieceIndexFromSolutionBitMap_0() {
        int solutionBitMap = 0b111_0000000_0000000_0000000_0000000;

        int expected = 7;
        int actual = SolutionBitMapper.getPuzzlePieceIndexFromSolutionBitMap(solutionBitMap);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetPuzzlePieceIndexFromSolutionBitMap_1() {
        int solutionBitMap = 0b110_1111111_1111111_1111111_1111111;

        int expected = 6;
        int actual = SolutionBitMapper.getPuzzlePieceIndexFromSolutionBitMap(solutionBitMap);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetPuzzlePieceFromSolutionBitMap() {
        int solutionBitMap = 0b101_0000000_0000000_0000000_0000000;

        int expected = 5;
        int actual = SolutionBitMapper.getPuzzlePieceFromSolutionBitMap(solutionBitMap).ordinal();
        assertEquals(expected, actual);

    }

    @Test
    public void testMapBoardAndPuzzlePieceIntoInt2() {
        int board = 0b1111111_1100111_1100111_1111111;
        var puzzlePiece = PuzzlePieces.Z;

        int expected = 0b1_1111111_1100111_1100111_1111111;
        int actual = SolutionBitMapper.mapBoardAndPuzzlePieceIntoInt(board, puzzlePiece);
        assertEquals(Integer.toBinaryString(expected), Integer.toBinaryString(actual));
    }

    @Test
    public void testMapBoardAndPuzzlePieceIntoInt3() {
        int board = 0b1111111_1100111_1100111_1111111;
        var puzzlePiece = PuzzlePieces.STICK;

        int actual = SolutionBitMapper.mapBoardAndPuzzlePieceIntoInt(board, puzzlePiece);
        var actualPuzzlePiece = SolutionBitMapper.getPuzzlePieceFromSolutionBitMap(actual);
        assertEquals(puzzlePiece, actualPuzzlePiece);
    }
}
