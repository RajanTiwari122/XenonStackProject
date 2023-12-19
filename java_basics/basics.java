import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            if (a>b) {
                System.out.println("a is larger");
            } else {
                System.out.println("b is larger");
            }
      // System.out.println("hello world");
        }
    }
    
}
