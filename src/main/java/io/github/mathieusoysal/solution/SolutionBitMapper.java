package io.github.mathieusoysal.solution;

import java.util.EnumMap;

import io.github.mathieusoysal.puzzle_piece.PuzzlePieces;

public class SolutionBitMapper {
    private static final int BOARD_MASK = 0b1111111_1111111_1111111_1111111;

    public static int mapBoardAndPuzzlePieceIntoInt(int board, PuzzlePieces puzzlePiece) {
        return mapBoardAndPuzzlePieceIntoInt(board, puzzlePiece.ordinal());
    }

    static int mapBoardAndPuzzlePieceIntoInt(int board, int puzzlePiece) {
        return board | puzzlePiece << 28;
    }

    public static int getBoardFromSolutionBitMap(int solutionBitMap) {
        return solutionBitMap & BOARD_MASK;
    }

    public static PuzzlePieces getPuzzlePieceFromSolutionBitMap(int solutionBitMap) {
        return PuzzlePieces.values()[getPuzzlePieceIndexFromSolutionBitMap(solutionBitMap)];
    }

    static int getPuzzlePieceIndexFromSolutionBitMap(int solutionBitMap) {
        return solutionBitMap >>> 28;
    }

}
