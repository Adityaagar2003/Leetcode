class Solution {
    public boolean isPalindrome(int n) {
      
        int num=n;
        int pali=0;
        if(n<0){
            return false;
        }
        while(n!=0){
            int ld=n%10;
           pali =(pali*10)+ld;
            n=n/10;
        }
        if(pali==num){
            return true;
        }

   return false; }

}