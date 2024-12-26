class Solution {
    public String reverseOnlyLetters(String s) {
        int l=0;
        int r=s.length()-1;
        char[] c = s.toCharArray();
        while(l<r){
            if(Character.isLetter(c[l])){
                if(Character.isLetter(c[r])){
                    char temp=c[r];
                   c[r]=c[l];
                    c[l]=temp;
                l++;
                r--;
            }
            else{
                r--;
            }
            }
            else{
                l++;
            }
        }
    return new String(c);}
}