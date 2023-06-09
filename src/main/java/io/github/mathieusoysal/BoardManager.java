package io.github.mathieusoysal;

public class BoardManager {
    private static final int HEIGHT = 4;
    private static final int WIDTH = 7;
    private static final int SIZE = HEIGHT * WIDTH;
    private static final char EMPTY = '_';
    private static final char FILLED = '#';

    private BoardManager() {
    }

    public static String toString(int board) {
        String boardString = Long.toBinaryString(board)
                .replace('0', EMPTY)
                .replace('1', FILLED);
        boardString = String.valueOf(EMPTY).repeat(SIZE - boardString.length()) + boardString;
        return String.join("\n", boardString.split("(?<=\\G.{7})")) + "\n";
    }

    public static int generateBoardFromString(String boardString) {
        int board = 0b0;
        boardString = boardString.replace("\n", "");
        for (int rowIndex = 0; rowIndex < HEIGHT; rowIndex++) {
            for (int columnIndex = 0; columnIndex < WIDTH; columnIndex++) {
                int index = rowIndex * WIDTH + columnIndex;
                if (index < boardString.length() && (boardString.charAt(index) == FILLED)) {
                    board |= 1L << (SIZE - (index + 1));
                }
            }
        }
        return board;
    }

    public static boolean canPutPieceIntoBoard(int board, int piece) {
        return (board & piece) == 0;
    }

    public static int putPieceIntoBoard(int board, int piece) {
        return board | piece;
    }

    public static boolean isCompleted(int board) {
        return board == 0b1111111_1111111_1111111_1111111;
    }
}
