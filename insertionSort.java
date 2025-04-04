public class insertionSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 5, 1, 8, 4, 6, 7, 9, 2 };
        int[] result = insertion(arr);
        String strRes = "";
        for (int i : result) {
            strRes += i + " ";
        }
        System.out.println(strRes);
    }

    public static int[] insertion(int[] arr) {
        int pointer;
        for (int i = 1; i < arr.length; i++) {
            pointer = i - 1;
            while (pointer >= 0) {
                if (arr[pointer] > arr[pointer + 1]) {
                    int temp = arr[pointer];
                    arr[pointer] = arr[pointer + 1];
                    arr[pointer + 1] = temp;
                }
                pointer -= 1;
            }

        }

        return arr;
    }
}
