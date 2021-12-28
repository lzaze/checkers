package com.company.game.logic;

public class Board {
    public String[][] board;

    public Board() {
        this.board = new String[32][32];

        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                if ((i % 2 == 0) == (j % 2 == 0)) {
                    this.board[i][j] = "w";
                } else {
                    this.board[i][j] = "b";
                }
            }
        }
    }

    public String[][] getBoard() {
        return this.board;
    }
}
