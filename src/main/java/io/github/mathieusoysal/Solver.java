package io.github.mathieusoysal;

import io.github.mathieusoysal.puzzle_piece.PuzzlePieces;
import io.github.mathieusoysal.solution.BackTracking;
import io.github.mathieusoysal.solution.SolutionsManager;

public class Solver {
        private final SolutionsManager solutionsManager;
        private final BackTracking backTracking;
        private final PuzzlePieces firstPiece;

        public Solver(PuzzlePieces firstPieceOfPuzzle) {
                this.solutionsManager = new SolutionsManager(firstPieceOfPuzzle);
                this.backTracking = new BackTracking();
                this.firstPiece = firstPieceOfPuzzle;
        }

        public void solve() {
                long[] allPossiblePlacements = firstPiece.getAllPossiblePlacements();
                for (int i = 0; i < allPossiblePlacements.length; i++) {
                        System.out.println("i = " + i);
                        solve(allPossiblePlacements[i], 1, i, 0, 0, 0, 0, 0, 0);
                }
        }

        private void solve(long board, int deep, int indexPosition, int nbUseOfL, int nbUseOfZ, int nbUseOfInversedL,
                        int nbUseOfSquare, int nbUseOfMiniSquare, int nbUseOfStick) {
                if (!backTracking.addTrack(board, deep, indexPosition, nbUseOfL, nbUseOfZ, nbUseOfInversedL,
                                nbUseOfSquare,
                                nbUseOfMiniSquare, nbUseOfStick)) {
                        return;
                }
                if (BoardManager.isCompleted(board)) {
                        solutionsManager.addSolution(indexPosition, board, nbUseOfL, nbUseOfZ, nbUseOfInversedL,
                                        nbUseOfSquare,
                                        nbUseOfMiniSquare, nbUseOfStick);
                        return;
                }
                if (nbUseOfL < 4)
                        explorePossibilityForPuzzlePiece(PuzzlePieces.L, board, deep, indexPosition, nbUseOfL + 1,
                                        nbUseOfZ,
                                        nbUseOfInversedL,
                                        nbUseOfSquare,
                                        nbUseOfMiniSquare,
                                        nbUseOfStick);
                if (nbUseOfZ < 4)
                        explorePossibilityForPuzzlePiece(PuzzlePieces.Z, board, deep, indexPosition, nbUseOfL,
                                        nbUseOfZ + 1,
                                        nbUseOfInversedL,
                                        nbUseOfSquare,
                                        nbUseOfMiniSquare,
                                        nbUseOfStick);
                if (nbUseOfInversedL < 4)
                        explorePossibilityForPuzzlePiece(PuzzlePieces.INVERSED_L, board, deep, indexPosition, nbUseOfL,
                                        nbUseOfZ,
                                        nbUseOfInversedL + 1,
                                        nbUseOfSquare,
                                        nbUseOfMiniSquare,
                                        nbUseOfStick);
                if (nbUseOfSquare < 4)
                        explorePossibilityForPuzzlePiece(PuzzlePieces.SQUARE, board, deep, indexPosition, nbUseOfL,
                                        nbUseOfZ,
                                        nbUseOfInversedL,
                                        nbUseOfSquare + 1,
                                        nbUseOfMiniSquare,
                                        nbUseOfStick);
                if (nbUseOfMiniSquare < 4)
                        explorePossibilityForPuzzlePiece(PuzzlePieces.MINIS_SQUARE, board, deep, indexPosition,
                                        nbUseOfL,
                                        nbUseOfZ,
                                        nbUseOfInversedL,
                                        nbUseOfSquare,
                                        nbUseOfMiniSquare + 1,
                                        nbUseOfStick);
                if (nbUseOfStick < 4)
                        explorePossibilityForPuzzlePiece(PuzzlePieces.STICK, board, deep, indexPosition, nbUseOfL,
                                        nbUseOfZ,
                                        nbUseOfInversedL,
                                        nbUseOfSquare,
                                        nbUseOfMiniSquare,
                                        nbUseOfStick + 1);
        }

        private void explorePossibilityForPuzzlePiece(PuzzlePieces piece, long board, int deep, int indexPosition,
                        int nbUseOfL,
                        int nbUseOfZ,
                        int nbUseOfInversedL,
                        int nbUseOfSquare, int nbUseOfMiniSquare, int nbUseOfStick) {
                for (long pieceOnBoard : piece.getAllPossiblePlacements()) {
                        if (BoardManager.canPutPieceIntoBoard(board, pieceOnBoard)) {
                                solve(BoardManager.putPieceIntoBoard(board, pieceOnBoard), deep + 1, indexPosition,
                                                nbUseOfL,
                                                nbUseOfZ, nbUseOfInversedL, nbUseOfSquare, nbUseOfMiniSquare,
                                                nbUseOfStick);
                        }
                }
        }

}
