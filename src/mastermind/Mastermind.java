package mastermind;

import mastermind.utils.WithConsoleModel;

public class Mastermind extends WithConsoleModel {

    private Board board;
    private CodeMaker codeMaker;
    private CodeBreaker codeBreaker;

    private void play() {
        Message.START_GAME.writeln();
        Message.SEPARATOR.writeln();
        codeMaker = new CodeMaker();
        codeBreaker = new CodeBreaker();
        board = new Board(codeMaker.getPatternSecret());
    }
    public static void main(final String[] args) throws Exception {
        new Mastermind().play();
    }
}
