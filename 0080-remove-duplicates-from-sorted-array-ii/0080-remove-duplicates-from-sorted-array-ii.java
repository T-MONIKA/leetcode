class Solution {
    public int removeDuplicates(int[] nums) {
        int[] arr=new int[nums.length];
        int j=0;
        int count=1;
        arr[j] = nums[0];
        j++;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }
            else{
                count=1;
            }
            if(count<=2){
                arr[j]=nums[i];
                j++;
            }
        }
        for(int i=0;i<j;i++){
            nums[i]=arr[i];
        }
        return j;
    }
}