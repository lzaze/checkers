package com.company.game;

import com.company.game.logic.Board;

import javax.swing.*;
import java.awt.*;

public class BoardUI extends JPanel {

    Board board;

    public void setFrame() {
        JFrame frame = new JFrame();
        frame.setSize(800, 800);
        frame.getContentPane().add(new BoardUI());
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.DARK_GRAY);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        board = new Board();
        String[][] boardSetUp = board.getBoard();
        g.fillRect(100, 100, 600, 600);

        int x = 100;
        for (int i = 1; i < 9; i++) {

            int y = 100;
            for (int j = 1; j < 9; j++) {
                if (boardSetUp[i][j].equals("w")) {
                    g.clearRect(x, y, 75, 75);
                } else {
                    g.fillRect(x, y, 75, 75);
                }
                y += 75;
            }
            x += 75;
        }
    }
}
