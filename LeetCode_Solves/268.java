class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        boolean check[] = new boolean[n];
        for(int i=0; i<n; i++) {
            if(nums[i] == n) continue;

            check[nums[i]] = true;
        }

        for(int i=0; i<n; i++) {
            if(check[i] == false) return i;
        }

        return n;
    }
}
