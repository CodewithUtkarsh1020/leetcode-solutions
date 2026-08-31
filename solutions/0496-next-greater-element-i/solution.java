class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        // Stores: number -> its next greater element
        HashMap<Integer, Integer> map = new HashMap<>();

        // Monotonic decreasing stack
        Stack<Integer> st = new Stack<>();

        // Process nums2
        for (int num : nums2) {

            // Current number is the next greater
            // element for elements smaller than it
            while (!st.isEmpty() && num > st.peek()) {
                map.put(st.pop(), num);
            }

            st.push(num);
        }

        // Create result for nums1
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {

            // If greater element exists, get it
            // Otherwise return -1
            ans[i] = map.getOrDefault(nums1[i], -1);
        }

        return ans;
    }
}
