public class BtoD {
  public static void  BinaryToDecimal(int n){
           int mynum=n;
          int pow=0;
          int lastD;
          int dec=0;
          while(n>0){
            lastD=n%10;
            dec=dec+(lastD*(int)Math.pow(2, pow));
            n=n/10;
            pow++;
          }
          System.out.println("decimal of "+mynum+"= "+dec);

    }
    public static void main(String[] args) {
        BinaryToDecimal(111) ;  
    }
}
