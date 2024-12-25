class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int jwel=0;
                    HashSet<Character> je=new HashSet<>();
                for(int i=0;i<jewels.length();i++){
                    je.add(jewels.charAt(i));
                }
                for(int j=0;j<stones.length();j++){
                   if(je.contains(stones.charAt(j))){
                    jwel++;
    }
}return jwel;}}