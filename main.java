 import java.util.*;

public class main {

    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            // Convert string into character array
            char[] chars = str.toCharArray();

            // Sort characters
            Arrays.sort(chars);

            // Sorted string becomes the key
            String key = new String(chars);

            // Create list if key doesn't exist
            map.putIfAbsent(key, new ArrayList<>());

            // Add original word
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        String[] strs = {
            "eat", "tea", "tan", "ate", "nat", "bat"
        };

        List<List<String>> result = groupAnagrams(strs);

        System.out.println(result);
    }
} 
