import java.util.*;
public class CountVowels {
    public static void LowerVowels(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }
        
        }
        
        System.out.println("Number of vowels are: "+ count);
    }
    public static void main(String[] args) {
      String str=new Scanner(System.in).nextLine();
    
      LowerVowels(str);
    }
    
}
