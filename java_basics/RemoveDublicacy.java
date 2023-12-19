public class RemoveDublicacy {
    public static void Remove_Dublicate(String str,int idx, StringBuilder newStr,boolean map[] ){
        
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(idx);
        if((map[currChar-'a'])==true){
             Remove_Dublicate(str, idx+1, newStr, map);
        }else{
            map[currChar-'a']=true;
            Remove_Dublicate(str, idx+1, newStr.append(currChar), map);

             }

        
    }
    public static void main(String[] args) {
        String str="aaapppnacolllege";
        
        Remove_Dublicate(str, 0, new StringBuilder(""),new boolean[26]);
    }
    
}
