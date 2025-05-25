public class flowerBed {
    class Solution {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {

            if (flowerbed.length == 1) {
                if (flowerbed[0] == 0)
                    return (n == 1) ? true : false;
                else
                    return (n == 0) ? true : false;
            }

            int addedFlower = 0;
            int zeroCount = 0;

            for (int i = 0; i < flowerbed.length; i++) {
                if (i == 0 && flowerbed[i + 1] == 0 && i < flowerbed.length) {
                    addedFlower++;
                }
                if (zeroCount == 3) {
                    zeroCount = 0;
                    addedFlower++;
                }
                if (i == flowerbed.length - 1 && i - 1 > 0 && flowerbed[i - 1] == 0 && flowerbed[i] != 1)
                    addedFlower++;

            }
            return (n == addedFlower) ? true : false;
        }
    }
}
