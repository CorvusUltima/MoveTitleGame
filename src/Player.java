
public class Player {
    private String name;
    private int totalScore;
    boolean turn = false;

    public void setName(String name) {
        this.name = name;
    }

    void setTotalScore(int score) {
        totalScore += score;
    }

    public String getName() {
        return this.name;
    }

    public int getTotalScore() {
        return this.totalScore;
    }

    void changeTurn() {
        turn ^= true;
    }

    public boolean getTurn() {
        return this.turn;
    }

}

