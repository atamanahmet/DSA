public class mergeSort2 {
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
        if (arr.length <= 1)
            return;
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
        int rightPointer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < mid) {
                left[i] = arr[i];
            } else {
                right[rightPointer] = arr[i];
                rightPointer++;
            }
        }
        mergeRecursive(left);
        mergeRecursive(right);
        merge(left, right, arr);
    }

    public static void merge(int[] left, int[] right, int[] arr) {
        int lP = 0;
        int rP = 0;
        int mP = 0;

        // arr[mP] = (left[lP]<=right[rP]) ? left[lP] : right[rP];
        while (mP < arr.length) {
            if (lP >= left.length || rP >= right.length)
                break;
            if (left[lP] <= right[rP]) {
                arr[mP] = left[lP];
                lP++;
            } else {
                arr[mP] = right[rP];
                rP++;
            }
            mP++;
        }
        while (lP < left.length) {
            arr[mP] = left[lP];
            mP++;
            lP++;
        }
        while (rP < right.length) {
            arr[mP] = right[rP];
            mP++;
            rP++;
        }

    }

}
