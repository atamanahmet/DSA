import java.util.ArrayList;
import java.util.List;

public class kidsWithCandies {
    class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

            int largest = 0;

            List<Boolean> res = new ArrayList<>();

            for (int candyCount : candies) {
                if (candyCount > largest)
                    largest = candyCount;

            }
            for (int candyCount : candies) {
                if (candyCount + extraCandies >= largest) {
                    res.add(true);
                } else {
                    res.add(false);
                }
            }
            return res;
        }
    }
}
