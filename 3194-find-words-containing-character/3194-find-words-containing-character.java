class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
         List<Integer> arr = new ArrayList<>(words.length);
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (x == words[i].charAt(j)) {
                    arr.add(i);
                    break;
                }
            }
        }
   return arr; }
}