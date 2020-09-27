package mastermind;

import mastermind.utils.WithConsoleModel;

public class Turn extends WithConsoleModel {

    private Pattern pattern;

    Turn(String pattern) {
        this.pattern = new Pattern(pattern);
    }

    void play() {
       
    }
}
