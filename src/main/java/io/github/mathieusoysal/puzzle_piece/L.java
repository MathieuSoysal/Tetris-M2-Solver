package io.github.mathieusoysal.puzzle_piece;

public class L implements PuzzlePieceInterface {
    private static final long SHAPE = 0b1000000_1100000_0000000_0000000L;
    private static final long[] allPossiblePlacements = new long[] {
            0b1000000_1100000_0000000_0000000L,
            0b0100000_0110000_0000000_0000000L,
            0b0010000_0011000_0000000_0000000L,
            0b0001000_0001100_0000000_0000000L,
            0b0000100_0000110_0000000_0000000L,
            0b0000010_0000011_0000000_0000000L,
            0b0000000_1000000_1100000_0000000L,
            0b0000000_0100000_0110000_0000000L,
            0b0000000_0010000_0011000_0000000L,
            0b0000000_0001000_0001100_0000000L,
            0b0000000_0000100_0000110_0000000L,
            0b0000000_0000010_0000011_0000000L,
            0b0000000_0000000_1000000_1100000L,
            0b0000000_0000000_0100000_0110000L,
            0b0000000_0000000_0010000_0011000L,
            0b0000000_0000000_0001000_0001100L,
            0b0000000_0000000_0000100_0000110L,
            0b0000000_0000000_0000010_0000011L
    };

    @Override
    public long getShape() {
        return SHAPE;
    }

    @Override
    public long[] getAllPossiblePlacements() {
        return allPossiblePlacements;
    }

}
