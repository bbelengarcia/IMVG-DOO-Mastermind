package mastermind;

import mastermind.utils.Console;

enum KeyPeg {

    WHITE_PEG('W'),
    RED_PEG('R');

    private char symbol;
    private static Console console = new Console();
    
    private KeyPeg(char symbol){
        this.symbol =  symbol;
    }

    void write() {
        KeyPeg.console.write(this.symbol);
    }
}
