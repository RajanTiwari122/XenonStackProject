public class num_recur {
      static void dec_fun(int n){
        
        if(n==1){
            System.out.print(n+" ");
            return; 
        }
        
        dec_fun(n-1);
        System.out.print(n+" ");
     
    }
    public static void main(String[] args) {
        dec_fun(10);
    }
    
}
