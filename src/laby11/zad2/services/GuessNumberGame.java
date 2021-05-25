package laby11.zad2.services;

import laby11.zad2.panels.GamePanel;

import java.awt.*;
import java.util.Random;

public class GuessNumberGame {

    private static int PC_NUMBER;
    private GamePanel gamePanel;

    public GuessNumberGame(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    public void startGame () {
        generateNumber();
    }

    public void validateInput (int input) {

        if (input > PC_NUMBER) {
            gamePanel.getInfoLabel().setForeground(Color.RED);
            gamePanel.getInfoLabel().setText("Za duzo!");
        }
        if (input < PC_NUMBER) {
            gamePanel.getInfoLabel().setForeground(Color.RED);
            gamePanel.getInfoLabel().setText("Za malo!");
        }
        if (input == PC_NUMBER) {
            gamePanel.getInfoLabel().setForeground(Color.BLUE);
            gamePanel.getInfoLabel().setText("Gratulacje wygrales! Nowa liczba zostala wylosowana");
            startGame();
        }
    }

    private static void generateNumber () {
        Random random = new Random();
        PC_NUMBER = random.nextInt(100);
        if (PC_NUMBER == 0) {PC_NUMBER = 1;}
    }
}
