public class binarySearch {

    public static void main(String[] args) {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        int searchNumber = 999;

        int index = binaryS(arr, searchNumber, 0, arr.length);

        if (index < 0) {
            System.out.println("Not exist.");
            return;
        }
        System.out.println("Found at index " + index + ": " + arr[index]);
        System.out.println();

    }

    public static int binaryS(int[] arr, int searchNumber, int lower, int upper) {

        if (lower >= upper)
            return -1;

        int mid = ((upper - lower) / 2) + lower;

        System.out.println("Mid: " + mid);

        if (arr[mid] == searchNumber)
            return mid;

        return (arr[mid] < searchNumber) ? binaryS(arr, searchNumber, mid + 1, upper)
                : binaryS(arr, searchNumber, lower, mid - 1);

        // if (arr[mid] < searchNumber) {
        // return binaryS(arr, searchNumber, mid + 1, upper);
        // } else {
        // return binaryS(arr, searchNumber, lower, mid - 1);
        // }
    }

}
