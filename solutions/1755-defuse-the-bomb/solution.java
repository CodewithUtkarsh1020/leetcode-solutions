class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] ans = new int[n];
        
        if (k == 0) {
            return ans;
        }

        // Define initial window indices depending on whether k > 0 or k < 0
        int start = 1, end = k;
        if (k < 0) {
            k = -k;
            start = n - k;
            end = n - 1;
        }

        // Calculate the initial sum of the window
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += code[i];
        }

        // Slide the window across the array
        for (int i = 0; i < n; i++) {
            ans[i] = sum;
            // Subtract the element leaving the window
            sum -= code[start % n];
            // Add the element entering the window
            sum += code[(end + 1) % n];
            
            start++;
            end++;
        }

        return ans;
    }
}
