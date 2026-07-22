import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> ans = new HashSet<>();
        int n = nums.length;
        Arrays.sort(nums);
           //n-2-> because we want triplet
        for (int i = 0; i < n-2; i++) {

            int j = i + 1;
            int k = n - 1;

            while (j < k) {

                int sum = nums[i] + nums[j] + nums[k];

                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> ls = new ArrayList<>();
                    ls.add(nums[i]);
                    ls.add(nums[j]);
                    ls.add(nums[k]);

                    ans.add(ls);

                    j++;
                    k--;
                }
            }
        }

        return new ArrayList<>(ans);
    }
}
