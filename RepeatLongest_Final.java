import java.util.HashSet;
import java.util.Set;

public class RepeatLongest_Final {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();

        int slow = 0;
        int max = 0;

        for (int fast = 0; fast < s.length(); fast++) {
            while (charSet.contains(s.charAt(fast))) {
                charSet.remove(s.charAt(slow));
                slow++;
            }
            charSet.add(s.charAt(fast));

            max = Math.max(max, fast - slow + 1);

        }
        return max;

    }
}
