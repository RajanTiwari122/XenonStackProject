public class FriendPairing {
    public static int friend_pairing(int n){
        if(n==1||n==2){
            return n;
        }
        int singleChoice=friend_pairing(n-1);
        int pairChoice=(n-1)*friend_pairing(n-2);
        int totways=singleChoice+pairChoice;
        return totways;
    }
    public static void main(String[] args) {
        System.out.println(friend_pairing(3));
    }
    
}
