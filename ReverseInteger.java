class Solution {
    public int reverse(int x) {
        // boolean isNeg = x<0;

        // String str = String.valueOf(Math.abs((long)x));
        // StringBuilder sb = new StringBuilder(str);
        // sb.reverse();

        // long ans = Long.parseLong(sb.toString());

        // if(ans > Integer.MAX_VALUE) return 0;
        // int result = (int) ans;

        // return (isNeg)? -result:result;

        // int tmp = x;
        // int rev = 0;

        // while(tmp != 0){
        //     int r = tmp%10;
        //     if(rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10)  return 0;
        //     rev = rev*10+r;
        //     tmp/=10;
        // }
        // return rev;

        long rev = 0;
        while(x != 0){
            rev = (rev*10) + x%10;
            x/=10;
        }
        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
            return 0;
        }
        return (int) rev;
    }
}