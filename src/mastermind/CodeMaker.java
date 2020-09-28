package mastermind;

public class CodeMaker {

    private CodePeg[] patternSecret;

    CodeMaker() {
        setRandom();
    }

    public String getPatternSecret(){
        return patternSecret.toString();
    }
    //SE PUEDE REPETIR COLOR=???
    void setRandom(){
        for (int i = 0; i < 4; i++){
            int r = (int) Math.floor(Math.random()*6+1);
            var codePeg = CodePeg.values();
            patternSecret[i] = codePeg[r];
        }
        System.out.println(patternSecret);
    }
}
