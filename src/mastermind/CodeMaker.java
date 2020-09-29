package mastermind;

import java.util.ArrayList;
import java.util.List;

public class CodeMaker {

    private Pattern patternSecret;

    CodeMaker() {
        setRandom();
    }

    public Pattern getPatternSecret(){
        return patternSecret;
    }

    void setRandom(){
        List<CodePeg> patternSecretArray = new ArrayList<>();
        List<Integer> typeCodePeg = new ArrayList<>();
        for (int i = 0; i < 4; i++){
            int  r = (int) Math.floor(Math.random()*6+1);
            while (!typeCodePeg.isEmpty() && typeCodePeg.contains(r)) {
                r = (int) Math.floor(Math.random()*6+1);
            }
            typeCodePeg.add(r) ;
            var codePeg = CodePeg.values();
            patternSecretArray.add(codePeg[typeCodePeg.get(i)]);
        }
        patternSecret = new Pattern(patternSecretArray.toString());
    }

    void verifyCodeMakerPattern(Pattern pattern){
        
    }
}
