class Solution {
    public int maxArea(int[] heights) {
        int maxarea=0;
        int left=0;
        int right=heights.length-1;
        while(left<right){
            int width=right-left;
            int area=width*Math.min(heights[left],heights[right]);
            maxarea=Math.max(area,maxarea);
            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
            

        }
        return maxarea;
        
    }
}
