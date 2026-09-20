class Solution {
    public int myAtoi(String s) {
       if(s == null && s.length() == 0){
            return 0;
       } 
       int i=0;
       int n = s.length();

        // 1. Skip leading whitespaces
       while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // If string consists only of spaces
        if (i == n) {
            return 0;
        }
        long num = 0;
       int sign = 1;

       if(s.charAt(i) == '-' || s.charAt(i) == '+'){
            sign = (s.charAt(i) == '-') ? -1:1;
            i++;
       }

        while(i < n && Character.isDigit(s.charAt(i))){
            num = num * 10 + (s.charAt(i)- '0');

            if(num * sign > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(num * sign < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int) (num * sign);
    }
}