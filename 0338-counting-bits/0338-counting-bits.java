class Solution {
    public int[] countBits(int n) {
        int a[]=new int[n+1];
        // for(int i=0;i<=n;i++){
        //     a[i]=Integer.bitCount(i);
        // }
        if(n==0){
            return a;
        }
        a[0]=0;
         for(int i=1;i<=n;i++){
           if(i%2!=0){
            a[i]=a[i/2]+1;
           }else{
            a[i]=a[i/2];
           }
        }
    return a;}
}