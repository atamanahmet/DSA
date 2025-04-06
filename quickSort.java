import java.util.Random;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(10);
        }

        System.out.println("Before: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

        quickSortManual(arr, 0, arr.length - 1);

        System.out.println("After: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void quickSortManual(int[] arr, int low, int high) {
        if (low >= high)
            return;

        int pivotIdx = new Random().nextInt(high - low) + low;
        int pivot = arr[pivotIdx];
        swap(arr, pivotIdx, high);

        int left = partition(arr, low, high, pivot);

        quickSortManual(arr, low, left - 1);
        quickSortManual(arr, left + 1, high);
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static int partition(int[] arr, int low, int high, int pivot) {
        int left = low;
        int right = high - 1;
        while (left < right) {
            while (arr[left] <= pivot && left < right) {
                left++;
            }
            while (arr[right] >= pivot && left < right) {
                right--;
            }
            if (left < right) {
                swap(arr, left, right);
                left++;
                right++;
            }
        }

        swap(arr, left, high);

        if (arr[left] > arr[high]) {
            swap(arr, left, high);
        } else {
            left = high;
        }
        return left;
    }
}
