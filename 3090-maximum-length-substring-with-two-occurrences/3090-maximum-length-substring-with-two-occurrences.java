class Solution {
    public int maximumLengthSubstring(String s) {
      Map<Character,Integer> map = new HashMap<>();
      int ans = 0;
      int j = 0;
      for (int i = 0; i<s.length();i++){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        while (map.get(s.charAt(i))>2){
        int leftVal= map.get(s.charAt(j))-1;
        map.put(s.charAt(j),leftVal);
        if (map.get(s.charAt(j))==0){
            map.remove(s.charAt(j));
        }
        j++;
      }
      ans = Math.max(ans, i-j+1);
    }
    return ans;
}
}