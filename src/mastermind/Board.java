package mastermind;

import mastermind.utils.WithConsoleModel;

public class Board extends WithConsoleModel {

    private RowGuess [] rowsGuess; //10
    private RowSecret rowSecret; //1
    private int currentAttemp = 0;

    Board() {
        rowsGuess = new RowGuess[10];
        //rowSecret = new RowSecret();
    }

    void play(){
        Message.ATTEMPT.write();
        currentAttemp = currentAttemp + 1;
        console.writeln(currentAttemp);
        fillRowGuess(new Pattern (console.readString()));
    }

    void fillRowSecret(Pattern patternSecret) {
        rowSecret = new RowSecret(patternSecret);
    }

    void fillRowGuess(Pattern codeGuess){
        rowsGuess[currentAttemp-1] = new RowGuess(codeGuess);
    }
}
