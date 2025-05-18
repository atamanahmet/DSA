import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class RepeatLongest {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            Set<Character> sub = new HashSet<>();
            Queue<Character> queue = new LinkedList<>();
            int maxSize = 0;
            for (int i = 0; i < s.length(); i++) {
                if (!sub.contains(s.charAt(i))) {
                    sub.add(s.charAt(i));
                    queue.offer(s.charAt(i));
                    if (maxSize < queue.size()) {
                        maxSize = queue.size();
                    }
                } else {
                    if (maxSize < queue.size()) {
                        maxSize = queue.size();
                    }
                    while (true) {
                        if (queue.peek() != s.charAt(i)) {
                            sub.remove(queue.poll());
                        } else {
                            sub.remove(queue.poll());
                            break;
                        }

                    }
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
            return maxSize;
        }
    }
}
