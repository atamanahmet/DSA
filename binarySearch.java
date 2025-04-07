////inProgress

import java.util.Arrays;
import java.util.Random;

public class binarySearch {

    public static void main(String[] args) {
        int[] arr = new int[10];
        // Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        // System.out.println("Before");
        // System.out.println();
        // printArr(arr);
        int searchNumber = 9;
        printArr(arr);
        int index = binaryS(arr, searchNumber, 0, arr.length);
        if (index < 0) {
            System.out.println("Not exist.");
            return;
        }
        System.out.println("Found at index " + index);
        System.out.println();

    }

    public static int binaryS(int[] arr, int searchNumber, int lower, int upper) {
        if (lower >= upper)
            return -1;
        int mid = upper / 2;
        if (arr[mid] == searchNumber)
            return mid;

        if (arr[mid] > searchNumber) {
            int[] right = Arrays.copyOfRange(arr, lower, mid - 1);
            binaryS(right, searchNumber, lower, right.length);
        } else {
            int[] left = Arrays.copyOfRange(arr, mid + 1, upper);

            binaryS(left, searchNumber, 0, left.length);
        }
        return (arr[mid] == searchNumber) ? mid : -1;

    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
