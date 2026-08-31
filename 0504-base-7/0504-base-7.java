class Solution {
    public String convertToBase7(int num) {
        // Base case for 0
        if (num == 0) {
            return "0";
        }
        
        StringBuilder sb = new StringBuilder();
        boolean isNegative = num < 0;
        int n = Math.abs(num);
        
        // Repeated division by 7
        while (n > 0) {
            sb.append(n % 7);
            n /= 7;
        }
        
        if (isNegative) {
            sb.append("-");
        }
        
        // Reverse because remainders were collected least significant first
        return sb.reverse().toString();
    }
}