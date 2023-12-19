public class FibDp {
    public static int Fibanacci(int n,int dp[]){
        // dp[]=new int[n+1];
        if(n==0||n==1){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]=Fibanacci(n-1,dp)+Fibanacci(n-2,dp);
        return dp[n];
        }
        public static void main(String[] args) {
            int n=5;
            int dp[]=new int[n+1];
            System.out.println(Fibanacci(n,dp));
        }
    }
    

