public class recursionTilling {
    public static void main(String[] args) {
        System.out.println(tillingProblem(3));
    }
    public static int tillingProblem(int n){    //2 x n (floor size)
   //base case
   if(n==0 || n==1){
    return 1;
   }
   //kaam
   //vertical
   int fnm1=tillingProblem( n-1);   //vertical tile

   //horizontal
   int fnm2=tillingProblem(n-2);    //horizontal

   //total ways
   int totWays=fnm1+fnm2;
   return totWays;

    }
}
