import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class RepeatLongest {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int left = 0;
            int max = 0;
            Set<Character> set = new HashSet();

            for (int r = 0; r < s.length(); r++) {

                while (set.contains(s.charAt(r))) {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(s.charAt(r));
                if (max < set.size()) {
                    max = set.size();
                }
            }

            return max;

        }
    }
    // for(int i = 0; i< s.length();i++){
    // if(!sub.contains(s.charAt(i))){
    // sub.add(s.charAt(i));
    // if(maxSize<sub.size()){
    // maxSize = sub.size();
    // }
    // }
    // else{
    // if(maxSize<sub.size()){
    // maxSize = sub.size();
    // }
    // sub.clear();
    // sub.add(s.charAt(i));
    // }
    // }
}
