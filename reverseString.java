class Solution {
    public int climbStairs(int n) {
       if(n==0) return 0;
       if(n==1) return 1;
       if(n==2) return 2;
       int first=1;
       int second=2;

       for(int i = 0; i<n-2;i++){
            int temp = second;
            second =first+second;
            first = temp;
       }
       return second;


    }
}