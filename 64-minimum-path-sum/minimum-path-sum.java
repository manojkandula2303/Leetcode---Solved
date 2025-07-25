class Solution {
    public int solve(int x, int y, int [][] grid, int [][] dp){
        if(x<0 || y<0 || x>=grid.length || y >= grid[0].length){
            return Integer.MAX_VALUE;
        }
        if(x == grid.length-1 && y == grid[0].length-1){
            dp[x][y] = grid[x][y];
            return grid[x][y];
        }
        if(dp[x][y] != -1){
            return dp[x][y];
        }
        int right = solve(x, y + 1, grid, dp);
        int down = solve(x + 1, y, grid, dp);
        dp[x][y] = grid[x][y] + Math.min(right, down); 

        return dp[x][y];

    }
    public int minPathSum(int[][] grid) {
        
        int [][] dp =  new int[grid.length][grid[0].length];

        for(int i= 0;i<grid.length; i++){
            Arrays.fill(dp[i], -1);
        }

        solve(0,0,grid,dp);
        return dp[0][0];
        
    }
}