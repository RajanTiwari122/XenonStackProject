public class ReverseString {
    public static void reverseTheString( String str){
        char ch[] =str.toCharArray();
        int s=0;
        for(int i=0;i<ch.length;i++){
            while(ch[i]==' '){
                Swapp(s, i-1, ch);
                s=i+1;
            }
        }
        
    }
    // Helper Method
public static char[] Swapp(int start , int end , char[] ch){
    while(start<end){
        char temp =ch[start];
        ch[start]=ch[end];
        start++;
        end--;
    }   
    return ch;
}
}
