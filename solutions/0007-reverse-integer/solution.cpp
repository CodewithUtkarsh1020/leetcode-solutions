

class Solution {
public:
    int reverse(int x) {
        int reversed = 0;
        
        while (x != 0) {
            int pop = x % 10; // Extract the last digit
            x /= 10;          // Remove the last digit from x
            
            // Check for overflow before multiplying by 10
            // INT_MAX is 2147483647
            if (reversed > INT_MAX / 10 || (reversed == INT_MAX / 10 && pop > 7)) {
                return 0;
            }
            // Check for underflow before multiplying by 10
            // INT_MIN is -2147483648
            if (reversed < INT_MIN / 10 || (reversed == INT_MIN / 10 && pop < -8)) {
                return 0;
            }
            
            // Append the digit to the reversed number
            reversed = reversed * 10 + pop;
        }
        
        return reversed;
    }
};
