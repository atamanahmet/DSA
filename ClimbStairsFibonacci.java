public class ClimbStairsFibonacci {
    public static void main(String[] args) {
        climbStairs(5);
    }

    public static int climbStairs(int n) {
        if (n == 0 || n == 1)
            return 1;
        int fp = 1;
        int sp = 1;
        for (int i = 0; i < n - 1; i++) {
            int temp = fp;
            fp = fp + sp;
            sp = temp;
        }
        return fp;
    }
}
