class Solution {
    public int peakIndexInMountainArray(int[] arr) 
    { 
        
        int n = arr.length;
        int low = 0;
        int high = n-1;
        
        while(low<high)
        {
            int mid = low +(high-low)/2;
            //checking that our element is at the left side means less than its next element
            if(arr[mid]<arr[mid+1])
            {
                low= mid+1;
            
            }
            else
            {
                high = mid;
            }
        }

        return low;
    }
}
