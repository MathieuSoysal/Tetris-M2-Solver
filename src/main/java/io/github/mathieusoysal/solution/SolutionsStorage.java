package io.github.mathieusoysal.solution;

class SolutionsStorage {
    private long[] keys;
    private int size;

    public SolutionsStorage() {
        keys = new long[2 << 20];
        size = 0;
    }

    public boolean addSolution(long board, long nbUsesOfEachPieces) {
        int index = getIndex(board, nbUsesOfEachPieces);
        if (contains(board, nbUsesOfEachPieces)) {
            return false;
        }
        if (keys[index] != 0) {
            index = linearProbe(index);
        }
        keys[index] = board;
        keys[index + 1] = nbUsesOfEachPieces;
        size++;
        if (size == keys.length / 2) {
            resize();
        }
        return true;
    }

    public boolean contains(long board, long nbUsesOfEachPieces) {
        int index = getIndex(board, nbUsesOfEachPieces);
        return keys[index] == board && keys[index + 1] == nbUsesOfEachPieces;
    }

    private int getIndex(long key1, long key2) {
        int h1 = Long.hashCode(key1);
        int h2 = Long.hashCode(key2);
        return (h1 ^ h2) & (keys.length - 2);
    }

    private int linearProbe(int index) {
        index += 2;
        if (index >= keys.length) {
            index = 0;
        }
        return index;
    }

    private void resize() {
        long[] oldKeys = keys;
        keys = new long[keys.length * 2];
        size = 0;
        for (int i = 0; i < oldKeys.length; i += 2) {
            long key1 = oldKeys[i];
            long key2 = oldKeys[i + 1];
            if (key1 != 0 || key2 != 0) {
                addSolution(key1, key2);
            }
        }
    }
}
