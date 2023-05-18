package io.github.mathieusoysal.solution;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BinIteratorTest {

    @Test
    public void testGetNextInt_with0IndexAndEmptyList_shouldReturn0() {
        int list = 0b100;
        int currentIndex = 1;
        int expected = 1;
        int actual = BinIterator.getNextIndex(list, currentIndex);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetNextInt_with0IndexAndListWithOneElement_shouldReturn1() {
        int list = 0b1;
        int currentIndex = 0;
        int expected = 1;
        int actual = BinIterator.getNextIndex(list, currentIndex);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetNextInt_with1IndexAndListWithOneElement_shouldReturn2() {
        int list = 0b01;
        int currentIndex = 0;
        int expected = 1;
        int actual = BinIterator.getNextIndex(list, currentIndex);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetNextInt_with1IndexAndListWithTwoElements_shouldReturn2() {
        int list = 0b011;
        int currentIndex = 0;
        int expected = 2;
        int actual = BinIterator.getNextIndex(list, currentIndex);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetNextInt_with2IndexAndListWithSeveralElements_shouldReturn2() {
        int list = 0b1111011;
        int currentIndex = 1;
        int expected = 2;
        int actual = BinIterator.getNextIndex(list, currentIndex);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetNextInt_with2IndexAndListWithSeveralElements_shouldReturn3() {
        int list = 0b1110110;
        int currentIndex = 2;
        int expected = 3;
        int actual = BinIterator.getNextIndex(list, currentIndex);
        assertEquals(expected, actual);
    }

    @Test
    public void testHasNext_with0IndexAndEmptyListAndSize31_shouldReturnTrue() {
        int list = 0b0;
        int size = 31;
        int currentIndex = 0;
        boolean actual = BinIterator.hasNext(list, size, currentIndex);
        assertTrue(actual);
    }

    @Test
    public void testHasNext_with0IndexAndListWithOneElementAndSize31_shouldReturnTrue() {
        int list = 0b1;
        int size = 31;
        int currentIndex = 0;
        boolean actual = BinIterator.hasNext(list, size, currentIndex);
        assertTrue(actual);
    }

    @Test
    public void testHasNext_with0IndexAndListWithOneElementAndSize1_shouldReturnFalse() {
        int list = 0b1;
        int size = 1;
        int currentIndex = 0;
        boolean actual = BinIterator.hasNext(list, size, currentIndex);
        assertFalse(actual);
    }

    @Test
    public void testHasNext_with0IndexAndListWithOneElementAndSize2_shouldReturnTrue() {
        int list = 0b100000;
        int size = 2;
        int currentIndex = 0;
        boolean actual = BinIterator.hasNext(list, size, currentIndex);
        assertTrue(actual);
    }

    @Test
    public void testHasNext_with0IndexAndListWithOneElementAndSize3_shouldReturnTrue() {
        int list = 0b100000;
        int size = 6;
        int currentIndex = 5;
        boolean actual = BinIterator.hasNext(list, size, currentIndex);
        assertFalse(actual);
    }

    @Test
    public void testHasNext_with0IndexAndListWithOneElementAndSize3_shouldReturnFalse() {
        int list = 0b111111;
        int size = 6;
        int currentIndex = 0;
        boolean actual = BinIterator.hasNext(list, size, currentIndex);
        assertFalse(actual);
    }

    @Test
    public void testBoucle() {
        int list = (1 << 10 | 1 << 16) ^ ~0;
        int size = 31;
        int currentIndex = BinIterator.getNextIndex(list, 0);
        currentIndex = BinIterator.getNextIndex(list, currentIndex + 1);
        assertFalse(BinIterator.hasNext(list, size, currentIndex +1));
    }

}
