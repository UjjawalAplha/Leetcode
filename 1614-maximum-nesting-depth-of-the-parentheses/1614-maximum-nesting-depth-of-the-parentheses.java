class Solution {
    public int maxDepth(String s) {
        int max = 0, x = 0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                x++;
                if(x>max)
                max=x;
            }
            else if(ch==')') x--;
        }
        return max;
    }
}