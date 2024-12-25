class Solution {
    public int minimumChairs(String s) {
        int chair=0;
        int maxchair=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='E'){
                chair++;
                if (chair > maxchair) {
                    maxchair = chair;
                }
            }else{
                chair--;
            }
        }
   return maxchair; }
}