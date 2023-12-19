public class staircaseSearch {
    public static boolean staircaseSearch(int matrix[][],int key){
        int r=0;
        int c=matrix[0].length-1;
        while(r<matrix.length && c>=0){
            if(matrix[r][c]==key){
                System.out.println("the key is found at ("+r+","+c+")");
                return true;
            }
                else if(matrix[r][c]<key){
                    r++;
                }
                else{
                    c--;
                }

            
        }
        return false;

    }
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45,},
                        {27,29,37,48},
                        {32,33,39,50}};
                        staircaseSearch(matrix,33);
    }
    
}
