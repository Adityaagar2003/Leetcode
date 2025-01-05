class Solution {

    public String shiftingLetters(String s, int[][] shifts) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < shifts.length; i++) {
            int start = shifts[i][0];
            int end = shifts[i][1];
            int direction = shifts[i][2];
            for (int j = start; j <= end; j++) {
                char currentChar = sb.charAt(j);
                if (direction == 1) {
                    currentChar = (char) ((currentChar - 'a' + 1) % 26 + 'a');
                } else {
                    currentChar = (char) ((currentChar - 'a' - 1 + 26) % 26 + 'a');
                }
                sb.setCharAt(j, currentChar);
            }
        }

        return sb.toString();
    }
}
