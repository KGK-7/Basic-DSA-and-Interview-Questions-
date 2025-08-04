import java.util.*;

public class RemoveDuplicatesSet {
    public static void main(String[] args) {
        int[] arr = {4, 5, 4, 2, 2, 3, 1, 5};

        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        System.out.println("Array after removing duplicates:");
        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}
