class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int rowLo = 0;
        int rowHi = matrix.length - 1;
        int cols = matrix[0].length - 1;
        int targetRow = 0;
        while(rowLo <= rowHi){
            int rowMid = rowLo + ((rowHi - rowLo) / 2);
            if (target >= matrix[rowMid][0] &&
                target <= matrix[rowMid][cols]){
                    targetRow = rowMid;
                    break;
                }
            else if (target < matrix[rowMid][0]){
                rowHi = rowMid - 1;
            }
            else if (target > matrix[rowMid][cols]){
                rowLo = rowMid + 1;
            }

        }  
        int lo = 0;
        int hi = cols;
        while(lo <= hi){
            int mid = lo + ((hi - lo) / 2);
            if (target == matrix[targetRow][mid]){
                return true;
            }
            else if(target < matrix[targetRow][mid]){
                hi = mid - 1;
            }
            else if (target > matrix[targetRow][mid]){
                lo = mid + 1;
            }
        }

        return false;

    }
}
