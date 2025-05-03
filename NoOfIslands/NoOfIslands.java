package NoOfIslands;
public class NoOfIslands {
    private static void dfs(int grid[][],int i,int j){
        if(i<0 || i>=grid.length|| j<0 || j>=grid[0].length|| grid[i][j]==0){
            return;
        }
        grid[i][j]=0;
        //explore four sides
        dfs(grid,i-1,j);
        dfs(grid,i,j-1);
        dfs(grid, i+1, j);
        dfs(grid, i, j+1);
        //Conditions if diagonal to be included as islands
        dfs(grid,i-1,j-1);
        dfs(grid,i+1,j+1);

    }
    private static int countIslands(int grid[][]){
        int islands=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    dfs(grid,i,j);
                    islands++;

                }   
            }
        }
        return islands;
    }
    public static void main(String[] args) {
        int grid[][]={{1,1,0,0,0},{1,1,0,0,0},{0,0,1,0,0},{0,0,0,1,1}};
        System.out.println("The No.of islands are: "+countIslands(grid));
    }
    
}
