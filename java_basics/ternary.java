
import java.util.*;
public class ternary {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
        
       // int number =1;
        //int sum=0;
        System.out.println("enter the number :");
        int b=sc.nextInt();
          boolean isprime=true;
        for(int i=2;i<=(b-1);i++ ){
            if(b%i==0){
                isprime=false;
                break;
              
            }
            else{
                   continue;
            }  
            
            }
            
        if (isprime==true) {
            System.out.println("prime");
        } else {
            System.out.println(" not prime");
        }
        
        
    }
}