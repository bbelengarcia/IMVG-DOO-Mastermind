package mastermind;

import mastermind.utils.WithConsoleModel;

public class CodeBreaker extends WithConsoleModel {

    private Pattern codeGuess;

    Pattern createCodeGuess(){
        codeGuess = new Pattern(console.readString());
        return codeGuess;
    }
}
