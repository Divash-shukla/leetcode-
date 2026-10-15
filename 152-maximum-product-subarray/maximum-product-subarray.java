class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxpro = nums[0];
        int minpro = nums[0];
        int ans = nums[0];

        for (int i = 1; i < n; i++) {
            if (nums[i] < 0) {
                int temp = maxpro;
                maxpro = minpro;
                minpro = temp;
            }

            maxpro = Math.max(nums[i], maxpro * nums[i]);
            minpro = Math.min(nums[i], minpro * nums[i]);

            ans = Math.max(ans, maxpro);
        }

        return ans;
    }
}