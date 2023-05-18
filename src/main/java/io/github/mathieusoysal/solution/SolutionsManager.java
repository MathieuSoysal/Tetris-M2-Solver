package io.github.mathieusoysal.solution;

import io.github.mathieusoysal.puzzle_piece.PuzzlePieces;

public class SolutionsManager {
    private final SolutionsStorage[] solutionsStorages;

    public SolutionsManager(PuzzlePieces puzzlePiece) {
        solutionsStorages = new SolutionsStorage[puzzlePiece.getAllPossiblePlacements().length];
        for (int i = 0; i < solutionsStorages.length; i++) {
            solutionsStorages[i] = new SolutionsStorage();
        }
    }

    public boolean addSolution(int positionIndex, int board, int nbUseOf, int nbUseOfInverted, int nbUseOfZ,
            int nbUseOfInvertedZ, int nbUseOfSquare, int nbUseOfMiniSquare) {
        int nbUsesOfEachPieces = bitMapperOfNbUse(nbUseOf, nbUseOfInverted, nbUseOfZ, nbUseOfInvertedZ,
                nbUseOfSquare, nbUseOfMiniSquare);
        return solutionsStorages[positionIndex].addSolution(board, nbUsesOfEachPieces);
    }

    public boolean contains(int positionIndex, int board, int nbUseOf, int nbUseOfInverted, int nbUseOfZ,
            int nbUseOfInvertedZ, int nbUseOfSquare, int nbUseOfMiniSquare) {
        int nbUsesOfEachPieces = bitMapperOfNbUse(nbUseOf, nbUseOfInverted, nbUseOfZ, nbUseOfInvertedZ,
                nbUseOfSquare, nbUseOfMiniSquare);
        return solutionsStorages[positionIndex].contains(board, nbUsesOfEachPieces);
    }

    static int bitMapperOfNbUse(int nbUseOf,
            int nbUseOfInvertedL,
            int nbUseOfZ,
            int nbUseOfStick,
            int nbUseOfSquare,
            int nbUseOfMiniSquare) {
        int nbUsesOfEachPieces = nbUseOf;
        nbUsesOfEachPieces |= nbUseOfInvertedL << 3;
        nbUsesOfEachPieces |= nbUseOfZ << 6;
        nbUsesOfEachPieces |= nbUseOfStick << 9;
        nbUsesOfEachPieces |= nbUseOfSquare << 12;
        nbUsesOfEachPieces |= nbUseOfMiniSquare << 15;
        return nbUsesOfEachPieces;
    }
}
