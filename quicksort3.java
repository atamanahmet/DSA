import java.util.Random;

public class quicksort3 {
    public static void main(String[] args) {
        int[] arr = new int[50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);
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

    public static void quickSortManual(int[] arr, int start, int end) {
        if (start >= end) // base case
            return;

        int pi = partition(arr, start, end);

        quickSortManual(arr, start, pi - 1);
        quickSortManual(arr, pi + 1, end);

    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];

        int i = start - 1;
        for (int j = start; j <= end - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        i++;
        swap(arr, i, end); // j=end case
        return i;
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
