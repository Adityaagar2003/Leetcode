class Solution {

    public int numIdenticalPairs(int[] nums) {
        int good = 0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int num:nums) {
good+=map.getOrDefault(num,0);
map.put(num,map.getOrDefault(num,0)+1);

}
        return good;
    }
}
