import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class dsa {

    public static void main(String[] args) {
        int[] nums = { 3, 3 };
        int target = 6;
        Map<Integer, Integer> table = new HashMap<>();
        System.out.println(Arrays.toString(twoSum(nums, target, table)));
    }

    public static int[] twoSum(int[] nums, int target, Map<Integer, Integer> table) {
        for (int i = 0; i < nums.length; i++) {

            int otherNumber = target - nums[i];

            if (table.containsKey(otherNumber)) {
                return new int[] { i, table.get(otherNumber) };
            }

            table.put(nums[i], i);

        }
        return null;

    }
}

// Brute force O(n^2)

// import java.util.Arrays;

// public class dsa {

// public static void main(String[] args) {
// int[] nums = { 2, 7, 11, 15 };
// int target = 9;
// System.out.println(Arrays.toString(twoSum(nums, target)));
// }

// public static int[] twoSum(int[] nums, int target) {
// for (int i = 0; i < nums.length; i++) {
// for (int k = i + 1; k < nums.length; k++) {
// if (k <= nums.length) {
// if (i == k) {
// continue;
// }
// if (nums[i] + nums[k] == target) {
// return new int[] { i, k };

// }
// }

// }
// }
// return null;

// }
// }

// import java.util.HashMap;
// import java.util.Map;

// public class dsa {
// public static void main(String[] args) {
// String s = "()[]{}";
// Map<Character, Character> map = new HashMap<>();
// map.put('{', '}');
// map.put('[', ']');
// map.put('(', ')');
// System.out.println(isValid(s, map));
// }

// public static boolean isValid(String s, Map<Character, Character> map) {
// int checkIndex = s.length();

// if ((checkIndex) % 2 != 0) {
// return false;
// }

// Character[] arr = new Character[checkIndex];

// for (int i = 0; i < checkIndex; i++) {
// arr[i] = s.charAt(i);
// }

// checkIndex--; // 5,4

// if (arr[1] == map.get(arr[0]) && checkIndex >= 3) {
// for (int i = 3; i < arr.length; i = i + 2) {
// if (map.get(arr[i - 1]) != arr[i]) {
// return false;
// }
// }
// return true;
// } else {
// for (int i = 0; i < s.length() / 2; i++) {
// if (arr[checkIndex] != map.get(arr[i])) {
// return false;
// }
// checkIndex--;
// }
// return true;
// }

// }
// }

// // import java.util.Arrays;
// // import java.util.HashMap;
// // import java.util.Map;

// // public class dsa {
// // public static void main(String[] args) {
// // String[] par = new String[] { "(", "[", "{", "]", ")" };
// // // System.out.println(Arrays.toString(nums));

// // // System.out.println(Arrays.toString(removeDup(nums)));
// // Map<Character, Character> map = new HashMap<>();
// // map.put('{', '}');
// // map.put('[', ']');
// // map.put('(', ')');
// // System.out.println(removeDup(par, map));
// // String s = "asd";
// // Character[] arr = new Character[s.length()];
// // for (int i = 0; i < s.length(); i++) {
// // arr[i] = s.charAt(i);
// // }
// // }

// // public static boolean removeDup(String[] par, Map<String, String> map) {
// // int checkIndex = par.length;
// // if ((checkIndex) % 2 != 0) {
// // return false;
// // }
// // checkIndex--; // 5,4

// // for (int i = 0; i < par.length / 2; i++) {
// // if (!par[checkIndex].equals(map.get(par[i]))) {
// // return false;
// // }
// // checkIndex--;

// // }
// // return true;

// // // int n = nums.length;
// // // int[] ans = new int[n * 2];
// // // for (int i = 0; i < n; i++) {
// // // ans[i] = nums[i];
// // // ans[i + n] = nums[i];
// // // }
// // // return ans;
// // // int cache = nums[0]; // 1
// // // int uniqueCounter = 1;
// // // for (int i = 1; i < nums.length; i++) {
// // // if (cache != nums[i]) {
// // // cache = nums[uniqueCounter] = nums[i];
// // // uniqueCounter++;
// // // }
// // // }
// // // return uniqueCounter;
// // }
// // }

// // import java.util.Arrays;

// // public class dsa {
// // public static void main(String[] args) {
// // int[] nums = new int[] { 1, 1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 6, 8, 9, 9, 9 };
// // System.out.println(Arrays.toString(nums));

// // System.out.println(removeDup(nums));
// // System.out.println(Arrays.toString(nums));

// // }

// // public static int removeDup(int[] nums) {
// // int cache = nums[0]; // 1
// // int uniqueCounter = 1;
// // for (int i = 1; i < nums.length; i++) {
// // if (cache != nums[i]) {
// // cache = nums[uniqueCounter] = nums[i];
// // uniqueCounter++;
// // }
// // }
// // return uniqueCounter;
// // }
// // }

// // import java.util.Arrays;

// // public class dsa {
// // public static void main(String[] args) {
// // int[] nums = new int[] { 0, 1, 2, 2, 3, 0, 4, 2 };
// // int val = 2;
// // System.out.println(Arrays.toString(nums));

// // System.out.println(removeVal(nums, val));

// // System.out.println(Arrays.toString(nums));

// // }

// // public static int removeVal(int[] nums, int val) {
// // int nonValIndex = 0;
// // for (int i = 0; i < nums.length; i++) {
// // if (nums[i] != val) {
// // nums[nonValIndex] = nums[i];
// // nonValIndex++;
// // } else
// // continue;
// // }
// // return nonValIndex;
// // }
// // }