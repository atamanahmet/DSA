class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        String small = "";
        String big = "";
        if (str1.length() <= str2.length()) {
            small = str1;
            big = str2;
        } else {
            small = str2;
            big = str1;
        }

        if (small.length() == 0 || big.length() == 0)
            return "";
        return small.substring(0, gcd(big.length(), small.length()));
    }

    public int gcd(int big, int small) { // euclidean algorithm //Recursive

        if (small == 0)
            return big;
        return gcd(small, big % small);
    }

    // public int gdc(int small, int big) //euclidean algorithm //Iterative
    // {
    // while (small != 0) {
    // int remainder = big % small;
    // big = small;
    // small = remainder;
    // }
    // return big;
    // }

    // public String gcdOfStrings(String str1, String str2) {

    // int p2 = 0;
    // int fromIdx = 0;

    // String smaller = "";
    // String bigger = "";

    // boolean check = true;

    // if (str1.length() <= str2.length()) {
    // smaller = str1;
    // bigger = str2;
    // } else {
    // smaller = str2;
    // bigger = str1;
    // }
    // for (int i = 0; i < bigger.length(); i++) {
    // if (p2 == smaller.length()) {
    // p2 = 0;
    // }
    // if (bigger.charAt(i) != smaller.charAt(p2++)) {
    // check = false;
    // } else {

    // }

    // }
    // if (check) {
    // return smaller;
    // } else {
    // return "";
    // }

    // }
}