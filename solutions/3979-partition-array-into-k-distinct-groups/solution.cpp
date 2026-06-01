class Solution {
public:
    bool partitionArray(vector<int>& nums, int k) {
        int n = nums.size();

        if (n % k != 0)
            return false;

        int groups = n / k;

        unordered_map<int, int> freq;

        for (int x : nums) {
            freq[x]++;
            if (freq[x] > groups)
                return false;
        }

        return true;
    }
};
