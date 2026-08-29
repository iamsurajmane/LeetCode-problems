import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

        if (digits.length() == 0) {
            return result;
        }

        String[] mapping = {
            "", "", "abc", "def",
            "ghi", "jkl", "mno",
            "pqrs", "tuv", "wxyz"
        };

        backtrack(digits, 0, "", result, mapping);

        return result;
    }

    private void backtrack(String digits, int index, String current,
                            List<String> result, String[] mapping) {

        // If we have processed all digits
        if (index == digits.length()) {
            result.add(current);
            return;
        }

        // Get letters for current digit
        String letters = mapping[digits.charAt(index) - '0'];

        // Try every letter
        for (char ch : letters.toCharArray()) {

            backtrack(
                digits,
                index + 1,
                current + ch,
                result,
                mapping
            );
        }
    }
}