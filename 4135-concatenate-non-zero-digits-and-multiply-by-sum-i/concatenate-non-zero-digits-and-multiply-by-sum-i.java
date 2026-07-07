class Solution {
    public long sumAndMultiply(int n) {
        long reversed = 0;
        int sum = 0;

        // Special case when n is 0
        if (n == 0) {
            return 0;
        }

        // Build reversed number using non-zero digits
        while (n > 0) {
            int digit = n % 10;

            if (digit != 0) {
                reversed = reversed * 10 + digit;
                sum += digit;
            }

            n /= 10;
        }

        // Reverse again to restore original order
        long x = 0;
        while (reversed > 0) {
            x = x * 10 + reversed % 10;
            reversed /= 10;
        }

        return x * sum;
    
    }
}