package io.github.mathieusoysal.puzzle_piece;

public class Square implements PuzzlePieceInterface {
    private static final long SHAPE = 0b1100000_1100000_0000000_0000000L;
    private static final long[] allPossiblePlacements = new long[] {
            0b1100000_1100000_0000000_0000000L,
            0b0110000_0110000_0000000_0000000L,
            0b0011000_0011000_0000000_0000000L,
            0b0001100_0001100_0000000_0000000L,
            0b0000110_0000110_0000000_0000000L,
            0b0000011_0000011_0000000_0000000L,
            0b0000000_1100000_1100000_0000000L,
            0b0000000_0110000_0110000_0000000L,
            0b0000000_0011000_0011000_0000000L,
            0b0000000_0001100_0001100_0000000L,
            0b0000000_0000110_0000110_0000000L,
            0b0000000_0000011_0000011_0000000L,
            0b0000000_0000000_1100000_1100000L,
            0b0000000_0000000_0110000_0110000L,
            0b0000000_0000000_0011000_0011000L,
            0b0000000_0000000_0001100_0001100L,
            0b0000000_0000000_0000110_0000110L,
            0b0000000_0000000_0000011_0000011L
    };

    public Square() {
    }

    @Override
    public long getShape() {
        return SHAPE;
    }

    @Override
    public long[] getAllPossiblePlacements() {
        return allPossiblePlacements;
    }

}