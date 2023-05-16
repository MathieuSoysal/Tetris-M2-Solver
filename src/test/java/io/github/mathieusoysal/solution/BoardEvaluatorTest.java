package io.github.mathieusoysal.solution;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

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

}
