class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> arr = new ArrayList<>();

        Arrays.sort(nums);

        int n = nums.length;
        int expected = 1;
        int i = 0;

        while (expected <= n) {

            if (i < n && nums[i] == expected) {
                i++;
                expected++;
            }
            else if (i < n && nums[i] < expected) {
                i++;
            }
            else {
                arr.add(expected);
                expected++;
            }
        }

        return arr;
    }
}
