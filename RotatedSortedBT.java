public class RotatedSortedBT {

    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + ((high - low) / 2);
            // if(mid!=0&&nums[mid]<nums[mid-1]) return nums[mid];
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }
}

// class Solution {

// //wout logn
// public int findMin(int[] nums) {
// int smaller = Integer.MAX_VALUE; //5000

// for(int num : nums){
// if(num<smaller){
// smaller = num;
// }
// }
// return smaller;
// }
// }
