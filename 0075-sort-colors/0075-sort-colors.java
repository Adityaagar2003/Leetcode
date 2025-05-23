class Solution {
    public void sortColors(int[] nums) {
        int zero=0;
        int one=0;
        int two=0;
        for(int a:nums){
            if(a==0)zero++;
            else if (a==1)one++;
            else two++;
        }
        int i=0;
        while(zero!=0){
            nums[i]=0;
            zero--;
            i++;
        }
        while(one!=0){
            nums[i]=1;
            one--;
            i++;
        }
        while(two!=0){
            nums[i]=2;
            two--;
            i++;
        }
    }
}