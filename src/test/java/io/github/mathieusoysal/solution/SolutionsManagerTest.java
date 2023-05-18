package io.github.mathieusoysal.solution;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.github.mathieusoysal.puzzle_piece.PuzzlePieces;

public class SolutionsManagerTest {

    @Test
    public void testBitMapper() {
        int nbUsesOfEachPieces = SolutionsManager.bitMapperOfNbUse(1, 1, 1, 1, 1, 1);
        int expected = 0b001_001_001_001_001_001;
        assertEquals(expected, nbUsesOfEachPieces);
    }

    @Test
    public void testAddSolution_withOneSolution() {
        SolutionsManager solutionsManager = new SolutionsManager(PuzzlePieces.MINIS_SQUARE);
        assertTrue(solutionsManager.addSolution(0, 0, 1, 1, 1, 1, 1, 1));
    }

    @Test
    public void testAddSolution_withMutipleAdd() {
        SolutionsManager solutionsManager = new SolutionsManager(PuzzlePieces.MINIS_SQUARE);
        solutionsManager.addSolution(0, 0, 1, 1, 1, 1, 1, 1);
        assertTrue(solutionsManager.addSolution(0, 0, 1, 2, 1, 1, 1, 1));
    }

    @Test
    public void testAddSolution_withSameAdd_shouldReturnFals() {
        SolutionsManager solutionsManager = new SolutionsManager(PuzzlePieces.MINIS_SQUARE);
        solutionsManager.addSolution(0, 0, 1, 1, 1, 1, 1, 1);
        assertFalse(solutionsManager.addSolution(0, 0, 1, 1, 1, 1, 1, 1));
    }

}
