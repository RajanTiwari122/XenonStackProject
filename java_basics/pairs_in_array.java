public class pairs_in_array {
    public static void pairs_in_array(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("( "+numbers[i]+","+numbers[j]+") ");
            }
            System.out.println();
        }
       
    }
    public static void main(String[] args) {
        int numbers[]={1,3,4,6,8,9};
        pairs_in_array(numbers);
    }
    
}
