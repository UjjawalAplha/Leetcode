class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int minDiff = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i=0; i<n; i++){
            int diff = Math.abs(start - i);
            if(nums[i] == target && diff < minDiff){
                minDiff = diff;
            }
        }
        return minDiff;
    }
}