//{ Driver Code Starts
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt(); // Number of test cases
        while (tc-- > 0) {
            int n = scanner.nextInt(); // Number of rows
            int m = scanner.nextInt(); // Number of columns
            char[][] grid = new char[n][m];

            // Read the grid input
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    grid[i][j] = scanner.next().charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
        scanner.close();
    }
}

// } Driver Code Ends

class Solution {
    public void dfsIterative(int i,int j,char grid[][],boolean vis[][],int dir[][]){
        Stack<int[]> st=new Stack<>();
        st.push(new int[]{i,j});
        vis[i][j]=true;
        grid[i][j]='0';
        while(!st.isEmpty()){
            int[] curr=st.pop();
            int curri=curr[0],currj=curr[1];
            for(int[] d:dir){
                int ni=curri+d[0],nj=currj+d[1];
                if(ni>=0 && ni<grid.length && nj>=0 && nj<grid[0].length && grid[ni][nj]=='1' && !vis[ni][nj]){
                    st.push(new int[]{ni,nj});
                    vis[ni][nj]=true;
                    grid[ni][nj]='0';
                }
            }
        }
    }
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        // Code here
        int n=grid.length,m=grid[0].length,islands=0;
        boolean vis[][]=new boolean[n][m];
        int dir[][]=new int[][]{{0,1},{0,-1},{1,0},{-1,0},{1,1},{-1,-1},{1,-1},{-1,1}};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1' && !vis[i][j]){
                    dfsIterative(i,j,grid,vis,dir);
                    islands++;
                }
            }
        }
        return islands;
    }
}