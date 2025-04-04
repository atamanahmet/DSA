public class mergeSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 5, 1, 8, 4, 6, 7, 9, 2 };
        int[] result = mergeRecursive(arr);
        String strRes = "";
        for (int i : result) {
            strRes += i + " ";
        }
        System.out.println(strRes);
    }

    public static int[] mergeRecursive(int[] arr) {

    }
}
