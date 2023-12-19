public class print_subarrays {
    public static void pairs_in_array1(int numbers[]){
        
        int sum=0;
        int max_sum=Integer.MIN_VALUE;
        int prefix[]= new int [numbers.length];
        prefix[0]=numbers[0];

        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                sum=start==0?prefix[end]:prefix[end]-prefix[start-1];
                System.out.println("the sum is :"+sum);
                if(max_sum<sum){
                    max_sum=sum;
                }
                sum=0;
                
                System.out.println();
            }
            System.out.println();
           
            
        }
        System.out.println("the max sum is:"+max_sum);
        
        }
        
    
    public static void main(String[] args) {
        int numbers[]={1,3,5,7};
        pairs_in_array1(numbers);
        
    }

  
}
