import java.util.*;
public class anagram {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan ", "kill", "nat", "bat"};
        List<List<String>> result = groupAnagrams(strs);
        for (List<String> list : result) {
            System.out.println(list);
        }
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = String.valueOf(chars);

            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
