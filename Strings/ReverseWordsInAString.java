class Solution {
    public String reverseWords(String s) {
        StringBuilder rev = new StringBuilder();
        String[] words = s.split(" ");

        for ( int i= words.length-1 ; i>=0 ; i-- ){
            if ( !words[i].isEmpty()){
            rev.append(words[i]).append(" ");
            }
        }
        if ( rev.length() > 0){
            rev.setLength(rev.length() -1 );
        }
        return rev.toString();
    }
}

public class ReverseWordsInAString {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String input = "  Hello   World  ";
        String output = solution.reverseWords(input);
        System.out.println("Reversed: '" + output + "'");   
    }
}