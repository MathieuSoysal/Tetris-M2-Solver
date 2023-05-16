package io.github.mathieusoysal;

import org.junit.Ignore;
import org.junit.Test;

import io.github.mathieusoysal.puzzle_piece.PuzzlePieces;

public class SolverTest {

    // @Test
    // @Ignore
    public void testSolve() {
        long heapsize = Runtime.getRuntime().totalMemory();
        System.out.println("heapsize is :: " + heapsize * .000000000125);
        Solver solver = new Solver(PuzzlePieces.Z);
        solver.solve();
    }

}
