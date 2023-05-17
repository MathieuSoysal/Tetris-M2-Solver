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
        long board = 0L;
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
        long board = 0b1111111_1100111_1100111_1111111L;
        long bestPlacement = BoardEvaluator.getBestPlacementOnTheBoard(board, PuzzlePieces.MINIS_SQUARE);
        long expected = (1L << 10 | 1L << 16) ^ ((1L << 33) - 1);
        assertEquals(Long.toBinaryString(expected), Long.toBinaryString(bestPlacement));
    }

    @Test
    public void testGetBestPlacement_WithBinIterator() {
        long board = 0b1111111_1100111_1100111_1111111L;
        long bestPlacement = BoardEvaluator.getBestPlacementOnTheBoard(board, PuzzlePieces.MINIS_SQUARE);
        int bclCount = 0;
        for (int i = getNextIndex(bestPlacement, 0); hasNext(bestPlacement, 32,
                i); i = getNextIndex(bestPlacement, i + 1)) {
            bclCount++;
        }
        assertEquals(2, bclCount);
    }

}
