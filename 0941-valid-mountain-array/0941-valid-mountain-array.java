class Solution {
    public boolean validMountainArray(int[] nums) {
        int index=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                index=i;
            }
        }
        if(index==0 ||index==nums.length-1){
            return false;
        }
        for(int i=0;i<index;i++){
            if(nums[i]>=nums[i+1]){
                return false;
            }
        }
        for(int i=index;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1]){
                return false;
            }
        }
        return true;
    }

}