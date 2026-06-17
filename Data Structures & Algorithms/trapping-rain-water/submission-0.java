class Solution {
    public int trap(int[] height){
        int left=0;
        int right=height.length-1;
        int leftmax=0;
        int rightmax=0;
        int totalwater=0;
        while(left<right){
            if(height[left]<height[right]){
                leftmax=Math.max(leftmax,height[left]);
                totalwater+=leftmax-height[left];
                left++;
            }else{
                rightmax=Math.max(rightmax,height[right]);
                totalwater+=rightmax-height[right];
                right--;
            }
        }
        return totalwater;
        
    }
}
