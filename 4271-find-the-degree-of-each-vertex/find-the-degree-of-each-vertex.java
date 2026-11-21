class Solution {
    public int[] findDegrees(int[][] matrix) {
        int[] indegree= new int[matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==1) indegree[i]++;
            }
        }
        return indegree;
    }
}