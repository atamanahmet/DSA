import java.util.Random;

public class quickSortx {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
        System.out.println("Before");
        printArr(arr);

        quick(arr, 0, arr.length - 1);
        System.out.println("After");

        printArr(arr);

    }

    public static void quick(int[] arr, int low, int high) {
        if (low >= high)
            return;
        int lp = low;
        int rp = high - 1;
        int pivot = arr[high];

        while (lp < rp) {

            while (arr[lp] <= pivot && lp < rp) {
                lp++;
            }
            while (arr[rp] >= pivot && lp < rp) {
                rp--;
            }

            if (lp < rp) {
                swap(arr, lp, rp);
                lp++;
            }
        }

        if (arr[lp] > arr[high]) {
            swap(arr, lp, high);

        } else {
            lp = high;
        }
        quick(arr, low, lp - 1); // left sort
        quick(arr, lp + 1, high); // right sort
    }

    public static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
