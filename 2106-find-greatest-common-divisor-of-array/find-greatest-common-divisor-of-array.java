class Solution {

    public int findGCD(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;

        int a = nums[n - 1];
        int b = nums[0];

        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }

        return a;
    }
}