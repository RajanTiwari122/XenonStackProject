public class TilingProblem {
    public static int TilProb(int n){
        if(n==0||n==1){
            return 1;
        }
        int vertical=TilProb(n-1);
        int horizontal=TilProb(n-2);
        int TotWays=vertical+horizontal;
        return TotWays;
    }
    
    public static void main(String[] args) {
        System.out.println(TilProb(9));
    }
}
