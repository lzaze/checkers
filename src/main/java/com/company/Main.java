package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.company.game.logic.Board;
import com.company.game.BoardUI;

public class Main {

    public static void main(String[] args) throws IOException {

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        BoardUI boardUI = new BoardUI();

        while (true) {
            boardUI.setFrame();
            System.out.print(" > ");
            String command = reader.readLine();
            if (command.equalsIgnoreCase("quit")) {
                break;
            } else {
                System.out.println(command.toUpperCase());
            }
        }
    }
}
