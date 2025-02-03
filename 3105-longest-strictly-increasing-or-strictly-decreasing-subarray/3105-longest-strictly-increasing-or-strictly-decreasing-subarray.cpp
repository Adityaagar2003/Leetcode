class Solution {
public:
    int longestMonotonicSubarray(vector<int>& nums) {
        int curr=1;
        int incmax=1;
        for(int i=0;i<nums.size();i++){
            curr=1;
            for(int j=i+1;j<nums.size();j++){
                if(nums[j-1]<nums[j]) curr++;
                else break;
                incmax=max(curr,incmax);
            }
        }
        
        int decmax=1;
        for(int i=0;i<nums.size();i++){
            curr=1;
            for(int j=i+1;j<nums.size();j++){
                if(nums[j-1]>nums[j]) curr++;
                else break;
                decmax=max(curr,decmax);
            }
        }
    return max(incmax,decmax);}
};