public class sortColors {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 0, 1, 1, 0, 2 };
        print(nums);

        int[] counts = { 0, 0, 0 };
        for (int i = 0; i < nums.length; i++) {
            counts[nums[i]] += 1;
        }
        int mIdx = 0;
        for (int i = 0; i < counts.length; i++) {
            while (counts[i] > 0) {
                nums[mIdx] = i;
                mIdx++;
                counts[i] -= 1;
            }
        }
        System.out.println();
        print(nums);

    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
