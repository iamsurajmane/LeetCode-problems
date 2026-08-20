class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            int value = columnTitle.charAt(i) - 'A' + 1;
            result = result * 26 + value;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.titleToNumber("A"));   
        System.out.println(sol.titleToNumber("AB"));  
        System.out.println(sol.titleToNumber("ZY")); 
    }
}
