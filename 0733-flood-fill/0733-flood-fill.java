class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        if(image[sr][sc] == color)
            return image;
        
        int source = image[sr][sc];
        int row = image.length;
        int col = image[0].length;
        
        dfs(image, sr, sc, color,source, row, col);
        
        return image;
    }
    
    public static void dfs(int[][] image, int sr, int sc, int color, int source,int row, int col){
        if(sr < 0 || sr >= row || sc < 0 || sc >= col)
            return;
        if(image[sr][sc] != source)
            return;
        
        image[sr][sc] = color;
        
        dfs(image, sr-1, sc, color,source, row, col);
        dfs(image, sr+1, sc, color,source, row, col);
        dfs(image, sr, sc-1, color,source, row, col);
        dfs(image, sr, sc+1, color,source, row, col);
    }
}