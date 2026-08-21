class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];

        // Count frequency of each character
        for (char ch : s.toCharArray()) {
            count[ch]++;
        }

        int length = 0;
        boolean oddFound = false;

        // Use pairs of characters
        for (int i = 0; i < 128; i++) {
            length += (count[i] / 2) * 2;

            // If any character has odd frequency,
            // one character can be placed in the center
            if (count[i] % 2 == 1) {
                oddFound = true;
            }
        }

        if (oddFound) {
            length++;
        }

        return length;
    }
}