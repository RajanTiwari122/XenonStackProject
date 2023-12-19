public class Power_Of_number {
    public static int Find_Pow(int x,int n){
        if(n==1){
            return x;
        }
        return x*Find_Pow(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println(Find_Pow(2, 10));
    }
    
}
