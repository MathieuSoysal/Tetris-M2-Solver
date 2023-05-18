package io.github.mathieusoysal.solution;

class SolutionsStorage {
    private int[] keys;
    private int size;

    public SolutionsStorage() {
        keys = new int[2 << 15];
        size = 0;
    }

    public SolutionsStorage(byte size) {
        keys = new int[2 << size];
        size = 0;
    }

    public boolean addSolution(int board, int nbUsesOfEachPieces) {
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

    public boolean contains(int board, int nbUsesOfEachPieces) {
        int index = getIndex(board, nbUsesOfEachPieces);
        return keys[index] == board && keys[index + 1] == nbUsesOfEachPieces;
    }

    private int getIndex(int key1, int key2) {
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
        long heapsize = Runtime.getRuntime().totalMemory();
        System.out.println("Heap size: " + heapsize * 0.000001 + " MB " + keys.length + " size");
        int[] oldKeys = keys;
        keys = new int[keys.length * 2];
        size = 0;
        for (int i = 0; i < oldKeys.length; i += 2) {
            int key1 = oldKeys[i];
            int key2 = oldKeys[i + 1];
            if (key1 != 0 || key2 != 0) {
                addSolution(key1, key2);
            }
        }
    }
}
