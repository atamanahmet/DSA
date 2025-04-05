public class mergeSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 5, 1, 8, 4, 6, 7, 9, 2 };
        mergeRecursive(arr);
        String strRes = "";
        for (int i : arr) {
            strRes += i + " ";
        }
        System.out.println(strRes);
    }

    public static void mergeRecursive(int[] arr) {
        int length = arr.length;
        if (length <= 1)
            return;

        int mid = length / 2;
        int[] left = new int[mid];
        int[] right = new int[length - mid];
        int index = 0;
        int rIndex = 0;

        for (; index < arr.length; index++) {
            if (index < mid) {
                left[index] = arr[index];
            } else {
                right[rIndex] = arr[index];
                rIndex++;
            }
        }
        mergeRecursive(left);
        mergeRecursive(right);
        merge(left, right, arr);

    }

    public static void merge(int[] left, int[] right, int[] arr) {
        int lIndex = 0;
        int rIndex = 0;
        int mainIndex = 0;
        while (lIndex < left.length && rIndex < right.length) {
            if (left[lIndex] <= right[rIndex]) {
                arr[mainIndex] = left[lIndex];
                lIndex++;
                mainIndex++;
            } else {
                arr[mainIndex] = right[rIndex];
                rIndex++;
                mainIndex++;
            }
        }
        while (lIndex < left.length) {
            arr[mainIndex] = left[lIndex];
            lIndex++;
            mainIndex++;
        }
        while (rIndex < right.length) {
            arr[mainIndex] = right[rIndex];
            rIndex++;
            mainIndex++;
        }
    }
}
