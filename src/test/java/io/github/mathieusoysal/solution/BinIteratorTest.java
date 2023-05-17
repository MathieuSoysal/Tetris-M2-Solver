package io.github.mathieusoysal.solution;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinIteratorTest {



    @Test
    public void testGetNextInt_with0IndexAndEmptyList_shouldReturn0() {
        long list = 0b100L;
        int size = 32;
        int currentIndex = 1;
        int expected = 1;
        int actual = BinIterator.getNextIndex(list, size, currentIndex);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetNextInt_with0IndexAndListWithOneElement_shouldReturn1() {
        long list = 0b1L;
        int size = 32;
        int currentIndex = 0;
        int expected = 1;
        int actual = BinIterator.getNextIndex(list, size, currentIndex);
        assertEquals(expected, actual);
    }


    @Test
    public void testGetNextInt_with1IndexAndListWithOneElement_shouldReturn2() {
        long list = 0b01L;
        int size = 32;
        int currentIndex = 0;
        int expected = 1;
        int actual = BinIterator.getNextIndex(list, size, currentIndex);
        assertEquals(expected, actual);
    }


    @Test
    public void testGetNextInt_with1IndexAndListWithTwoElements_shouldReturn3() {
        long list = 0b011L;
        int size = 32;
        int currentIndex = 0;
        int expected = 2;
        int actual = BinIterator.getNextIndex(list, size, currentIndex);
        assertEquals(expected, actual);
    }

}
