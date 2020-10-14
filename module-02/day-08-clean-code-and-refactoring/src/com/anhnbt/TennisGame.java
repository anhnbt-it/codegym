/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/14/2020
 * Time: 5:01 PM
 */

package com.anhnbt;

public class TennisGame {

    private int playerOneScore = 0;
    private int playerTwoScore = 0;
    private String playerOneName;
    private String playerTwoName;

    public TennisGame() {

    }

    public TennisGame(String playerOneName, String playerTwoName) {
        this.playerOneName = playerOneName;
        this.playerTwoName = playerTwoName;
    }

    private String getScore() {

        if (hasWinner()) {
            return playerWithHighestScore() + " wins";
        }

        if (hasAdvantage()) {
            return "Advantage " + playerWithHighestScore();
        }

        if (isDeuce()) {
            return "Deuce";
        }

        if (playerOneScore == playerTwoScore) {
            return translateScore(playerOneScore) + " all";
        }

        return translateScore(playerOneScore) + ", " + translateScore(playerTwoScore);

    }

    private boolean isDeuce() {
        return playerOneScore >= 3 && playerTwoScore == playerOneScore;
    }

    private String playerWithHighestScore() {
        if (playerOneScore > playerTwoScore) {
            return playerOneName;
        } else {
            return playerTwoName;
        }
    }

    private boolean hasWinner() {
        if (playerTwoScore >= 4 &&
                playerTwoScore >= playerOneScore + 2) {
            return true;
        }
        if (playerOneScore >= 4 &&
                playerOneScore >= playerTwoScore + 2) {
            return true;
        }
        return false;
    }

    private boolean hasAdvantage() {
        if (playerTwoScore >= 4 &&
                playerTwoScore == playerOneScore + 1) {
            return true;
        }
        if (playerOneScore >= 4 &&
                playerOneScore == playerTwoScore + 1) {
            return true;
        }
        return false;
    }

    private void playerOneScores() {
        playerOneScore++;
    }

    private void playerTwoScores() {
        playerTwoScore++;
    }

    private String translateScore(int score) {
        switch(score) {
            case 1:
                return "Forty";
            case 2:
                return "Thirty";
            case 3:
                return "Fifteen";
            case 0:
                return "Love";
        }
        throw new IllegalArgumentException("Illegal score: " + score);
    }

    public static void main(String[] args) {
        TennisGame tennisGame = new TennisGame("Tuan Anh", "Khoai Tay");
        tennisGame.playerOneScores();
        tennisGame.playerOneScores();
        System.out.println(tennisGame.getScore());
    }
}
