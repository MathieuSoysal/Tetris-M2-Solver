package io.github.mathieusoysal;

public class Board {
    private static final int HEIGHT = 4;
    private static final int WIDTH = 7;
    private static final int SIZE = HEIGHT * WIDTH;
    private static final char EMPTY = '_';
    private static final char FILLED = '#';

    public static String toString(long board) {
        StringBuilder stringBuilder = new StringBuilder();
        String boardString = Long.toBinaryString(board);
        for (int rowIndex = 0; rowIndex < HEIGHT; rowIndex++) {
            for (int columnIndex = 0; columnIndex < WIDTH; columnIndex++) {
                int index = rowIndex * WIDTH + columnIndex;
                if (index < boardString.length()) {
                    stringBuilder.append(boardString.charAt(index) == '1' ? FILLED : EMPTY);
                } else {
                    stringBuilder.append(EMPTY);
                }
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
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
