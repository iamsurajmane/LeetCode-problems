class Solution {
    public int[] constructRectangle(int area) {

        // Start from square root because
        // we want L and W as close as possible
        int w = (int) Math.sqrt(area);

        // Find the first number that divides area
        while (area % w != 0) {
            w--;
        }

        int l = area / w;

        return new int[]{l, w};
    }
}