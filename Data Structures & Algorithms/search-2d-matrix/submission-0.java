class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int i = 0;
        int j = rows - 1;

        while(i <= j) {
            int x = (i + j) / 2;
            if(target >= matrix[x][0] && target <= matrix[x][columns - 1]) {
                int a = 0;
                int b = columns - 1;
                while(a <= b) {
                    int z = (a + b) / 2;
                    if(target < matrix[x][z]) {
                        b = z - 1;
                    } else if(target > matrix[x][z]) {
                        a = z + 1;
                    } else {
                        return true;
                    }
                }
                return false;
            } else if(target > matrix[x][columns - 1]) {
                i = x + 1;
            } else if(target < matrix[x][0]){
                j = x - 1;
            }
        }
        return false;
    }
}