class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int count=0;
        for(int a:nums){
            if(a==1){
                count++;
            }
        else{
            count=0;
        }
            max=Math.max(max,count);
        }
    return max;}
}