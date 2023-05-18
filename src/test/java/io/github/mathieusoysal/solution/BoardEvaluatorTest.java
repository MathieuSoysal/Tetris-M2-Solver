package io.github.mathieusoysal.solution;

import static io.github.mathieusoysal.solution.BinIterator.getNextIndex;
import static io.github.mathieusoysal.solution.BinIterator.hasNext;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.mathieusoysal.BoardManager;
import io.github.mathieusoysal.puzzle_piece.PuzzlePieces;

public class BoardEvaluatorTest {

    @Test
    public void testEvaluate_forEmptyBoard() {
        int board = 0;
        int score = BoardEvaluator.evaluate(board);
        int expected = PuzzlePieces.MINIS_SQUARE.getAllPossiblePlacements().length * 1
                + PuzzlePieces.STICK.getAllPossiblePlacements().length * 3
                + PuzzlePieces.L.getAllPossiblePlacements().length * 3
                + PuzzlePieces.Z.getAllPossiblePlacements().length * 4
                + PuzzlePieces.INVERSED_L.getAllPossiblePlacements().length * 3
                + PuzzlePieces.SQUARE.getAllPossiblePlacements().length * 4;
        assertEquals(expected, score);
    }

    @Test
    public void testGetBestPlacement_fotEasyBoard() {
        int board = 0b1111111_1100111_1100111_1111111;
        int bestPlacement = BoardEvaluator.getBestPlacementOnTheBoard(board, PuzzlePieces.MINIS_SQUARE);
        int expected = (1 << 10 | 1 << 16) ^ ~0;
        assertEquals(Long.toBinaryString(expected), Long.toBinaryString(bestPlacement));
    }

    @Test
    public void testGetBestPlacement_WithBinIterator() {
        int board = 0b1111111_1100111_1100111_1111111;
        int bestPlacement = BoardEvaluator.getBestPlacementOnTheBoard(board, PuzzlePieces.MINIS_SQUARE);
        int bclCount = 0;
        for (int i = getNextIndex(bestPlacement, 0); hasNext(bestPlacement, 31,
                i); i = getNextIndex(bestPlacement, i + 1)) {
            bclCount++;
        }
        assertEquals(2, bclCount);
    }

}
