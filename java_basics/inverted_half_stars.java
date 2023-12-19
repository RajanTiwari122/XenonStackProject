public class inverted_half_stars {
    public static void invertedStar(int n){
       for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
         for(int j=1;j<=i;j++){
            System.out.print("*");
         }
         System.out.println();
       }
    }
    public static void main(String[] args) {
        invertedStar(10);
    }
        
}


        
    

