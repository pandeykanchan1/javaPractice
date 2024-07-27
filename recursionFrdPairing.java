public class recursionFrdPairing {
    public static void main(String[] args) {
        System.out.println(friendsPairring(3));
        
    }
    public static int friendsPairring(int n){
        if(n==1 || n==2){
            return n;
        }
        //choice
        //single
        int fnm1=friendsPairring(n-1);
        
        //pair
        int fnm2=friendsPairring(n-2);
        int pairways=(n-1)*fnm2;

        //totalWays
        int totalWays=fnm1+pairways;
    return totalWays;
    }
    
}
//goldmanSachs