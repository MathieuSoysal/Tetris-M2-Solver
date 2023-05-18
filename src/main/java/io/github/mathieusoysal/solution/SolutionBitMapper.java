package io.github.mathieusoysal.solution;

public class SolutionBitMapper {


    public static int mapBoardAndPuzzlePieceIntoInt(int board, int puzzlePiece) {
        return board | puzzlePiece << 28;
    }
    
}
