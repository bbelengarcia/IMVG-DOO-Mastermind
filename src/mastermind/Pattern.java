package mastermind;

import java.util.Arrays;

public class Pattern {
    //Si pattern es array de CodePeg
    //private Pattern[CodePeg] pattern; // 4

    Pattern(CodePeg[] pattern) {
        this.checkPattern(pattern);
    }
    
    void checkPattern(CodePeg[] pattern) {
        //char [] newPattern = pattern.toCharArray();
        for (int i = 0; i < pattern.length; i++){
            // CodePeg.stream().forEach();
            //if (){
                
            //}else{
            //    Message.console.write("Some choise isnt a peg");
            //}

        }
        if (pattern.length == 4) {
            pattern.toCharArray();

        } else {
            Message.WRONG_LENGTH.writeln();
        }
    }
}
