class Solution {
    public int diagonalSum(int[][] mat) {
        int sum =0;
        int n = mat.length;
        for(int i=0; i<n; i++){
            sum += mat[i][i];
        }
        int j=n-1;
        for(int i=0; i<n; i++){
            sum+=mat[j--][i];
        }
        if(n%2==1){
            sum -= mat[n/2][n/2];
        }
        
        return sum;
    }
}