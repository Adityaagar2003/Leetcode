class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n=shifts.length;
       int arr[]=new int[n];
          arr[n - 1] = shifts[n - 1] % 26;
        for (int i = n - 2; i >= 0; i--) {
            arr[i] = (shifts[i] + arr[i + 1]) % 26;
        }
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            int shift = (s.charAt(i) - 'a' + arr[i]) % 26;
            sb.append((char) ('a' + shift));
        }
   return sb.toString(); }
}