package io.github.mathieusoysal.solution;

public class BinIterator {
    public static boolean hasNext(long list, int size, int currentIndex) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public static int getNextIndex(long list, int size, int currentIndex) {
        long temp = (list + (1 << currentIndex));
        temp -= (temp & list);
        return (63 - Long.numberOfLeadingZeros(temp));
    }
}
