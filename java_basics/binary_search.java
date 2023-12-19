public class binary_search {
    public static int binary_search1(int number[],int key){
        int start =0;
        int end =number.length-1;
        
        while(start<=end){
            int mid=(start+end)/2;
            if(key==number[mid]){
                return mid;
            }
            else if(key>number[mid]){
                start =mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;

        }
        public static void main(String[] args) {
            int numbers[]={12,3,2,13,4,7,9,6,11};
            int key=7;
            int n=binary_search1(numbers, key);
            System.out.println("the index of the "+key+" is:"+n);
        }
    }
    

