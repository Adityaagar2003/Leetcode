class Solution {
    public int findLucky(int[] arr) {
      HashMap<Integer,Integer> hm=new HashMap<>();
      int max=-1;
      for(int i:arr){
        hm.put(i,hm.getOrDefault(i,0)+1);
      } 
      for(Integer k:hm.keySet()){
        if(k==hm.get(k)){
            max=Math.max(k,max);
        }
      } 
            return max;
 }
}