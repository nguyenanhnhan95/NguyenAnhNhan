package ss8_clean_refactoring.bai_tap.tennis_game;

public class TennisGame {
    private String playerOne;
    private String playerTwo;
    private int scoreOne;
    private int scoreTwo;
    public String score = "";

    public TennisGame(String playerOne, String playerTwo, int scoreOne, int scoreTwo) {
        this.scoreOne = scoreOne;
        this.scoreTwo = scoreTwo;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public String getPlayerOne() {
        return playerOne;
    }

    public void setPlayerOne(String playerOne) {
        this.playerOne = playerOne;
    }

    public String getPlayerTwo() {
        return playerTwo;
    }

    public void setPlayerTwo(String playerTwo) {
        this.playerTwo = playerTwo;
    }

    public int getScoreOne() {
        return scoreOne;
    }

    public void setScoreOne(byte scoreOne) {
        this.scoreOne = scoreOne;
    }

    public int getScoreTwo() {
        return scoreTwo;
    }

    public void setScoreTwo(byte scoreTwo) {
        this.scoreTwo = scoreTwo;
    }

    public String sameScore() {
        String score = "";
        int tempScore = 0;
        if (scoreOne == scoreTwo) {
            switch (scoreOne) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        }
        return score;
    }

    public String advantagePlayer() {
        int minusResult = getScoreOne() - getScoreTwo();
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    public String displayPoint(int tempScore) {
        score = "";
        tempScore = 0;
        switch (tempScore) {
            case 0:
                score += "Love";
                break;
            case 1:
                score += "Fifteen";
                break;
            case 2:
                score += "Thirty";
                break;
            case 3:
                score += "Forty";
                break;
        }
        return score;
    }

    @Override
    public String toString() {
        return "TennisGame\n" +
                "playerOne='" + playerOne + "\n" +
                "scoreOne=" + scoreOne + displayPoint(getScoreOne()) + "\n" +
                "playerTwo='" + playerTwo + "\n" +
                "scoreTwo=" + scoreTwo + displayPoint(getScoreTwo()) + "\n";
    }
}
