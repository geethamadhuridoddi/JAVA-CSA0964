import java.util.*;
public class Union {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("A");
        set1.add("B");
        set1.add("C");

        Set<String> set2 = new HashSet<>();
        set2.add("C");
        set2.add("D");
        set2.add("E");

        Set<String> union = union(set1, set2);

        System.out.println("Union: " + union);
    }

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> union = new HashSet<>(set1);
        union.addAll(set2);
        return union;
    }
}