package ss8_clean_refactoring.bai_tap.tennis_game;

public class MainTest {
    public static void main(String[] args) {
        TennisGame tennisGame = new TennisGame("nhan", "vu", 3, 3);
        if (tennisGame.getScoreOne() == tennisGame.getScoreTwo()) {
            System.out.println(tennisGame.sameScore());
        } else {
            System.out.println(tennisGame.advantagePlayer());
        }
        System.out.println(tennisGame);
    }

}
