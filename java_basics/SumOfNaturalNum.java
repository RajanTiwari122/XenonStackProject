public class SumOfNaturalNum {
    static int SumOf(int n){
        if(n==1){
            return 1;
        }
        int sum=n+SumOf(n-1);
        return sum;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println("The sum of "+n+" natural number is "+SumOf(n));
    }
    
}
