class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int left;
        int right;
        int pivot;
        for(int i=0;i<n;i++){
            pivot=i;
            left=0;
            right=0;
            for(int j=0;j<pivot;j++){
                left=left+nums[j];
            }
            for(int j=pivot+1;j<n;j++){
                right=right+nums[j];
            }
            if(right==left){
                return pivot;
            }
        }
        return -1;
    }
}