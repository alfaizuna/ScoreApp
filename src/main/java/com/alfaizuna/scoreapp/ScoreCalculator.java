package com.alfaizuna.scoreapp;

public class ScoreCalculator {
    public static String calculateScore(Game game) {
        int player1Score = game.getPlayer1Score();
        int player2Score = game.getPlayer2Score();

        if (player1Score >= 21 && player1Score - player2Score >= 2) {
            return "Player 1 wins!";
        } else if (player2Score >= 21 && player2Score - player1Score >= 2) {
            return "Player 2 wins!";
        } else {
            return "Current Score - Player 1: " + player1Score + ", Player 2: " + player2Score;
        }
    }
}

