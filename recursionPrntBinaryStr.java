public class recursionPrntBinaryStr {
    public static void main(String[] args) {
        prntBinString(3, 0, "");
    }
    public static void prntBinString(int n,int lastplace,String str){
       //base case
       if(n==0){
        System.out.println(str);
        return;
       }
       
       
        //kaam
        prntBinString(n-1, 0, str+"0");
        if(lastplace==0){
            prntBinString(n-1, 1, str+"1");
        }
    }
}
//paytm 