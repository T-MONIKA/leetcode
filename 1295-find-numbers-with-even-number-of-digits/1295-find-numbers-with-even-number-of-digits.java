class Solution {
    public int findNumbers(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>9 && arr[i]<100 || arr[i]>999 && arr[i]<10000 || arr[i]>99999 && arr[i]<1000000){
                count++;
            }

        }
        return count;
    }
}