class Solution {
    public int reverse(int x) {
       boolean neg = false;
       if (x<0){
        neg = true;
        x = -x;
       }
       long s = 0;
       while(x!=0){
        int r = x%10;
        s = (s*10)+r;
        x = x/10;
       }
       if (neg){
        s = -s;
       }
       if (s>Integer.MAX_VALUE || s<Integer.MIN_VALUE){
        return 0;
       }
       return (int)s;
    }
}