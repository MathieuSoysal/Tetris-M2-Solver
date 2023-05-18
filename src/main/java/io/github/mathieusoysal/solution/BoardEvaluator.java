package io.github.mathieusoysal.solution;

import io.github.mathieusoysal.BoardManager;
import io.github.mathieusoysal.puzzle_piece.PuzzlePieces;

public class BoardEvaluator {

        public static int evaluate(int board) {
                int score = 0;
                // Calculate Stick
                int[] p = PuzzlePieces.STICK.getAllPossiblePlacements();
                int nbStick = countIfisValid(board, p[0])
                                + countIfisValid(board, p[1])
                                + countIfisValid(board, p[2])
                                + countIfisValid(board, p[3])
                                + countIfisValid(board, p[4])
                                + countIfisValid(board, p[5])
                                + countIfisValid(board, p[6])
                                + countIfisValid(board, p[7])
                                + countIfisValid(board, p[8])
                                + countIfisValid(board, p[9])
                                + countIfisValid(board, p[10])
                                + countIfisValid(board, p[11])
                                + countIfisValid(board, p[12])
                                + countIfisValid(board, p[13]);

                // Calculate L
                p = PuzzlePieces.L.getAllPossiblePlacements();
                int nbL = countIfisValid(board, p[0])
                                + countIfisValid(board, p[1])
                                + countIfisValid(board, p[2])
                                + countIfisValid(board, p[3])
                                + countIfisValid(board, p[4])
                                + countIfisValid(board, p[5])
                                + countIfisValid(board, p[6])
                                + countIfisValid(board, p[7])
                                + countIfisValid(board, p[8])
                                + countIfisValid(board, p[9])
                                + countIfisValid(board, p[10])
                                + countIfisValid(board, p[11])
                                + countIfisValid(board, p[12])
                                + countIfisValid(board, p[13])
                                + countIfisValid(board, p[14])
                                + countIfisValid(board, p[15])
                                + countIfisValid(board, p[16])
                                + countIfisValid(board, p[17]);

                // Calculate Z
                p = PuzzlePieces.Z.getAllPossiblePlacements();
                int nbZ = countIfisValid(board, p[0])
                                + countIfisValid(board, p[1])
                                + countIfisValid(board, p[2])
                                + countIfisValid(board, p[3])
                                + countIfisValid(board, p[4])
                                + countIfisValid(board, p[5])
                                + countIfisValid(board, p[6])
                                + countIfisValid(board, p[7])
                                + countIfisValid(board, p[8])
                                + countIfisValid(board, p[9])
                                + countIfisValid(board, p[10])
                                + countIfisValid(board, p[11])
                                + countIfisValid(board, p[12])
                                + countIfisValid(board, p[13])
                                + countIfisValid(board, p[14]);

                // Calculate InversedL
                p = PuzzlePieces.INVERSED_L.getAllPossiblePlacements();
                int nbInversedL = countIfisValid(board, p[0])
                                + countIfisValid(board, p[1])
                                + countIfisValid(board, p[2])
                                + countIfisValid(board, p[3])
                                + countIfisValid(board, p[4])
                                + countIfisValid(board, p[5])
                                + countIfisValid(board, p[6])
                                + countIfisValid(board, p[7])
                                + countIfisValid(board, p[8])
                                + countIfisValid(board, p[9])
                                + countIfisValid(board, p[10])
                                + countIfisValid(board, p[11])
                                + countIfisValid(board, p[12])
                                + countIfisValid(board, p[13])
                                + countIfisValid(board, p[14])
                                + countIfisValid(board, p[15])
                                + countIfisValid(board, p[16])
                                + countIfisValid(board, p[17]);

                // Calculate Square
                p = PuzzlePieces.SQUARE.getAllPossiblePlacements();
                int nbSquare = countIfisValid(board, p[0])
                                + countIfisValid(board, p[1])
                                + countIfisValid(board, p[2])
                                + countIfisValid(board, p[3])
                                + countIfisValid(board, p[4])
                                + countIfisValid(board, p[5])
                                + countIfisValid(board, p[6])
                                + countIfisValid(board, p[7])
                                + countIfisValid(board, p[8])
                                + countIfisValid(board, p[9])
                                + countIfisValid(board, p[10])
                                + countIfisValid(board, p[11])
                                + countIfisValid(board, p[12])
                                + countIfisValid(board, p[13])
                                + countIfisValid(board, p[14])
                                + countIfisValid(board, p[15])
                                + countIfisValid(board, p[16])
                                + countIfisValid(board, p[17]);

                // Calculate Mini Square
                p = PuzzlePieces.MINIS_SQUARE.getAllPossiblePlacements();
                int nbMiniSquare = countIfisValid(board, p[0])
                                + countIfisValid(board, p[1])
                                + countIfisValid(board, p[2])
                                + countIfisValid(board, p[3])
                                + countIfisValid(board, p[4])
                                + countIfisValid(board, p[5])
                                + countIfisValid(board, p[6])
                                + countIfisValid(board, p[7])
                                + countIfisValid(board, p[8])
                                + countIfisValid(board, p[9])
                                + countIfisValid(board, p[10])
                                + countIfisValid(board, p[11])
                                + countIfisValid(board, p[12])
                                + countIfisValid(board, p[13])
                                + countIfisValid(board, p[14])
                                + countIfisValid(board, p[15])
                                + countIfisValid(board, p[16])
                                + countIfisValid(board, p[17])
                                + countIfisValid(board, p[18])
                                + countIfisValid(board, p[19])
                                + countIfisValid(board, p[20])
                                + countIfisValid(board, p[21])
                                + countIfisValid(board, p[22])
                                + countIfisValid(board, p[23])
                                + countIfisValid(board, p[24])
                                + countIfisValid(board, p[25])
                                + countIfisValid(board, p[26])
                                + countIfisValid(board, p[27]);

                return nbInversedL * 3 + nbL * 3 + nbSquare * 4 + nbZ * 4 + nbMiniSquare * 1 + nbStick * 3;
        }

        private static int countIfisValid(int board, int placement) {
                if (BoardManager.canPutPieceIntoBoard(placement, board))
                        return BoardManager.isCompleted(BoardManager.putPieceIntoBoard(board, placement)) ? 300 : 1;
                return 0;
        }

        public static int getBestPlacementOnTheBoard(int board, PuzzlePieces piece) {
                int list = 0b0;
                int[] p = piece.getAllPossiblePlacements();
                int max = 0;
                for (int i = 0; i < p.length; i++) {
                        if (BoardManager.canPutPieceIntoBoard(p[i], board)) {
                                int score = evaluate(BoardManager.putPieceIntoBoard(board, p[i]));
                                if (score > max) {
                                        max = score;
                                        list = 1 << i;
                                } else if (score == max) {
                                        list |= 1 << i;
                                }
                        }
                }
                return list ^ ~0;
        }

}
