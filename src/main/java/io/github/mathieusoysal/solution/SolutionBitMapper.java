package io.github.mathieusoysal.solution;

public class SolutionBitMapper {
    private static final int BOARD_MASK = 0b1111111_1111111_1111111_1111111;


    public static int mapBoardAndPuzzlePieceIntoInt(int board, int puzzlePiece) {
        return board | puzzlePiece << 28;
    }


    public static int getBoardFromSolutionBitMap(int solutionBitMap) {
        return solutionBitMap & BOARD_MASK;
    }
    
}
