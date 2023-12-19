import java.util.*;
public class isEven {
   public static boolean isEven(int n) {
     boolean even=false;
     if(n%2==0){
        even=true;
     }
     return even;
   }
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
       if(isEven(n)==true){
        System.out.println("number is even");

       }
       else{
        System.out.println("number is odd");
       }
    }
}
