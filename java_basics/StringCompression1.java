public class StringCompression1 {
    public static String strCompression(String str1){
       StringBuilder str= new StringBuilder("");
        for(int i=0;i<str1.length();i++){
            int count=1;
            while(i<str1.length()-1 && str1.charAt(i)==str1.charAt(i+1)){
                count++;
                i++;
            }
            str.append(str1.charAt(i));
            if(count > 1){
                str.append(count);
            }
            
        }
        return str.toString();
    }
    public static void main(String[] args) {
        String str="aaaabbbccc";
        System.out.println(strCompression(str));
    }
    
}
