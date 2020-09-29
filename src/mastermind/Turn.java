package mastermind;

import mastermind.utils.WithConsoleModel;

public class Turn extends WithConsoleModel {

    private Board board;
    private CodeMaker codeMaker;
    private CodeBreaker codeBreaker;
    private int currentAttemp = 1;

    Turn(Board board){
        this.board = board;
    }

    void play(){
        do {
            Pattern codeGuess = codeBreaker.createCodeGuess();
            Message.ATTEMPT.write();
            console.writeln(currentAttemp);
            if(board.fillRowGuess(codeGuess, currentAttemp)){
                currentAttemp = currentAttemp + 1;
                codeMaker.verifyCodeMakerPattern(codeGuess);
            }
        } while (currentAttemp <= board.rowsGuess.length);
    }
}
