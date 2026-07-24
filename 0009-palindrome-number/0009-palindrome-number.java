class Solution {
    public boolean isPalindrome(int n) {
        if(n<0 || (n%10==0 && n!=0))
        {
            return false;
        }
        int s = 0;
        int r,value;
        value = n;
        while(n>0){
            r = n%10;
            s = (s*10)+r;
            n = n/10;
        }
        if(value==s)
        return true;
        else
        return false;
    }
}