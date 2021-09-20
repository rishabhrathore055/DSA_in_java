class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for(int i=0; i<n; i++){
            int x =n-1;
            for(int j=0; j<n/2; j++){
                int temp=image[i][j];
                image[i][j]=image[i][x];
                image[i][x--]=temp;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(image[i][j]!=0) image[i][j]=0;
                else image[i][j]=1;
            }
        }
        return image;
    }
}