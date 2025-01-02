class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
     int prefix[]=new int[words.length];
     int ans[]=new int[queries.length];

if(isVowel(words[0].charAt(0))&&isVowel(words[0].charAt(words[0].length()-1))){
    prefix[0]=1;
}else{
    prefix[0]=0;

}
     for(int i=1;i<words.length;i++){
if(isVowel(words[i].charAt(0))&&isVowel(words[i].charAt(words[i].length()-1))){
    prefix[i]=prefix[i-1]+1;
}else{
    prefix[i]=prefix[i-1];

}  } 
for(int i=0;i<queries.length;i++){
    if(queries[i][0]==0){
        ans[i]=prefix[queries[i][1]];
    }else{
ans[i]=prefix[queries[i][1]]-prefix[queries[i][0]-1];
}
}
    return ans;}

    public static boolean isVowel(char ch) {
    return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
}
}