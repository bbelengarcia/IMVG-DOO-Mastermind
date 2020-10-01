package mastermind;

//import java.util.List;

public class Pattern {

    private String pattern; // 4
    private CodePeg codePeg;
    //private List<Character> codepeg = List.of('P', 'O', 'G', 'K', 'B', 'Y');

    Pattern(String pattern) {
        this.pattern = pattern;
    }
    /////////////////////////////////////////////////
    //patron no lo sabe
    Boolean checkPattern() {
        if (pattern.length() == 4) {
            //codepeg.forEach(peg -> pattern.matches(peg.toString()));
            for (char peg: pattern.toCharArray ()) { 
               if (!codePeg.isCorrect(peg)) {
                   return false;
               } 
            }
            return true;
        } else {
            Message.WRONG_LENGTH.writeln();
            return false;
        }
    }
}
