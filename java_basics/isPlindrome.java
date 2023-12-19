import java.util.*;
public class isPlindrome {
    public static boolean isPlindrome(int num){
        int plindrome=num;
        int rev=0;
        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;

        }
        if(plindrome==rev){
            return true;
        }
        else{
            return false;
        }
        
}
       public static void main(String[] args) {
        System.out.println("enter the number");
       Scanner sc=new Scanner(System.in);
           int num=sc.nextInt();
           if(isPlindrome(num)){
            System.out.println("the number "+num+ " is plindrome");
           }
           else{
            System.out.println("the number "+num+" is not plindrome");
           }
    
    }

    
}
