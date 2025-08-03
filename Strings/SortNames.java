import java.util.Arrays;
import java.util.Scanner;

public class SortNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }
        sc.close();
        Arrays.sort(names);

        System.out.println("Sorted names (comma-separated):");
        System.out.println(String.join(", ", names));

        System.out.println("Sorted names (space-separated):");
        System.out.println(String.join(" ", names));
    }
}
