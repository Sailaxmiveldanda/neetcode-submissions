class Solution {
    public int maxArea(int[] heights) {
        int h = heights.length;
        int left = 0;
        int right = h -1;
        int maxarea = 0;
        while(left < right){
            int height = Math.min(heights[left],heights[right]);
            int width = right - left;
            int area = height * width;
            maxarea = Math.max(area,maxarea);
            if(heights[left] < heights[right]){
                left++;
            } 
            else{
                right--;
            }
        }
        return maxarea;
    }
}
