package mastermind;

public class Pattern {

    private CodePeg[] codePegs; // 4

    Pattern(String pattern) {
        this.codePegs = new CodePeg[4];
        for (int i = 0; i < pattern.toCharArray().length; i++){
            this.codePegs[i] = new CodePeg(pattern.toCharArray()[i]);
        }
        this.checkPattern(pattern);
    }

    void checkPattern(String userPattern) {
        if (userPattern.length() == 4) {
            userPattern.toCharArray();

        } else {
            Message.WRONG_LENGTH.writeln();
        }
    }

}
