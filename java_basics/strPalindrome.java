public class strPalindrome {
    public static boolean CheckPalindrome(String str){
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;

            }
           
        }
        return true;

    }
    public static void main(String[] args) {
        String fullname ="noon";
       if(CheckPalindrome(fullname)==true){
        System.out.println("the string is palindrome");
       
       } else{
        System.out.println("the string is not a palindrome");

        }
       
    }
    
}
