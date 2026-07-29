class Solution {
    public boolean uniqueOccurrences(int[] arr) 
    {
        int n = arr.length;
        Map<Integer,Integer> fq = new HashMap<>();
        for(int i =0;i<n;i++)
        {
            // Taking input in HashMap we use put:
           fq.put(arr[i], fq.getOrDefault(arr[i], 0) + 1);
          
        }
       Set<Integer> hs = new HashSet<>();
      for(int value : fq.values())
      {
        hs.add(value);
    
      }
      return fq.size() == hs.size();
    }
}
