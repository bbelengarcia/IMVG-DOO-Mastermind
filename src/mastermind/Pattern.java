package mastermind;

import java.util.Arrays;

public class Pattern {

    private CodePeg[] codePegs; // 4

    Pattern(String pattern) {
        //this.codePegs = new CodePeg[4];
        this.checkPattern(pattern);
    }
    
    void checkPattern(String userPattern) {
        char [] newPattern = pattern.toCharArray();
        for (int i = 0; i < pattern.toCharArray().length; i++){
            //this.codePegs[i] = new CodePeg(pattern.toCharArray()[i]);
            if( ){
                //Arrays.toString(CodePeg.values())
            }else{
                Message.console.write("This choise isnt a peg");
            }

        }
        if (userPattern.length() == 4) {
            userPattern.toCharArray();

        } else {
            Message.WRONG_LENGTH.writeln();
        }
    }

}
