class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] arr=new int[nums.length];
        int j=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr[j]=nums[i];
                j++;
            }
            else{
                arr[nums.length-1-c]=nums[i];
                c++;
            }
        }
        return arr;
    }
}