class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        result = []  # Final triangle

        for i in range(numRows):
            row = []  # Current row
            for j in range(i + 1):
                if j == 0 or j == i:
                    row.append(1)  # First and last elements are always 1
                else:
                    # Sum of two numbers above in previous row
                    val = result[i - 1][j - 1] + result[i - 1][j]
                    row.append(val)
            result.append(row)

        return result
