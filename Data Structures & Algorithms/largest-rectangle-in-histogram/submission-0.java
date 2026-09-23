class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int[]> stack = new Stack<>();
        int area = 0;
        for(int i = 0; i < heights.length;i++){
            int start = i;
            while(!stack.isEmpty() && stack.peek()[1] > heights[i]){
                int[] bar = stack.pop();
                int index = bar[0];
                int height = bar[1];
                int width = i - index;
                area = Math.max(area, height * width);
                start = index;
            }
            stack.push(new int[]{start, heights[i]});
        }
        while(!stack.isEmpty()){
            int[] bar = stack.pop();
            int index = bar[0];
            int height = bar[1];
            int width = heights.length - index;
            area =  Math.max(area, height * width);
        }
        return area;
    }
}
