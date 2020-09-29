package mastermind;

import mastermind.utils.WithConsoleModel;

public class Mastermind extends WithConsoleModel {

    private Board board;
    private CodeMaker codeMaker;
    private CodeBreaker codeBreaker;

    private void play() {
        Message.START_GAME.writeln();
        Message.SEPARATOR.writeln();
        board = new Board();
        codeMaker = new CodeMaker();
        //board.fillRowSecret(codeMaker.getPatternSecret());
        codeBreaker = new CodeBreaker();
        board.play(codeMaker.getPatternSecret())
        //Comprobar para terminar
    }

    public static void main(final String[] args) throws Exception {
        new Mastermind().play();
    }
}
