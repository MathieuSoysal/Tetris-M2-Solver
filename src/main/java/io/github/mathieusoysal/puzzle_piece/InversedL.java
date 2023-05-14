package io.github.mathieusoysal.puzzle_piece;

class InversedL implements PuzzlePieceInterface {
    private static final long SHAPE = 0b1100000_0100000_0000000_0000000L;
    private static final long[] allPossiblePlacements = new long[] {
            0b1100000_0100000_0000000_0000000L,
            0b0110000_0010000_0000000_0000000L,
            0b0011000_0001000_0000000_0000000L,
            0b0001100_0000100_0000000_0000000L,
            0b0000110_0000010_0000000_0000000L,
            0b0000011_0000001_0000000_0000000L,
            0b0000000_1100000_0100000_0000000L,
            0b0000000_0110000_0010000_0000000L,
            0b0000000_0011000_0001000_0000000L,
            0b0000000_0001100_0000100_0000000L,
            0b0000000_0000110_0000010_0000000L,
            0b0000000_0000011_0000001_0000000L,
            0b0000000_0000000_1100000_0100000L,
            0b0000000_0000000_0110000_0010000L,
            0b0000000_0000000_0011000_0001000L,
            0b0000000_0000000_0001100_0000100L,
            0b0000000_0000000_0000110_0000010L,
            0b0000000_0000000_0000011_0000001L
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
