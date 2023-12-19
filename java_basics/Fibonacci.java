public class Fibonacci {
    public static int Fibo(int n){
        if(n==1){
            return 1;
        }
        else if(n==0){
            return 0;

        }
        return Fibo(n-1)+Fibo(n-2);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println("The fibonacci of "+n+"th is:"+Fibo(n));
    }
    
}
