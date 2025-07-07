package ArrayProblems;

    public class Matrix {
        public static boolean isDiagonal(int arr[][]){
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[0].length;j++){
                    if(i==j){
                        if(arr[i][j]==0){
                            return false;
    
                        }
                        
                    }
                    else{
                        if(arr[i][j]!=0){
                            return false;
                        }
                    }
    
                }
                
    
            }
            return true;
        }
        public static boolean isLowerTriangle(int arr1[][]){
            int n=arr1.length;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i>=j){
                        if(arr1[i][j]==0){
                            return false;
                        }
                    }
                    else{
                        if(arr1[i][j]!=0){
                            return false;
                        }
                    }
                }
            }
            return true;
    
        }
        public static boolean isUpperTriangle(int arr2[][]){
            int n=arr2.length;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i<=j){
                        if(arr2[i][j]==0){
                            return false;
                        }
                    }
                    else{
                        if(arr2[i][j]!=0){
                            return false;
                        }
                    }
                }
            }
            return true;
    
        }
        public static boolean symmetric(int arr[][]){
          
           
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[0].length;j++){
                    if(arr[i][j]!=arr[j][i]){
                        return false;
                    }
    
                }
        }
        return true;
    
        }
        public static boolean teoplitz(int arr[][]){
            for(int i=1;i<arr.length;i++){
                for(int j=1;j<arr[0].length;j++){
                    if(arr[i][j]!=arr[i-1][j-1]){
                        return false;
                    }
    
                }
            }
            return true;
        }
    
    
    
        public static void main(String[] args) {
            
            
            int arr[][]={{3,0,0,0,0},{0,1,0,0,0},{0,0,3,0,0},{0,0,0,4,0},{0,0,0,0,5}};
            int arr1[][]={{1,7,9},{0,3,11},{0,0,5}};
            int arr2[][]={{1,0,0},{5,3,0},{6,9,7}};
            int arr3[][]={{2,3,6},{3,4,5},{6,5,9}};
            int arr4[][]={{1,2,3,4},{5,1,2,3},{6,5,1,2},{7,6,5,1}};
    
            
            if(isDiagonal(arr)){
                System.out.println("It is a diagonal matrix");
            }
            else{
                System.out.println("It is not a diagonal matrix");
            }
            if(isLowerTriangle(arr2)){
                System.out.println("It is a lower traiangle matrix");
            }
            else{
                System.out.println("It is not a lower traiangle matrix");
    
            }
            if(isUpperTriangle(arr1)){
                System.out.println("It is a upper traiangle matrix");
    
            }
            else{
                System.out.println("It is not a upper traiangle matrix");
            }
            if(symmetric(arr3)){
                System.out.println("it is a symmetric matrix");
            }
            else{
                System.out.println("It is not a symmetric matrix");
            }
            if(teoplitz(arr4)){
                System.out.println("It is a teoplitz matrix");
            }
            else{
                System.out.println("It is not a teoplitz marix");
            }
               
        }
        
    }
    
    

