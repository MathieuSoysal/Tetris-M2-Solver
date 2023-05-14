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

    public boolean addSolution(int positionIndex, long board, int nbUseOfL, int nbUseOfInvertedL, int nbUseOfZ,
            int nbUseOfInvertedZ, int nbUseOfSquare, int nbUseOfMiniSquare) {
        long nbUsesOfEachPieces = bitMapperOfNbUse(nbUseOfL, nbUseOfInvertedL, nbUseOfZ, nbUseOfInvertedZ,
                nbUseOfSquare, nbUseOfMiniSquare);
        return solutionsStorages[positionIndex].addSolution(board, nbUsesOfEachPieces);
    }

    public boolean contains(int positionIndex, long board, int nbUseOfL, int nbUseOfInvertedL, int nbUseOfZ,
            int nbUseOfInvertedZ, int nbUseOfSquare, int nbUseOfMiniSquare) {
        long nbUsesOfEachPieces = bitMapperOfNbUse(nbUseOfL, nbUseOfInvertedL, nbUseOfZ, nbUseOfInvertedZ,
                nbUseOfSquare, nbUseOfMiniSquare);
        return solutionsStorages[positionIndex].contains(board, nbUsesOfEachPieces);
    }

    static long bitMapperOfNbUse(int nbUseOfL,
            int nbUseOfInvertedL,
            int nbUseOfZ,
            int nbUseOfInvertedZ,
            int nbUseOfSquare,
            int nbUseOfMiniSquare) {
        long nbUsesOfEachPieces = nbUseOfL;
        nbUsesOfEachPieces |= nbUseOfInvertedL << 3;
        nbUsesOfEachPieces |= nbUseOfZ << 6;
        nbUsesOfEachPieces |= nbUseOfInvertedZ << 9;
        nbUsesOfEachPieces |= nbUseOfSquare << 12;
        nbUsesOfEachPieces |= nbUseOfMiniSquare << 15;
        return nbUsesOfEachPieces;
    }
}
