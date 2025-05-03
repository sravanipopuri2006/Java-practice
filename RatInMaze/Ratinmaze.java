package RatInMaze;
import java.util.ArrayList;

public class Ratinmaze {
    
    public static void solve(int row,int col,int maze[][],String output,ArrayList<String>res){
        if(row<0 || col<0 || row>=maze.length|| col>=maze[0].length|| maze[row][col]==0){
            return;
        }
        if(row==maze.length-1 && col==maze[0].length-1){
            res.add(output);
            return;
            
        }
        
        maze[row][col]=0;
        solve(row+1,col,maze,output+'D',res);
        solve(row,col+1,maze,output+'R',res);
        solve(row-1,col,maze,output+'U',res);
        solve(row,col-1,maze,output+'L',res);
        maze[row][col]=1;
    }
    // Function to find all possible paths
    public static ArrayList<String> ratInMaze(int[][] maze) {
        ArrayList<String>res=new ArrayList<>();
        solve(0,0,maze,"",res);
        return res;
        
        
    }

    public static void main(String[] args) {
        int maze[][]={{1, 0, 0, 0},
           { 1, 1, 0, 1},{1 ,1, 0, 0 },{0, 1, 1, 1}};
        System.out.println(ratInMaze(maze));
        
    }
    
}
