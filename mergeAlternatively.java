public class mergeAlternatively {
    class Solution {
        public String mergeAlternately(String word1, String word2) {

            if (word1.isEmpty())
                return word2;
            if (word2.isEmpty())
                return word1;

            StringBuilder res = new StringBuilder();

            int l1 = word1.length();
            int l2 = word2.length();

            int p1 = 0;
            int p2 = 0;

            while (p1 < l1 && p2 < l2) {
                if (p1 == p2) {
                    res.append(word1.charAt(p1++));
                } else {
                    res.append(word2.charAt(p2++));
                }
            }

            if (p1 >= l1) {
                res.append(word2.substring(p2));
            } else {
                res.append(word1.substring(p1));
            }

            return res.toString();
        }
    }
}
