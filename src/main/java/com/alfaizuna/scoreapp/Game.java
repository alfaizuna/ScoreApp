package com.alfaizuna.scoreapp;

public class Game {
    private int player1Score;
    private int player2Score;

    public Game() {
        this.player1Score = 0;
        this.player2Score = 0;
    }

    public int getPlayer1Score() {
        return player1Score;
    }

    public int getPlayer2Score() {
        return player2Score;
    }

    public void player1Scores() {
        player1Score++;
    }

    public void player2Scores() {
        player2Score++;
    }
}

