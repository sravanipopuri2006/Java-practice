package WordSearch;
public class WordSearch {
    public static boolean search(int i,int j,char words[][],String str,int c){
        if(c==str.length()){
            return true;
        }
        if(i<0 || j<0 ||i>=words.length|| j>=words.length|| words[i][j]!=str.charAt(c)){
            return false;
        }
        char ch=str.charAt(c);
        words[i][j]='#';
        boolean op1=search(i+1, j, words, str, c+1);
        boolean op2=search(i-1, j, words, str, c+1);
        boolean op3=search(i, j-1, words, str, c+1);
        boolean op4=search(i, j+1, words, str, c+1);
        words[i][j]=ch;
        return op1||op2||op3||op4;

    }
    public static boolean helper() {
        char words[][]={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String str="ABCCED";
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[0].length;j++){
                if(words[i][j]==str.charAt(0)){
                    if(search(i,j,words,str,0)){
                        return true;
                    }
                }
            }
        }
        return false;

    }
    public static void main(String[] args) {
        System.out.println(helper());
    }
    
}
