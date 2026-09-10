class Solution {
    public int findComplement(int num) {

        int mask = 0;
        int temp = num;

        // Create mask with all 1s
        while (temp > 0) {
            mask = (mask << 1) | 1;
            temp = temp >> 1;
        }

        // Flip the bits of num
        return num ^ mask;
    }
}