package io.github.mathieusoysal;

public class Board {
    private static final int HEIGHT = 4;
    private static final int WIDTH = 7;
    private static final int SIZE = HEIGHT * WIDTH;
    private static final char EMPTY = '_';
    private static final char FILLED = '#';

    public static String toString(long board) {
        String boardString = Long.toBinaryString(board)
                .replace('0', EMPTY)
                .replace('1', FILLED);
        boardString = String.valueOf(EMPTY).repeat(SIZE - boardString.length()) + boardString;
        return String.join("\n", boardString.split("(?<=\\G.{7})")) + "\n";
    }

    public static long generateBoardFromString(String boardString) {
        long board = 0b0L;
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
}
