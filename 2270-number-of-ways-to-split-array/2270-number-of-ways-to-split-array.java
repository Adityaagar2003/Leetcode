class Solution {
    public int waysToSplitArray(int[] nums) {
        int n=nums.length;
        int count=0;
        int prefix[]=new int[n];
        int suffix[]=new int[n];
        prefix[0]=nums[0];
        suffix[0]=nums[n-1];
        for(int i=1;i<n;i++){
            prefix[i]=nums[i]+prefix[i-1];
            suffix[i]=suffix[i-1]+nums[n-i-1];
        }
        for(int i=0;i<n-1;i++){
            if(prefix[i]>=suffix[n-i-2]){
                count++;
            }
        }
   return count; }
}