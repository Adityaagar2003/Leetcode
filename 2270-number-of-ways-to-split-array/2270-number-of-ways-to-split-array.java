class Solution {
    public int waysToSplitArray(int[] nums) {
        int n=nums.length;
        int count=0;
        long sum=0;
        long leftsum=0;
        
        for(int i=0;i<n;i++){
           sum+=nums[i];
        }
        for(int i=0;i<n-1;i++){
             leftsum+=nums[i];
            long rightsum=sum-leftsum;
            if(leftsum>=rightsum){
                count++;
            }
        }
   return count; }
}