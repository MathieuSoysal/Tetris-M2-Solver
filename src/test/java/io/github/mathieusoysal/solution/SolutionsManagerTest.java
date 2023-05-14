package io.github.mathieusoysal.solution;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionsManagerTest {

    @Test
    public void testBitMapper() {
        long nbUsesOfEachPieces = SolutionsManager.bitMapperOfNbUse(1, 1, 1, 1, 1, 1);
        long expected = 0b001_001_001_001_001_001L;
        assertEquals(expected, nbUsesOfEachPieces);
    }

}
