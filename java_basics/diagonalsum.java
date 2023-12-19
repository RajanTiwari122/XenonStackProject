public class diagonalsum {
    public static int diagonalsum1(int matrix[][]){
        int n=matrix.length;
        int m=matrix[0].length;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==j){
                    sum+=matrix[i][j];
                }
                else{
                    continue;
                }
            }
        }
            return sum;
        }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
                      System.out.println("the sum of the diagonal is "+ diagonalsum1(matrix)); 
        
    }
    
}
