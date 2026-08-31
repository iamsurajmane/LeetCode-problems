class Solution {
    public int countBinarySubstrings(String s) {
       int prevcount = 0;
       int currcount = 1;
       int result = 0;

       for(int i=1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)){
                currcount++;
            }
            else{
                result += Math.min(prevcount,currcount);
                prevcount = currcount;
                currcount=1;
            }
       } 
       result += Math.min(prevcount,currcount);

       return result;
    }
}