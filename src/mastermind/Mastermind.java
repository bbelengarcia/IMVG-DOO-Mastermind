package mastermind;

import mastermind.utils.WithConsoleModel;

public class Mastermind extends WithConsoleModel {

    private Turn[] turns;
    private Integer currentTurn;

    private void play() {
        Message.START_GAME.writeln();
        Message.SEPARATOR.writeln();
        this.turns = new Turn[10];
        this.currentTurn = 0;
        do {
            Message.ATTEMPT.write();
            console.writeln(currentTurn + 1);
            Message.PROPOSE_COMBINATION.write();
            this.turns[currentTurn] = new Turn(console.readString());
            this.turns[currentTurn].play();
            currentTurn += 1;
        } while (this.currentTurn <= turns.length);
    }

    public static void main(final String[] args) throws Exception {
        new Mastermind().play();
    }
}
