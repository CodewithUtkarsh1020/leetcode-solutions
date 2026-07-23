class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for(int num =0;num<nums1.length;num++)
        {
            set1.add(nums1[num]);
        }
        for(int num =0;num<nums2.length;num++)
        {
            if(set1.contains(nums2[num]))
            {
                result.add(nums2[num]);
            }
        }
        //Conversion hashset to int
        int[]ans = new int[result.size()];
        int index=0;
        for(int i : result)
        {
            ans[index++]= i;
        }
       
       
        return ans;
    }
}
