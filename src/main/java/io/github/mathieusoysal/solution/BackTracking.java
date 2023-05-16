package io.github.mathieusoysal.solution;

public class BackTracking {

    private final SolutionsStorage solutionsStorage;

    private static final int MAX_DEEP = 11;
    private static final int MAX_USE_OF_PIECE = 5;

    public BackTracking() {
        this.solutionsStorage = new SolutionsStorage((byte) 25);
    }

    public boolean addTrack(long board, int deep, int indexPosition, int nbUseOfL, int nbUseOfZ, int nbUseOfInversedL,
            int nbUseOfSquare, int nbUseOfMiniSquare, int nbUseOfStick) {
        if (deep > MAX_DEEP)
            return false;
        if (nbUseOfL > MAX_USE_OF_PIECE || nbUseOfZ > MAX_USE_OF_PIECE
                || nbUseOfInversedL > MAX_USE_OF_PIECE || nbUseOfSquare > MAX_USE_OF_PIECE
                || nbUseOfMiniSquare > MAX_USE_OF_PIECE || nbUseOfStick > MAX_USE_OF_PIECE)
            return false;
        return deep > 8 ||
                solutionsStorage.addSolution(board,
                        SolutionsManager.bitMapperOfNbUse(nbUseOfL, nbUseOfInversedL, nbUseOfZ, nbUseOfInversedL,
                                nbUseOfSquare,
                                nbUseOfMiniSquare));
    }

}
