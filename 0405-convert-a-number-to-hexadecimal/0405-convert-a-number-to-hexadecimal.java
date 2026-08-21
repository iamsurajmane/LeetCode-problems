class Solution {
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }

        char[] hex = "0123456789abcdef".toCharArray();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            int digit = num & 15;  // Get last 4 bits
            result.append(hex[digit]);

            num >>>= 4; // Unsigned right shift by 4 bits

            if (num == 0) {
                break;
            }
        }
        return result.reverse().toString();
    }
}