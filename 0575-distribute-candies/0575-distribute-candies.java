class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for(int candy : candyType){
            set.add(candy);
        }
        int max = candyType.length/2;
        int result = Math.min(set.size() , max);
        return result;
    }
}