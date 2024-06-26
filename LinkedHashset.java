import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public  class LinkedHashset{
    // Function to reemove duplicates from the array list
    public static <L> List<L> removeDuplicates(List<L> list) {
        Set<L> set = new LinkedHashSet<>(list);
        return new java.util.ArrayList<>(set);
    }

    public static void main(String[] args) {
        List<String> list = java.util.Arrays.asList("12", "18", "17", "12", "16", "18");
        List<String> List = removeDuplicates(list);
        System.out.println(List);
    }
}