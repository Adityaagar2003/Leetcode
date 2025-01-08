class Solution {

    public int romanToInt(String s) {
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'I') {
                number += 1;
            } else if (c == 'V') {
                number += 5;
            } else if (c == 'X') {
                number += 10;
            } else if (c == 'L') {
                number += 50;
            } else if (c == 'C') {
                number += 100;
            } else if (c == 'D') {
                number += 500;
            } else {
                number += 1000;
            }
        }
   return number; }
}
