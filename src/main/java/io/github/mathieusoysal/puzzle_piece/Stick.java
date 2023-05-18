package io.github.mathieusoysal.puzzle_piece;

class Stick implements PuzzlePieceInterface {
    private static final int SHAPE = 0b1000000_1000000_1000000_0000000;
    private static final int[] allPossiblePlacements = new int[] {
            0b1000000_1000000_1000000_0000000,
            0b0100000_0100000_0100000_0000000,
            0b0010000_0010000_0010000_0000000,
            0b0001000_0001000_0001000_0000000,
            0b0000100_0000100_0000100_0000000,
            0b0000010_0000010_0000010_0000000,
            0b0000001_0000001_0000001_0000000,
            0b0000000_1000000_1000000_1000000,
            0b0000000_0100000_0100000_0100000,
            0b0000000_0010000_0010000_0010000,
            0b0000000_0001000_0001000_0001000,
            0b0000000_0000100_0000100_0000100,
            0b0000000_0000010_0000010_0000010,
            0b0000000_0000001_0000001_0000001
    };

    public int getShape() {
        return SHAPE;
    }

    public int[] getAllPossiblePlacements() {
        return allPossiblePlacements;
    }

}