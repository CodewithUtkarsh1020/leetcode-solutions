/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) 
    {
        //length find Interface
        int n = mountainArr.length();
      
        int low =0;
        int high = n-1;
        while(low<high)
        { 
            int mid = low + (high-low)/2;
            //accesing each element using get function as it is not an array it is an Interface...
              int value = mountainArr.get(mid);
          
            if(mountainArr.get(mid)<mountainArr.get(mid+1))
            {
                low = mid+1;
            }
            else
            {
                high = mid;
            }
           
        }
        int peak = low;
        int l =0;
        int h = peak;
        while(l<=h)
        {
            
            int mid = l+(h-l)/2;
             int value = mountainArr.get(mid);
            if(value==target)
            {
                return mid;
            }
            else if(value<target)
            {
                l = mid +1;
            }
            else
            {
              h = mid-1;
            }
            
        }
         int lw =peak+1;
        int hg = n-1;
        while(lw<=hg)
        {
           
            int mid = lw+(hg-lw)/2;
              int value = mountainArr.get(mid);
            if(value==target)
            {
                return mid;
            }
            else if(value>target)
            {
                lw = mid +1;
            }
            else
            {
              hg = mid-1;
            }
            
        }
        
        return -1;
    }
}
