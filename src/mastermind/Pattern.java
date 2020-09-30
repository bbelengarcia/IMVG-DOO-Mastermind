package mastermind;

import java.util.List;

public class Pattern {

    private String pattern; // 4
    //private List<Character> codepeg = List.of('P', 'O', 'G', 'K', 'B', 'Y');

    Pattern(String pattern) {
        this.pattern = pattern;
    }
    /////////////////////////////////////////////////
    Boolean checkPattern() {
        if (pattern.length() == 4) {
            //codepeg.forEach(peg -> pattern.matches(peg.toString()));
            //pattern.forEach()
            //or (char c: str.toCharArray ()) { System.out.println (c); }
            return true;
        } else {
            Message.WRONG_LENGTH.writeln();
            return false;
        }
    }
}
