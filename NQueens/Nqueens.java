package NQueens;
public class Nqueens {
    private static boolean isSafe(int row,int col,char board[][]){
      
        for(int j=0;j<board.length;j++){
            if(board[j][col]=='Q'){
                return false;
            }
        }
        int nrow=row-1,ncol=col-1;
        while(nrow>=0 && ncol>=0){
            if(board[nrow][ncol]=='Q'){
                return false;
            }
            nrow--;
            ncol--;
        }
        int mrow=row+1,mcol=col+1;
        while(mrow<board.length && mcol<board.length){
            if(board[mrow][mcol]=='Q'){
                return false;
            }
            mrow++;
            mcol++;
        }
        int lrow=row-1;
        int lcol=col+1;
        while(lrow>=0 && lcol<board.length){
            if(board[lrow][lcol]=='Q'){
                return false;
                

            }
            lrow--;
            lcol++;
        }
        int rrow=row+1;
        int rcol=col-1;
        while(rrow<board.length && rcol>=0){
            if(board[rrow][rcol]=='Q'){
                return false;
                

            }
            rrow++;
            rcol--;
        }

        return true;

    }
    public static void print(char[][]board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    public static void solve(char board[][],int n,int row){
        if(row==n){
            print(board);
            System.out.println();
            
            return;
        }
        for(int j=0;j<n;j++){
            if(isSafe(row,j,board)){
                board[row][j]='Q';
                solve(board, n, row+1);
                board[row][j]='.';
                
            }
        }
    }
    public static void main(String[] args) {
        char board[][]=new char[4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                board[i][j]='.';
            }
        }
        solve(board,4,0);
        
    }
    
}
