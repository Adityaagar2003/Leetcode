class Solution {
    public int scoreOfString(String s) {
        int score=0;
        for(int i=0;i<s.length()-1;i++){
            int f=s.charAt(i);
            int l=s.charAt(i+1);
            int sc=f-l;
            if(sc<0){
                score+=-sc;
            }
            else{
                score+=sc;
            }

        }
    return score;
    
    }
}