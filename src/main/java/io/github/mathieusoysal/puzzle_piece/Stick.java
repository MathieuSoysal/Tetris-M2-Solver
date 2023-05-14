package io.github.mathieusoysal.puzzle_piece;

public class Stick implements PuzzlePieceInterface {
    private static final long SHAPE = 0b1000000_1000000_1000000_0000000L;
    private static final long[] allPossiblePlacements = new long[] {
            0b1000000_1000000_1000000_0000000L,
            0b0100000_0100000_0100000_0000000L,
            0b0010000_0010000_0010000_0000000L,
            0b0001000_0001000_0001000_0000000L,
            0b0000100_0000100_0000100_0000000L,
            0b0000010_0000010_0000010_0000000L,
            0b0000001_0000001_0000001_0000000L,
            0b0000000_1000000_1000000_1000000L,
            0b0000000_0100000_0100000_0100000L,
            0b0000000_0010000_0010000_0010000L,
            0b0000000_0001000_0001000_0001000L,
            0b0000000_0000100_0000100_0000100L,
            0b0000000_0000010_0000010_0000010L,
            0b0000000_0000001_0000001_0000001L
    };

    public long getShape() {
        return SHAPE;
    }

    public long[] getAllPossiblePlacements() {
        return allPossiblePlacements;
    }

}