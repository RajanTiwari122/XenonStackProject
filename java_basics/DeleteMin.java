public class DeleteMin {
    public static int deleteStr( String str){
        if(str.length()==0||str.length()==1){
            return 0;
        }
       
        int i=0;
        int j=str.length()-1;
        int count=0;
        boolean isUnique =true;
        while(i<j){
            if(str.charAt(i)==str.charAt(j)){
                isUnique=false;
                break;
            }
            i++;
            j--;
        }
        while(i<j){
             if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
             }
             else{
                 
                 int k=i+1;
                 int m=j-1;
                 if(str.charAt(i)==str.charAt(m)&&i<m){
                    count++;
                    j--;
                 }
                 else if(str.charAt(k)==str.charAt(j)&& k < j){
                    count++;
                    i++;
                 }
                 else{
                    count++;
                    i++;
                    j--;
                 }
             }
        }
        if(count==str.length() || isUnique==true){
            count=str.length()-1;
        }
        return count;
    }
    public static void main(String[] args) {
        String str="abcdefg";
        System.out.println(deleteStr(str));
    }
    
}
