class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxlen=0;
        for(int num:nums){
            if(num==1){
                count++;
                maxlen=Math.max(maxlen,count);
            }else{
                count=0;
            }
        }
        return maxlen;
    }
}
        