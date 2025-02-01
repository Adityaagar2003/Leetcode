class Solution {
    public boolean isArraySpecial(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                if(i+1<nums.length&& nums[i+1]%2!=1) return false;
            }
            else{
                if(i+1<nums.length&& nums[i+1]%2!=0) return false;
            }
        }
   return true;
    }
}