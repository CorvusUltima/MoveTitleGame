
public class Player {
    private String name;
    boolean turn = false;
    public int score = 0;

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return this.name;
    }

    String Name;
    boolean FrstToPlay=false;
    int diceNum=0;
    String Answer;
    void changeTurn() {
        turn ^= true;
    }

    void setTurnTrue(){
        turn = true;
    }

    void setTurnFalse(){
        turn = false;
    }

    public boolean getTurn() {
        return this.turn;
    }

}

