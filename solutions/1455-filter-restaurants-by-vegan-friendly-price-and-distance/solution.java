class Solution {
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) 
    {
        List<int[]> filtered = new ArrayList<>();
    
         for(int [] restaurant : restaurants )
         {
            //Taking only the vegan resturants.
            if(veganFriendly==1 && restaurant[2] == 0)
            {
                continue;
            }
            if( restaurant[3]> maxPrice)
            {
                continue;
            }
            if( restaurant[4]> maxDistance)
            {
                continue;            
            }
            filtered.add(restaurant);
         }
         //using comparator we are basically comparing the values according to ouur need.
         Collections.sort(filtered,(a,b)->{
         if(a[1]==b[1])
         {
            return b[0]-a[0];
         }
         return b[1]-a[1];
         });

         List<Integer> ans = new ArrayList<>();
         for(int [] res : filtered  )
         {
            ans.add(res[0]);
         }
        return ans;
    }
}
