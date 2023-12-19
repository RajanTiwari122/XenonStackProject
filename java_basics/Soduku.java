public class Soduku {
    public static boolean isSafe(int sodoku[][],int row,int col,int digit){
        // vertical check
        for(int i=0;i<sodoku.length;i++){
            if(sodoku[i][col]==digit){
                return false;
            }

        }
        // horizontal check
         for(int j=0;j<sodoku.length;j++){
            if(sodoku[row][j]==digit){
                return false;
            }
    }
    //grid check
    int sr= (row/3)*3;
    int sc=(col/3)*3;
    for(int i=sr;i<sr+3;i++){
        for(int j=sc;j<sc+3;j++){
            if( sodoku[i][j]==digit){
                return false;
            }
           
        }
    }
        return true;
}  
    public static boolean SodukuSolver(int sodoku[][],int row,int col){
        if(row==9){
            return true;
        }

        int newRow=row;
        int newCol=col+1;
        if(col+1==9){
          newRow=row+1;
          newCol=0;     
        }

        if(sodoku[row][col] !=0 ){
            return SodukuSolver(sodoku, newRow, newCol);
        }

        for(int digit=1;digit<=9;digit++){
            if(isSafe(sodoku,row ,col,digit)){
               sodoku[row][col]=digit;
               if(SodukuSolver(sodoku, newRow, newCol)){
                return true;
               }
               sodoku[row][col]=0;
            }
        }
        return false;
    }
    

public static void PrintSodoku(int sodoku[][]){
    for(int i=0;i<=8;i++){
        for(int j=0;j<=8;j++){
            System.out.print(sodoku[i][j]+" ");
        }
        System.out.println();
    }
}

public static void main(String[] args) {
    int sodoku[][]={{0,0,8,0,0,0,0,0,0},
{0,0,3,0,0,4,1,9,0},
{1,8,5,0,6,0,0,2,0},
{0,0,0,0,2,0,0,6,0},
{9,6,0,4,0,5,3,0,0},
{0,3,0,0,7,2,0,0,4},
{0,4,9,0,3,0,0,5,7},
{8,2,7,0,0,9,0,1,3}};

if(SodukuSolver(sodoku,0, 0)){
    System.out.println("sol exists");
    PrintSodoku(sodoku);
}
else{
    System.out.println("sol not exist");
}

}
}
