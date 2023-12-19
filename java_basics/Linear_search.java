public class Linear_search {
    public static int Linear_search(String num[],String key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        String numbers[]={"dosa","samosa","burger","pizza"};
        String key="burger";
      int returns=  Linear_search(numbers, key);
        if(returns == -1){

            System.out.println("not found");
        }
        else{
            System.out.println("the "+key+" is at index "+returns);
        }
    }
    
}
