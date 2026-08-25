class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int x:nums)
        set.add(x);
        int min = set.first();
        int max = set.last();
        List<Integer> ans = new ArrayList<>();
        for(int i=min; i<=max; i++){
            if(!set.contains(i))
            ans.add(i);
        }
        return ans;
    }
}