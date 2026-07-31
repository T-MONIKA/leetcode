import java.util.Arrays;

class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int[] original = nums.clone();
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        for (int r = 0; r < n; r++) {
            boolean same = true;
            for (int i = 0; i < n; i++) {
                if (sorted[i] != original[i]) {
                    same = false;
                    break;
                }
            }
            if (same)
                return true;
            int first = sorted[0];
            for (int i = 0; i < n - 1; i++) {
                sorted[i] = sorted[i + 1];
            }
            sorted[n - 1] = first;
        }
        return false;
    }
}