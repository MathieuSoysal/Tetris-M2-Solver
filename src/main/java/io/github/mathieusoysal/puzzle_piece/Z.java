package io.github.mathieusoysal.puzzle_piece;

class Z implements PuzzlePieceInterface {
    private static final int SHAPE = 0b1100000_0110000_0000000_0000000;
    private static final int[] allPossiblePlacements = new int[] {
            0b1100000_0110000_0000000_0000000,
            0b0110000_0011000_0000000_0000000,
            0b0011000_0001100_0000000_0000000,
            0b0001100_0000110_0000000_0000000,
            0b0000110_0000011_0000000_0000000,
            0b0000000_1100000_0110000_0000000,
            0b0000000_0110000_0011000_0000000,
            0b0000000_0011000_0001100_0000000,
            0b0000000_0001100_0000110_0000000,
            0b0000000_0000110_0000011_0000000,
            0b0000000_0000000_1100000_0110000,
            0b0000000_0000000_0110000_0011000,
            0b0000000_0000000_0011000_0001100,
            0b0000000_0000000_0001100_0000110,
            0b0000000_0000000_0000110_0000011
    };

    @Override
    public int getShape() {
        return SHAPE;
    }

    @Override
    public int[] getAllPossiblePlacements() {
        return allPossiblePlacements;
    }

}
