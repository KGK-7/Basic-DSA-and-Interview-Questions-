import java.util.*;
class CheckIfPangram {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        int count = 0;

        for (char c : sentence.toCharArray()) {
            if (set.add(c)) {
                count++;
            }
            if (count == 26) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        CheckIfPangram solution = new CheckIfPangram();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String testSentence = sc.nextLine();
        sc.close();
        
        boolean result = solution.checkIfPangram(testSentence);
        System.out.println("Is the sentence a pangram? " + result);
    }
}
