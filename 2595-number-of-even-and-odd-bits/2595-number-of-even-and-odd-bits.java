class Solution {
    public int[] evenOddBit(int n) {
        int a[]=new int[2];
        int even=0;
        int odd=0;
        int count=0;
        while(n!=0){
            if(count%2==0){
                if((n&1)!=0){
                    even++;
                }
            }else{
                 if((n&1)!=0){
                    odd++;
                }
            }
            
            count++;

            n=n>>1;
        }
        a[0]=even;
        a[1]=odd;
        return a;
    }
}