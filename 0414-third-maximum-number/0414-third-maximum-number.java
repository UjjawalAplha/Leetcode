class Solution {
    public int thirdMax(int[] nums) {
        long lar = Long.MIN_VALUE;
        long seclar = Long.MIN_VALUE;
        long thirdlar = Long.MIN_VALUE;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] == lar || nums[i] == seclar || nums[i] == thirdlar){
            continue;
            }
            if(nums[i] > lar){
                thirdlar = seclar;
                seclar = lar;
                lar = nums[i];
            }
            else if(nums[i] > seclar){
                thirdlar = seclar;
                seclar = nums[i];
            }
            else if(nums[i] > thirdlar){
                thirdlar = nums[i];
            }
        }
        if(thirdlar == Long.MIN_VALUE) return (int)lar;
        else return (int)thirdlar;
    }
}