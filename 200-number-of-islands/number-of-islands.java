class Pair {
    int first;
    int second;
    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public void bfs(int ro, int co, char[][] grid, boolean vis[][]) {
        vis[ro][co] = true;
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(ro, co));
        int m = grid.length;
        int n = grid[0].length;
        
        // Direction vectors for moving up, down, left, right (no diagonal)
        int[] delRow = {-1, 1, 0, 0};
        int[] delCol = {0, 0, -1, 1};
        
        while (!q.isEmpty()) {
            int nro = q.peek().first;
            int nco = q.peek().second;
            q.remove();
            
            for (int i = 0; i < 4; i++) {
                int row = nro + delRow[i];
                int col = nco + delCol[i];
                
                if (row >= 0 && row < m && col >= 0 && col < n && 
                    grid[row][col] == '1' && !vis[row][col]) {
                    vis[row][col] = true;
                    q.add(new Pair(row, col));
                }
            }
        }
    }

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int cnt = 0;
        boolean vis[][] = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!vis[i][j] && grid[i][j] == '1') {
                    cnt++;
                    bfs(i, j, grid, vis);
                }
            }
        }
        return cnt;
    }
}
