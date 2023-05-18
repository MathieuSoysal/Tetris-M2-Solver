package io.github.mathieusoysal.solution;

public class BinIterator {
    public static final int MAX_INDEX = Integer.SIZE;

    public static boolean hasNext(int list, int size, int currentIndex) {
        if (size == 0 || currentIndex < 0 || currentIndex >= size || currentIndex >= MAX_INDEX)
            return false;
        int nextIndex = getNextIndex(list, currentIndex);
        return nextIndex >= 0 && nextIndex < size && nextIndex < MAX_INDEX;
    }

    public static int getNextIndex(int list, int currentIndex) {
        int temp = (list + (1 << currentIndex));
        temp -= (temp & list);
        return ((MAX_INDEX - 1) - Integer.numberOfLeadingZeros(temp));
    }
}
