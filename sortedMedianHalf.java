public class sortedMedianHalf {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int mid = (nums1.length + nums2.length) / 2;
        int[] mergedArr = new int[mid + 1];
        int fp = 0;
        int sp = 0;
        for (int i = 0; i <= mid; i++) {
            if (fp >= nums1.length) {
                mergedArr[i] = nums2[sp];
                sp++;
            } else if (sp >= nums2.length) {
                mergedArr[i] = nums1[fp];
                fp++;
            } else if (nums1[fp] <= nums2[sp]) {
                mergedArr[i] = nums1[fp];
                fp++;
            } else {
                mergedArr[i] = nums2[sp];
                sp++;
            }
        }
        if ((nums1.length + nums2.length) % 2 != 0) {
            return mergedArr[mergedArr.length - 1] * 1.0;
        } else {
            return (mergedArr[mergedArr.length - 1] + mergedArr[mergedArr.length - 2]) / 2.0;
        }
    }
}

// public double findMedianSortedArrays(int[] nums1, int[] nums2) {
// int mid = 0;
// if (nums1.length == 0) {
// if (nums2.length % 2 == 0) {
// mid = nums2.length / 2;
// return (nums2[mid] + nums2[mid + 1]) / 2.0;
// } else {
// return nums2[mid] * 1.0;
// }
// }
// if (nums2.length == 0) {
// if (nums1.length % 2 == 0) {
// mid = nums1.length / 2;
// return (nums1[mid] + nums1[mid - 1]) / 2.0;
// } else {
// return nums1[mid] * 1.0;
// }
// }

// int runTime = (nums1.length + nums2.length) / 2 + 1;

// boolean is = false;

// int p1 = 0;
// int p2 = 0;
// int[] arr = new int[runTime];

// for (int i = 0; i < runTime; i++) {
// if (p1 >= nums1.length) {
// arr[i] = nums2[p2];
// p2++;
// } else if (p2 >= nums2.length) {
// arr[i] = nums1[p1];
// p1++;
// } else if (nums1[p1] <= nums2[p2]) {
// arr[i] = nums1[p1];
// p1++;
// } else {
// arr[i] = nums2[p2];
// p2++;
// }
// System.out.println(arr[i]);

// }
// return (arr.length % 2 == 0) ? arr[arr.length - 1] * 1.0 : (arr[arr.length -
// 1] + arr[arr.length - 2]) / 2.0;
// }
