import java.util.HashSet;
import java.util.Set;

class PangramSolution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> myset = new HashSet<>();
        byte count = 0;

        for(char c : sentence.toCharArray()){
            if (myset.add(c)){
                count++ ;
            }
            if (count == 26){
                return true;
            }
        }
        return false;
        
    }
}

public class pangramChecker {
    public static void main(String[] args) {
        PangramSolution solution = new PangramSolution();
        String testSentence = "the quick brown fox jumps over the lazy dog";
        boolean result = solution.checkIfPangram(testSentence);
        System.out.println("Is the sentence a pangram? " + result);
    }
}