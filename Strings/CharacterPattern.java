public class CharacterPattern {
    public static void main(String[] args) {
        int rows = 4;
        int count = 0;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                char current = (char) ('A' + count);
                if (count % 2 == 0) {
                    System.out.print(Character.toUpperCase(current) + " ");
                } else {
                    System.out.print(Character.toLowerCase(current) + " ");
                }
                count++;
            }
            System.out.println();
        }
    }
}
