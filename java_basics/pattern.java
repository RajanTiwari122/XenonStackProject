public class pattern {
    public static int ptr(int a){
        int prod =1;
        for(int i=1;i<=a;i++){
            prod*=i;
        }
        return prod;
    }
    public static int binomialc(int a,int b){
        int d=ptr(a);
        int e =ptr(b);
        int c=ptr(a-b);
        int bc=d/(e*c);
        return bc;
    }


    
    public static void main(String[] args) {
        int a=6;
        int b=4;
      int c= binomialc(a,b);
       System.out.println("binomial is = " + c);



    }
    
}
