package io.github.mathieusoysal.puzzle_piece;

public enum PuzzlePieces implements PuzzlePieceInterface {
    L(new L()),
    Z(new Z()),
    STICK(new Stick()),
    SQUARE(new Square()),
    INVERSED_L(new InversedL()),
    MINIS_QUARE(new MiniSquare());

    private final PuzzlePieceInterface piece;

    private PuzzlePieces(PuzzlePieceInterface piece) {
        this.piece = piece;
    }

    @Override
    public long getShape() {
        return piece.getShape();
    }

    @Override
    public long[] getAllPossiblePlacements() {
        return piece.getAllPossiblePlacements();
    }

}
