package io.github.mathieusoysal.solution;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SolutionsStorageTest {

    @Test
    public void testAdd() {
        SolutionsStorage solutionsStorage = new SolutionsStorage();
        assertTrue(solutionsStorage.addSolution(0b001_001_001_001_001_001, 0b001_001_001_001_001_001));
    }

    @Test
    public void testAdd_withSuperCharge() {
        SolutionsStorage solutionsStorage = new SolutionsStorage();
        SolutionsStorage solutionsStorage2 = new SolutionsStorage();
        SolutionsStorage solutionsStorage3 = new SolutionsStorage();
        SolutionsStorage solutionsStorage4 = new SolutionsStorage();
        SolutionsStorage solutionsStorage5 = new SolutionsStorage();
        SolutionsStorage solutionsStorage6 = new SolutionsStorage();
        SolutionsStorage solutionsStorage7 = new SolutionsStorage();
        assertTrue(solutionsStorage.addSolution(0b001_001_001_001_001_001, 0b001_001_001_001_001_001));
    }

    @Test
    public void testAdd_withMutipleAdd() {
        SolutionsStorage solutionsStorage = new SolutionsStorage();
        solutionsStorage.addSolution(0b001_001_001_001_001_001, 0b001_001_001_001_001_001);
        assertFalse(solutionsStorage.addSolution(0b001_001_001_001_001_001, 0b001_001_001_001_001_001));
    }

    @Test
    public void testAdd_withMutipleAdd2() {
        SolutionsStorage solutionsStorage = new SolutionsStorage();
        solutionsStorage.addSolution(0b001_001_001_001_001_001, 0b001_001_001_001_001_001);
        solutionsStorage.addSolution(0b001_001_001_001_001_001, 0b001_001_001_001_001_001);
        assertFalse(solutionsStorage.addSolution(0b001_001_001_001_001_001, 0b001_001_001_001_001_001));
    }

    @Test
    public void testAdd_withMutipleAdd3() {
        SolutionsStorage solutionsStorage = new SolutionsStorage();
        solutionsStorage.addSolution(0b001_001_001_001_001_001, 0b001_001_001_001_001_001);
        solutionsStorage.addSolution(0b001_001_001_001_001_001, 0b001_001_001_001_001_001);
        solutionsStorage.addSolution(0b001_001_001_001_001_001, 0b001_001_001_001_001_001);
        assertTrue(solutionsStorage.addSolution(0b001_001_001_001_101_001, 0b001_001_001_001_001_001));
    }

    @Test
    public void testContains() {
        SolutionsStorage solutionsStorage = new SolutionsStorage();
        solutionsStorage.addSolution(0b001_001_001_001_001_001, 0b001_001_001_001_001_001);
        assertTrue(solutionsStorage.contains(0b001_001_001_001_001_001, 0b001_001_001_001_001_001));
    }

    @Test
    public void testContains_withoutAdd_shouldReturnFalse() {
        SolutionsStorage solutionsStorage = new SolutionsStorage();
        assertFalse(solutionsStorage.contains(0b001_001_001_001_001_001, 0b001_001_001_001_001_001));
    }

    @Test
    public void testContains_withMutipleAdd_shouldReturnTrue() {
        SolutionsStorage solutionsStorage = new SolutionsStorage();
        solutionsStorage.addSolution(0b001_001_001_001_001_001, 0b001_001_001_001_001_001);
        solutionsStorage.addSolution(0b001_001_001_001_001_001, 0b001_001_001_001_001_011);
        solutionsStorage.addSolution(0b001_001_001_001_001_001, 0b001_001_001_001_001_111);
        assertTrue(solutionsStorage.contains(0b001_001_001_001_001_001, 0b001_001_001_001_001_001));
    }

}
