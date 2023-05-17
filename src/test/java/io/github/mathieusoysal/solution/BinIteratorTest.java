package io.github.mathieusoysal.solution;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BinIteratorTest {



    @Test
    public void testGetNextInt_with0IndexAndEmptyList_shouldReturn0() {
        long list = 0b100L;
        int currentIndex = 1;
        int expected = 1;
        int actual = BinIterator.getNextIndex(list, currentIndex);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetNextInt_with0IndexAndListWithOneElement_shouldReturn1() {
        long list = 0b1L;
        int currentIndex = 0;
        int expected = 1;
        int actual = BinIterator.getNextIndex(list, currentIndex);
        assertEquals(expected, actual);
    }


    @Test
    public void testGetNextInt_with1IndexAndListWithOneElement_shouldReturn2() {
        long list = 0b01L;
        int currentIndex = 0;
        int expected = 1;
        int actual = BinIterator.getNextIndex(list, currentIndex);
        assertEquals(expected, actual);
    }


    @Test
    public void testGetNextInt_with1IndexAndListWithTwoElements_shouldReturn2() {
        long list = 0b011L;
        int currentIndex = 0;
        int expected = 2;
        int actual = BinIterator.getNextIndex(list, currentIndex);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetNextInt_with2IndexAndListWithSeveralElements_shouldReturn2() {
        long list = 0b1111011L;
        int currentIndex = 1;
        int expected = 2;
        int actual = BinIterator.getNextIndex(list, currentIndex);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetNextInt_with2IndexAndListWithSeveralElements_shouldReturn3() {
        long list = 0b1110110L;
        int currentIndex = 2;
        int expected = 3;
        int actual = BinIterator.getNextIndex(list, currentIndex);
        assertEquals(expected, actual);
    }

    @Test
    public void testHasNext_with0IndexAndEmptyListAndSize32_shouldReturnTrue() {
        long list = 0b0L;
        int size = 32;
        int currentIndex = 0;
        boolean actual = BinIterator.hasNext(list, size, currentIndex);
        assertTrue(actual);
    }

    @Test
    public void testHasNext_with0IndexAndListWithOneElementAndSize32_shouldReturnTrue() {
        long list = 0b1L;
        int size = 32;
        int currentIndex = 0;
        boolean actual = BinIterator.hasNext(list, size, currentIndex);
        assertTrue(actual);
    }

    @Test
    public void testHasNext_with0IndexAndListWithOneElementAndSize1_shouldReturnFalse() {
        long list = 0b1L;
        int size = 1;
        int currentIndex = 0;
        boolean actual = BinIterator.hasNext(list, size, currentIndex);
        assertFalse(actual);
    }

    @Test
    public void testHasNext_with0IndexAndListWithOneElementAndSize2_shouldReturnTrue() {
        long list = 0b100000L;
        int size = 2;
        int currentIndex = 0;
        boolean actual = BinIterator.hasNext(list, size, currentIndex);
        assertTrue(actual);
    }

    @Test
    public void testHasNext_with0IndexAndListWithOneElementAndSize3_shouldReturnTrue() {
        long list = 0b100000L;
        int size = 6;
        int currentIndex = 5;
        boolean actual = BinIterator.hasNext(list, size, currentIndex);
        assertFalse(actual);
    }

    @Test
    public void testHasNext_with0IndexAndListWithOneElementAndSize3_shouldReturnFalse() {
        long list = 0b111111L;
        int size = 6;
        int currentIndex = 0;
        boolean actual = BinIterator.hasNext(list, size, currentIndex);
        assertFalse(actual);
    }

}
