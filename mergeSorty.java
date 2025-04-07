public class mergeSorty {
    public static void main(String[] args) {
        int[] arr = { 4, 6, 1, 2, 3, 5, 7, 9, 6, 4, 3, 6, 3, 2, 5, 7, 8, 1, 5, 6 };
        System.out.println("Before: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        mergeSortArr(arr);
        System.out.println("After: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void mergeSortArr(int[] arr) {
        int size = arr.length;

        if (size <= 1)
            return;

        int mid = size / 2;

        int[] left = new int[mid];
        int[] right = new int[size - mid];

        int rp = 0; // right Pointer
        for (int i = 0; i < size; i++) {
            if (i < mid) {
                left[i] = arr[i];
            } else {
                right[rp] = arr[i];
                rp++;
            }
        }
        mergeSortArr(left);
        mergeSortArr(right);
        merge(arr, left, right, size);
    }

    public static void merge(int[] arr, int[] left, int[] right, int size) {
        int lIdx = 0;
        int rIdx = 0;
        int mIdx = 0;
        while (mIdx < size) {
            if (lIdx >= left.length || rIdx >= right.length) {
                break;
            }
            if (left[lIdx] <= right[rIdx]) {
                arr[mIdx] = left[lIdx];
                lIdx++;
            } else {
                arr[mIdx] = right[rIdx];
                rIdx++;
            }
            mIdx++;
        }
        while (lIdx < left.length) {
            arr[mIdx] = left[lIdx];
            lIdx++;
            mIdx++;
        }
        while (rIdx < right.length) {
            arr[mIdx] = right[rIdx];
            rIdx++;
            mIdx++;
        }
    }
}
