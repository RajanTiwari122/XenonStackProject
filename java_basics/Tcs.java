public class Tcs {
    public static int Problem(int x,int n1,int n2){
        if(n1>=n2){
            return -1;
        }
        int diff=n2-n1;
        if(x%diff>=0){
            return (x/diff)+1;
        }
        // else if(x%diff>0){
        //      return (x/diff)+1;
       // }
        else{
            return -1;
        }

    }
    public static void main(String[] args) {
       System.out.println(Problem(1, 5, 4)); 
    }
    
}
