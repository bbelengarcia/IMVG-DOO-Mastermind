package mastermind;

import mastermind.utils.WithConsoleModel;

public class Board{

    public RowGuess [] rowsGuess; //10
    private RowSecret rowSecret; //1

    Board(Pattern patternSecret) {
        rowsGuess = new RowGuess[10];
        fillRowSecret(patternSecret);
        //rowSecret = new RowSecret();
    }

    void fillRowSecret(Pattern patternSecret) {
        rowSecret = new RowSecret(patternSecret);
    }

    Boolean fillRowGuess(Pattern codeGuess, int currentAttemp){
        if(codeGuess.checkPattern()){
            rowsGuess[currentAttemp-1] = new RowGuess(codeGuess);
            return true;
        }
        return false;
    }
}
