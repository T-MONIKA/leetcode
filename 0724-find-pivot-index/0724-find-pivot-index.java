class Solution {
    public int pivotIndex(int[] nums) {
        int total=0;
        for(int i=0;i<nums.length;i++){
            total=total+nums[i];
        }
        int left=0;
        int right=0;
        for(int i=0;i<nums.length;i++){
            right=total-left-nums[i];
            if(right==left){
                return i;
            }
            left=left+nums[i];
        }
        return -1;
    }
}