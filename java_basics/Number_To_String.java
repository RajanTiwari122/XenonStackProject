public class Number_To_String {
    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void PrintEnglish(int number){
        if(number==0){
            return;
        }
        int numberInx=number%10;
        PrintEnglish(number/10);
        System.out.print(digits[numberInx]+" ");
       
    }
    public static void main(String[] args) {
        PrintEnglish(1933);
    }
}
