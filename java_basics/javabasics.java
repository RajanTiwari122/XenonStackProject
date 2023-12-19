import java.util.*;
public class javabasics {
    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
        int income=sc.nextInt();

         
         if (income<500000) {
            int tax=0;
            System.out.println(tax);}
            else if(income>500000 && income<1000000){
                int tax= (int) (income*(0.2));
                System.out.println("chuna="+tax);
            
            
         } else {
            int tax=(int) (income*(0.30));
            System.out.println("chuna="+tax);
            
         
         }
          
          
        


    }
}