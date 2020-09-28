package mastermind;

import mastermind.utils.Console;

enum CodePeg {

    PINK_PEG('P'),
    ORANGE_PEG('O'),
    BLUE_PEG('B'),
    YELLOW_PEG('Y'),
    GREEN_PEG('G'),
    BLACK_PEG('K');

    private char symbol;
    private static Console console = new Console();

    private CodePeg(char symbol) {
        this.symbol = symbol;
    }

    void write() {
        CodePeg.console.write(this.symbol);
    }
    
}
