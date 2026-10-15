class Solution {
    public boolean isHappy(int n) {
        int ans = n;

        while (ans != 1 && ans != 4) {
            int sum = 0;

            while (ans > 0) {
                int digit = ans % 10;
                sum += digit * digit;
                ans /= 10;
            }

            ans = sum;
        }

        return ans == 1;
    }
}