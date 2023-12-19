public class isPrime {
    public static boolean isprimee( int n){
             boolean isprime= true;
            if(n==2){
                return true;
            }
            else{
            for(int i=1;i<=n-1;i++){
                if(n%2==0){
                    isprime =false;
                    return isprime;
                }
            }
        
        }
        return isprime;
    }
 
    
    public static void main(String[] args) {
        isprimee(5);
        System.out.println(isprimee(12));
    }
    
}
