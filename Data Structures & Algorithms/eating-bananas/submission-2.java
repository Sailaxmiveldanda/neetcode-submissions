class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int left = 1;
        int right = 0;
        for(int p : piles){
            right = Math.max(p,right);
        }
        while(left <= right){
            int mid = left + (right - left)/2;
            long hours = 0;
            for(int pile : piles){
                hours += (pile + (long) mid - 1)/ mid;
            }
            if(hours <= h){
                right = mid -1;
            }
            else{
                left = mid +1;
            }
        }
        return left;
    }
}
