package mastermind;

enum CodePeg {

    PINK_PEG('P'),
    ORANGE_PEG('O'),
    BLUE_PEG('B'),
    YELLOW_PEG('Y'),
    GREEN_PEG('G'),
    BLACK_PEG('K');

    private char symbol;

    CodePeg(char symbol) {
            this.symbol = symbol;
    }
}
