class Solution {
    public int strStr(String haystack, String needle) {
        char ch = needle.charAt(0);
        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            if(ch == haystack.charAt(i)){
                if(haystack.substring(i,(needle.length() + i)).equals(needle)){
                    return i;
                }
            }

        }
        return -1;
    }
}