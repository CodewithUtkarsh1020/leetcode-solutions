class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
      int low = 0;
      int high = m*n -1;
      while(low<=high)
      {
        int mid = low + (high- low)/2;
        int row = mid/n;
        int colum = mid%n;
        if(matrix[row][colum]==target)
        
        {
            return true;
        }
        if(matrix[row][colum]<target)
        {
            low = mid+1;
        }
        else
        {
            high = mid -1;
        }
        
      }
      return false;

    }
}
