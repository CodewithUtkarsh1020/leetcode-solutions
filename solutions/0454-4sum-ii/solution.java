class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4)
     {
        int n = nums1.length;
        int m = nums2.length;
        int o = nums3.length;
        int p = nums4.length; 
        int sum12 = 0;
        HashMap<Integer,Integer>freq = new HashMap<>();
        int count = 0;
        for(int i =0;i<n;i++)
        {
            for(int j =0;j<m;j++)
            {
                sum12 = nums1[i] +  nums2[j];
                freq.put(sum12, freq.getOrDefault(sum12, 0) + 1);
            }
        }
        for(int k =0;k<o;k++)
        {
            for(int l =0;l<p;l++)
            {
               int target = -(nums3[k] + nums4[l]);
                if(freq.containsKey(target))
                {
                   count += freq.get(target);
                }
            }
        }

        return count;
    }
}
