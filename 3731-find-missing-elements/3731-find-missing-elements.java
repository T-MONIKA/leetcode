class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        int temp = 0;
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = 0; j < nums.length - 1 - i; j++){
                if(nums[j] > nums[j + 1]){
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i + 1] - nums[i] > 1){
                for(int val = nums[i] + 1; val < nums[i + 1]; val++){
                    arr.add(val); 
                }
            }
        }
        return arr;
    }
}