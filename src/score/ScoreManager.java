package score;

public class ScoreManager {
    private int score = 0;

    public void increaseScore(int points) {
        score += points;
    }

    public int getScore() {
        return score;
    }
}