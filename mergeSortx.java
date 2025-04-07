public class mergeSortx {
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
        if (size <= 1) {
            return;
        }

        int mid = size / 2;
        int[] left = new int[mid];
        int[] right = new int[size - mid];
        int rightIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < mid) {
                left[i] = arr[i];
            } else {
                right[rightIdx] = arr[i];
                rightIdx++;
            }
        }

        mergeSortArr(left);
        mergeSortArr(right);

        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int mainIdx = 0;
        int leftIdx = 0;
        int rightIdx = 0;
        while (mainIdx < arr.length) {
            if (leftIdx >= left.length || rightIdx >= right.length)
                break;
            if (left[leftIdx] <= right[rightIdx]) {
                arr[mainIdx] = left[leftIdx];
                leftIdx++;
            } else {
                arr[mainIdx] = right[rightIdx];
                rightIdx++;
            }
            mainIdx++;

        }
        while (leftIdx < left.length) {
            arr[mainIdx] = left[leftIdx];
            leftIdx++;
            mainIdx++;
        }
        while (rightIdx < right.length) {
            arr[mainIdx] = right[rightIdx];
            rightIdx++;
            mainIdx++;
        }
    }

    public static void printArr(int[] arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}