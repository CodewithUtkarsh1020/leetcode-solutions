#include <vector>
#include <algorithm>
using namespace std;

class Solution {
public:
    int max_sum; 

    int helper(vector<int>& nums, int i) {
        if (i == 0) {
            max_sum = nums[0];
            return nums[0];
        }


        int prev = helper(nums, i - 1);

        
        int current = max(nums[i], nums[i] + prev);
        
        max_sum = max(max_sum, current);

        return current;
    }

    int maxSubArray(vector<int>& nums) {
        helper(nums, nums.size() - 1);
        return max_sum;
    }
};

