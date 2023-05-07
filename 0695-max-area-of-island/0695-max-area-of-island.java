class Solution {
    static int count = 0;
    public int maxAreaOfIsland(int[][] grid) {
        int maxi = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                count = 1;
                if(grid[i][j] == 1){
                    count = count_Island(grid,i,j,count);
                maxi = Math.max(maxi,count);
                }
            }
        }
        return maxi;
    }
    
    public static int count_Island(int[][] grid,int i, int j, int count){
        if(i<0 || i>= grid.length || j <0 || j>= grid[0].length)
            return 0;
        if(grid[i][j] == 0)
            return 0;
        
        grid[i][j] = 0;
        
        return(1 + count_Island(grid,i-1,j,count) + count_Island(grid,i+1,j,count) + count_Island(grid,i,j-1,count) + count_Island(grid,i,j+1,count));
        
        } 
}